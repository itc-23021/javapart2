package chapter7_1;

import chapter7_2.Joining;

public class Sample1 {
    public static void main(String[] args) {

        Joining j = new Joining("" ,",");
        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getCsv());
    }
}
