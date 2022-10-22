package files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if(file.delete()){
            System.out.println("We've deleted file.");
        }else {
            System.out.println("This file doesn't exist");
        }
    }
}
