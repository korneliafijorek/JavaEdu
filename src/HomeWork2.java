public class HomeWork2 {
    public static void main(String[] args) {
        for (int i=1; i <=100; i++){
            if (i%3 == 0){
                System.out.println("Liczba " + i + " jest podzielna przez 3.");
            }
        }

        int[] tablica = new int[] {1, 3, 5, 7, 2};
        /*
        int[] tablica2 = new int[tablica.length];

        for(int i=0; i< tablica.length; i++){
            tablica2[i] = tablica[tablica.length-1-i];

        }

        for(int i=0; i< tablica2.length; i++){
            System.out.println(tablica2[i]);
        }

         */
        for(int i=0; i<(tablica.length/2); i++){
            int temp = tablica[i]; //dla i=0
            tablica[i] = tablica[tablica.length-1-i]; // 4 -> 0
            tablica[tablica.length-1-i] = temp;
            System.out.println("Iteracja numer " + i);
        }
        for(int i=0; i< tablica.length; i++){
            System.out.println(tablica[i]);
        }

    }
}
