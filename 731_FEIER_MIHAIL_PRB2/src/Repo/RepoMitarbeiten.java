package Repo;

import Model.Mitarbeiten;

import java.util.List;
import java.util.Scanner;

public class RepoMitarbeiten {

    private List<Mitarbeiten> listMiterbaiten;
    private Scanner sc = new Scanner(System.in);
    public RepoMitarbeiten(List<Mitarbeiten> listMiterbaiten) {
        this.listMiterbaiten = listMiterbaiten;
    }

    public List<Mitarbeiten> getListMiterbaiten() {
        return listMiterbaiten;
    }

    public void setListMiterbaiten(List<Mitarbeiten> listMiterbaiten) {
        this.listMiterbaiten = listMiterbaiten;
    }

    public void addMitarbeiten()
    {
        System.out.println("Add Mitarbeiten\n  Adugati nume: ");
        String name = sc.next();
        System.out.println("add lohn");
        double lohn = Integer.parseInt(sc.next());
        Mitarbeiten item = new Mitarbeiten(name,lohn);
        listMiterbaiten.add(item);
    }
    public void updateMitarbeiten()
    {
        System.out.println("update Mitarbeiten name: ");
        for (Mitarbeiten i : listMiterbaiten)
            if(i.getName().equals(sc.next())) {
                System.out.println("Name update:");
                i.setName(sc.next());
                System.out.println("lohn update: ");
                i.setLohn(Integer.parseInt(sc.next()));
            }
    }

    public void deleteMitarbeiten(String name){
        System.out.println("delete Mitarbeiten name: ");
        for (Mitarbeiten i : listMiterbaiten)
            if(i.getName().equals(sc.next()))
                listMiterbaiten.remove(i);
    }

    @Override
    public String toString() {
        return "RepoMitarbeiten{" +
                "listMiterbaiten=" + listMiterbaiten +
                '}';
    }
}
