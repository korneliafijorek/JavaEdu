public class Metody {

    public void policzWynik(){
        System.out.println("Zaraz policzę wynik.");
        int result = 0;
        for (int i=0; i<100; i++){
            result = result + i;
        }
        System.out.println("Result to: " + result);
    }
    public int pobierzWynik(){
        System.out.println("Zaraz policzę wynik.");
        int result = 0;
        for (int i=0; i<100; i++){
            result = result + i;
        }
        //System.out.println("Result to: " + result);
        return result;
    }
    public int pobierzWynikParam(int range){
        System.out.println("Wartość zakresu to: " + range);
        System.out.println("Zaraz policzę wynik.");
        int result = 0;
        for (int i=0; i<range; i++){
            result = result + i;
        }
        System.out.println("Result to: " + result);
        return result;
    }

    public int add(int firstNumber, int secondNumber, String word) {
        //System.out.println("Suma to: " + (firstNumber+secondNumber));
        System.out.println(word);
        return firstNumber+secondNumber;

    }
}
