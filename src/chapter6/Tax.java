package chapter6;

import java.util.Objects;

public class Tax {
    private int number;
    private String name;
    private int shotoku;
    private int koujo;

    public Tax(int number, String name, int shotoku, int koujo) {
        this.number = number;
        this.name = name;
        this.shotoku = shotoku;
        this.koujo= koujo;
    }
    public int zeigaku(){
        return  (int) (shotoku - koujo)*0.1);
    }

    public int getKoujo() {
        return koujo;
    }

    public void setKoujo(int koujo) {
        this.koujo = koujo;
    }

    public int getShotoku() {
        return shotoku;
    }

    public void setShotoku(int shotoku) {
        this.shotoku = shotoku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Tax{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", shotoku=" + shotoku +
                ", koujo=" + koujo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tax tax = (Tax) o;
        return number == tax.number && shotoku == tax.shotoku && koujo == tax.koujo && Objects.equals(name, tax.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, shotoku, koujo);
    }
}

