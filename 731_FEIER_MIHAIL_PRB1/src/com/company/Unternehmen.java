package com.company;

public class Unternehmen {

    private int id;
    private String reiseziehl;
    private int preis_person;
    private int maximum_anzhal;
    private int teilnehmer;

    public Unternehmen(int id, String reiseziehl, int preis_person, int maximum_anzhal, int teilnehmer) {
        this.id = id;
        this.reiseziehl = reiseziehl;
        this.preis_person = preis_person;
        this.maximum_anzhal = maximum_anzhal;
        this.teilnehmer = teilnehmer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReiseziehl() {
        return reiseziehl;
    }

    public void setReiseziehl(String reiseziehl) {
        this.reiseziehl = reiseziehl;
    }

    public int getPreis_person() {
        return preis_person;
    }

    public void setPreis_person(int preis_person) {
        this.preis_person = preis_person;
    }

    public int getMaximum_anzhal() {
        return maximum_anzhal;
    }

    public void setMaximum_anzhal(int maximum_anzhal) {
        this.maximum_anzhal = maximum_anzhal;
    }

    public int getTeilnehmer() {
        return teilnehmer;
    }

    public void setTeilnehmer(int teilnehmer) {
        this.teilnehmer = teilnehmer;
    }

    @Override
    public String toString() {
        return "Unternehmen{" +
                "id=" + id +
                ", reiseziehl='" + reiseziehl + '\'' +
                ", preis_person=" + preis_person +
                ", maximum_anzhal=" + maximum_anzhal +
                ", teilnehmer=" + teilnehmer +
                '}';
    }
}
