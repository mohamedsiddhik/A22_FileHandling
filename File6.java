

// delete a file

package fileHandling;

import java.io.File;

public class File6 {
    public static void main(String[] args) {
        File file = new File("D:/test/test4.txt");
        if (file.delete()){
            System.out.println("The file is deleted ");
        }
        else {
            System.out.println("The file is not in exists");
        }
    }
}