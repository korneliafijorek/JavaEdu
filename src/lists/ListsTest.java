package lists;
import docs.PdfDocument;

import java.util.*;

public class ListsTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Karol"); //0
        names.add("Zuzia"); //1
        names.add("Olga");  //2
        names.add("Karol");

//        System.out.println(names.get(2));
//        System.out.println(names.indexOf("Karol"));
//        System.out.println(names.lastIndexOf("Karol"));
//        System.out.println(names.contains("Olga"));
//        System.out.println(names.size());
//        System.out.println(names.isEmpty());
//
//        List<Integer> numbers = new LinkedList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(4);
//        numbers.add(16);
//        System.out.println("Another list");
//        System.out.println(numbers.get(1));
//        System.out.println(numbers.indexOf(16));
//        System.out.println(numbers.lastIndexOf(16));
//        System.out.println(numbers.contains(4));
//        System.out.println(numbers.size());
//        System.out.println(numbers.isEmpty());
//
//        List<String> difrentNames = new ArrayList<>();
//        difrentNames.addAll(names);
//
//        List<PdfDocument> pdfDocuments = new ArrayList<>();
//        pdfDocuments.add(new PdfDocument());

        for(int i = 0; i< names.size(); i++){
            System.out.println(names.get(i));
        }
        System.out.println();


        for(String name : names){
            System.out.println(name);
        }



    }
}
