import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExeptions {

    public static void main(String[] args){
        try {
            System.out.println("Before reading file");
            readFile("/Users/korne/Desktop/JavaEdu/src/tessst.txt");
            System.out.println("Closing file");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
            //System.out.println(e.getStackTrace());
            //throw new RuntimeException(e);
        } finally {
            System.out.println("Closing file");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);

    }
}
