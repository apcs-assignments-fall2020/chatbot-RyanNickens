import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scan.next();
        System.out.println("Hello, " + name + "! It's Nice to meet you!");

        System.out.print(name + ", what is your favorite color?");
        String color = scan.next();
        System.out.println("I quite enjoy " + color + " too!");

        System.out.print("What grade are you in?");
        String grade = scan.next();
        System.out.println("Grade " + grade + " is a tough one!");

        System.out.print("What is your favorite animal " + name + "?");
        String animal = scan.next();
        System.out.println("The " + animal + " is one majestic animal!");

        System.out.print("What is your least favorite food?");
        String food = scan.next();
        System.out.println("Yuck! " + food + " does not sound tasty!");



        scan.close();
    }
}
