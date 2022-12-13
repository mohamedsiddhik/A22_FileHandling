

//Creating a file

package fileHandling;

import java.io.File;

public class File2
{
    public static void main(String[] args) {
        try {
            File file = new File("D:/test/test1.txt");
            if (file.createNewFile()){
                System.out.println("File Created");
            }
            else {
                System.out.println("File Exists");
            }
        }catch (Exception e){
            System.out.println("Error");
        }

    }
}