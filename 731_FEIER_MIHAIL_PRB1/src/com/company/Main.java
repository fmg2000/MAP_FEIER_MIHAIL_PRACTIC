package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Unternehmen> list = new ArrayList<>();

    public  void constructObject(String[] row)
    {

        Unternehmen Object = new Unternehmen(Integer.parseInt(row[0]),row[1], Integer.parseInt(row[2]), Integer.parseInt(row[3]),Integer.parseInt(row[4]));
        list.add(Object);


    }
    public void readFile(File file)
    {
        try (Scanner sc = new Scanner(file)) {

            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] row = line.split("&&");
                constructObject(row);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writefile(File file, List<Unternehmen> newList) {
        try {
            FileWriter myWriter = new FileWriter(file);
            for(Unternehmen i : newList)
                myWriter.write(Integer.toString(i.getId()) + ',' + i.getReiseziehl()+ ','+ i.getPreis_person() + ','+i.getMaximum_anzhal()+','+ i.getTeilnehmer() +'\n');
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void sortAnzhal(List<Unternehmen> list, File file) {
        List<Unternehmen> newlist = list;
        newlist.sort(new Comparator<Unternehmen>() {
            @Override
            public int compare(Unternehmen o1, Unternehmen o2) {
                return o2.getTeilnehmer() - o1.getTeilnehmer(); //int
            }
        });

        for(Unternehmen i: newlist)
            System.out.println(i.toString());

        writefile(file, newlist);
    }

    //(anzahl_teilnehmer/max_anzahl_teilnehmer)*100
    public void statistic(List<Unternehmen> list, File file) {
        List<Unternehmen> newlist = list;

        newlist.sort(new Comparator<Unternehmen>() {
            @Override
            public int compare(Unternehmen o1, Unternehmen o2) {
                return (o1.getTeilnehmer()/o1.getMaximum_anzhal())*100 -(o1.getTeilnehmer()/o1.getMaximum_anzhal())*100;
            }
        });

        String s;
        List<String> newListstatistic = new ArrayList<>();
        for (Unternehmen i : newlist) {
            System.out.println((double)i.getTeilnehmer()/i.getMaximum_anzhal());
            s = i.getReiseziehl() + " : " + ((double)i.getTeilnehmer()/i.getMaximum_anzhal())*100;
            newListstatistic.add(s);
        }


        try {
            FileWriter myWriter = new FileWriter(file);
            for (String i : newListstatistic)
                myWriter.write(i + '\n');
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main c = new Main();
        c.readFile(new File("kundendaten.txt"));
        c.sortAnzhal(list,new File("ausflügesortiert.txt"));
        c.statistic(list,new File("statistik.txt"));
    }
}
