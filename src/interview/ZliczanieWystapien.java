package interview;

import java.util.HashMap;
import java.util.Map;

public class ZliczanieWystapien {

    //int [] numbers = new int[] {1,2,3,2,5,2};
    public static void main(String[] args) {

        liczbyWystapienia(new int[] {1,2,3,2,5,2,3,3,3,3,3});


    }
    public static void liczbyWystapienia(int[] numbers){
        Map<Integer, Integer> occurences = new HashMap<>();
        for (int i=0; i< numbers.length; i++ ){
            if (occurences.containsKey(numbers[i])) {
                Integer value = occurences.get(numbers[i]);
                occurences.put(numbers[i], value+1);
            } else {
                occurences.put(numbers[i], 1);
            }
        }

        for (Integer key : occurences.keySet()){
            System.out.println("Liczba " + key + " wystepuje " + occurences.get(key));
        }
        System.out.println("Ilość elementów w mapie " + occurences.size());
    }
}
