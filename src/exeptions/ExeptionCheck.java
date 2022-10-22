package exeptions;

import java.util.Scanner;

public class ExeptionCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek...");
        int age = scanner.nextInt();

        if (age < 0){
            try {
                throw new InvalidAgeExeption("Your age is not valid!");
            } catch (InvalidAgeExeption e) {
                throw new RuntimeException(e);
            }
        }else if(age >= 18){
            System.out.println("You are a adult!");
        } else {
            System.out.println("You are a child!");
        }

    }
}
