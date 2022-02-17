package com.company;

import Model.Mitarbeiten;
import Model.Team;
import Repo.RepoMitarbeiten;
import Repo.RepoTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mitarbeiten p1 = new Mitarbeiten("aaa", 12);
        Mitarbeiten p2 = new Mitarbeiten("baa", 16);
        Mitarbeiten p3 = new Mitarbeiten("bbbb", 23242);

        List<Mitarbeiten> listMitarbeiten = new ArrayList<>();
        listMitarbeiten.add(p1);
        listMitarbeiten.add(p3);
        listMitarbeiten.add(p2);
        RepoMitarbeiten rp1 = new RepoMitarbeiten(listMitarbeiten);

        List<Mitarbeiten> listMiarbeiten1 = new ArrayList<>();
        listMiarbeiten1.add(p1);
        listMiarbeiten1.add(p3);

        Team b1 = new Team("Salut", "Str asas", listMitarbeiten);
        Team b2 = new Team("Hello", "asdasda", listMiarbeiten1);

        List<Team> listTeam = new ArrayList<>();
        listTeam.add(b1);
        listTeam.add(b2);
        RepoTeam rb1 = new RepoTeam(listTeam);

        Scanner sc = new Scanner(System.in);


        Mitarbeiten p4 = new Mitarbeiten("CCCC", 2000);
       // rp1.addMitarbeiten();
        //System.out.println(rp1.toString());
        rp1.deleteMitarbeiten();
        System.out.println(rp1.toString());
        rp1.updateMitarbeiten();
        rp1.toString();
        rb1.addTeam(listMitarbeiten);
        rb1.toString();
        rb1.updateTeam(listMitarbeiten);
        rb1.toString();
        rb1.deleteTeam();
        rb1.toString();
        List<Team> newListTeam =  rb1.filter(p1);
        System.out.println(newListTeam.toString());



        System.out.println(rb1.getListTeam());





    }


}
