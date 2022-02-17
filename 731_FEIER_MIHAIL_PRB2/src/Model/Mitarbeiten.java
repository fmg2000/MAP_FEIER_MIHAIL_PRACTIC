package Model;

public class Mitarbeiten {
    private String name;
    private double lohn;

    public Mitarbeiten(String name, double lohn) {
        this.name = name;
        this.lohn = lohn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLohn() {
        return lohn;
    }

    public void setLohn(double lohn) {
        this.lohn = lohn;
    }

    @Override
    public String toString() {
        return "Mitarbeiten{" +
                "name='" + name + '\'' +
                ", lohn=" + lohn +
                '}';
    }
}
