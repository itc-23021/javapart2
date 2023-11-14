package chapter7_7;
import  chapter6.Tax;
public class Sample2 {
    public static void main(String[] args) {
        Tax tax = new Tax(100, "田中", 300000, 100000);
        Tax mytax = tax;

        mytax.setNumber(200);
        System.out.println(tax);
        System.out.println(mytax);


    }
}
