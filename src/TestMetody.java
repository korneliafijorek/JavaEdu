public class TestMetody {
    public static void main(String[] args) {
        Metody metody = new Metody();
        //metody.policzWynik();
//        int result = metody.pobierzWynik();
//        int result2 = result*2;
//        System.out.println("Rezultat przed mnożeniem: " + result);
//        System.out.println("Rezultat po mnożeniu: " + result2);
        //metody.pobierzWynikParam(10);
        //metody.pobierzWynikParam(25);
        int result = metody.add(2,3, "Hello");
        System.out.println(metody.add(2,6, "Hello 2"));
        System.out.println(result);




    }
}
