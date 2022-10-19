import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();


        int result1 = firstNumber+secondNumber;
        System.out.println("Suma podanych liczb to:  " + result1);
        int result2 = firstNumber-secondNumber;
        System.out.println("Różnica podanych liczb to:  " + result2);
        int result3 = firstNumber*secondNumber;
        System.out.println("Iloczyn podanych liczb to:  " + result3);

    }
}
