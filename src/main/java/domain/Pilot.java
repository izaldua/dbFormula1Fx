package domain;

public class Pilot {
    //private int id;
    private String name;
    private String nationality;
    private int points;

    public Pilot(String name, String nat, int pts) {
        //this.id = id;
        this.name = name;
        this.nationality = nat;
        this.points = pts;
    }

    public void addPoints(int morePoints) {
        this.points += morePoints;
    }

    public int getId() { return id; }
    @Override
    public String toString() {
        return String.format("%d - %s (%s) - %d points", id, name, nationality, points);
    }
}

