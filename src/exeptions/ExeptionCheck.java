package exeptions;

import java.util.Scanner;

public class ExeptionCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek...");
        int age = scanner.nextInt();
        if (age < 0){
            try {
                throw new ValidAgeValue("Podałeś ujemną liczbę!");
            } catch (ValidAgeValue e) {
                throw new RuntimeException(e);
            }
        }else if(age >= 18){
            System.out.println("Jesteś pełnoletni!");
        }

    }
}
