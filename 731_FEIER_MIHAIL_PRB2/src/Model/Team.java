package Model;

import java.util.List;

public class Team {

    private String name ;
    private String projectname;
    private List<Mitarbeiten> listMitarbeiten;

    public Team(String name, String projectname, List<Mitarbeiten> listMitarbeiten) {
        this.name = name;
        this.projectname = projectname;
        this.listMitarbeiten = listMitarbeiten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public List<Mitarbeiten> getListMitarbeiten() {
        return listMitarbeiten;
    }

    public void setListMitarbeiten(List<Mitarbeiten> listMitarbeiten) {
        this.listMitarbeiten = listMitarbeiten;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", projectname='" + projectname + '\'' +
                ", listMitarbeiten=" + listMitarbeiten +
                '}';
    }

}
