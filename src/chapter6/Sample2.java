package chapter6;

public class Sample2 {
    public static void main(String[] args) {
        Tax tax =new Tax(100, "田中", 300000, 100000);

        System.out.println("控除額=" + tax.getKoujo());
    }
}
