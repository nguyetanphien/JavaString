package model;

public class Bai2 {
    public static void main(String[] args) {
        String string1 = "Java Exercises!";
        //2
        String string2 = "JAVA EXERCISES!";
        if (string1.equalsIgnoreCase(string2))
            System.out.println("2\nTrue");
        else System.out.println("2\nFalse");
    }
}
