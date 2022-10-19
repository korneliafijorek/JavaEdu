import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię.");
        int age = scanner.nextInt();
        if(age < 18){
            System.out.println("Nie możesz kupić alkoholu!");
        }
        else {
            System.out.println("Dziękuję za zakup. :)");
        }
    }
}
