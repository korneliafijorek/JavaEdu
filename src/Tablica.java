public class Tablica {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Kornelia";
        imiona[1] = "Patryk";
        imiona[2] = "Kotek";

        for(int i = 0; i < imiona.length; i++){
            System.out.println(imiona[i]);
        }

        int[] lottoNumbers = new int[] {1,2,3,4,5,6};
        for(int i = 0; i<lottoNumbers.length; i++){
            System.out.println(lottoNumbers[i]);
        }


    }
}
