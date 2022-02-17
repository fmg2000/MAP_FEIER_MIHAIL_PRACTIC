package Repo;

import Model.Mitarbeiten;
import Model.Team;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepoTeam {

    private List<Team> listTeam;
    private Scanner sc = new Scanner(System.in);

    public RepoTeam(List<Team> listTeam) {
        this.listTeam = listTeam;
    }

    public List<Team> getListTeam() {
        return listTeam;
    }

    public void setListTeam(List<Team> listTeam) {
        this.listTeam = listTeam;
    }

    public void addTeam(List<Mitarbeiten> mitarbeiten)
    {
        System.out.println("Add Mitarbeiten\n  Adugati nume: ");
        String name = sc.next();
        System.out.println("add ProjectName");
        String projectName = sc.next();
        Team item = new Team(name,projectName,mitarbeiten);
        listTeam.add(item);
    }
    public void updateTeam(List<Mitarbeiten> mitarbeiten)
    {
        System.out.println("update team name: ");
        for (Team i : listTeam)
            if(i.getProjectname().equals(sc.next())) {
                System.out.println("Name update");
                i.setName(sc.next());
                System.out.println("Projectname update: ");
                i.setProjectname(sc.next());
                System.out.println("List mitarbeiten");
                i.setListMitarbeiten(mitarbeiten);
            }
    }

    public void deleteTeam()
    {
        System.out.println("delete team \n ProjectName ");
        for (Team i : listTeam)
            if(i.getProjectname().equals(sc.next()))
                listTeam.remove(i);
    }
    public List<Team> filter(Mitarbeiten item)
    {
        List<Team> newList = new ArrayList<>();
        for(Team i : listTeam)
            if(i.getListMitarbeiten().contains(item))
                newList.add(i);

        return newList;
    }

    @Override
    public String toString() {
        return "RepoTeam{" +
                "listTeam=" + listTeam +
                '}';
    }
}
