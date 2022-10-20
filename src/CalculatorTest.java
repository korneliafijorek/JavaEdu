import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę...");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę..");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int addition = calculator.add(firstNumber, secondNumber);
        int subtraction = calculator.sub(firstNumber, secondNumber);
        int multiplication = calculator.multi(firstNumber, secondNumber);
        int division = calculator.div(firstNumber, secondNumber);
        int modulo = calculator.mod(firstNumber, secondNumber);

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnożenia: " + multiplication);
        if(secondNumber!=0){
            System.out.println("Wynik dzielenia: " + division);
        } else {
            System.out.println("Nie można dzielić przez 0!");
        }
        System.out.println("Wynik modulo: " + modulo);
    }
}
