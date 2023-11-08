package exercise;

public class Rectangle {
    private double  tate;
    private double yoko;

    public Rectangle(double tate, double yoko) {
        super();
        this.tate = tate;
        this.yoko = yoko;
    }

    public double menseki() {
        return tate * yoko;
    }
}