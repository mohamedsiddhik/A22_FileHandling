

//checking a file

package fileHandling;

import java.io.File;

public class File1
{
    public static void main(String[] args) {
        File file = new File("D:/test/test.txt");
        if (file.exists()){
            System.out.println("File exists");
        }else {
            System.out.println("File does not exists");
        }
    }
}