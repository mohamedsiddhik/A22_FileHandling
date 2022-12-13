

package fileHandling;

import java.io.File;
import java.util.Scanner;

public class File4
{
    public static void main(String[] args) {
        try {
            File file = new File("D:/test/test2.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()){
                System.out.println(in.nextLine());
            }

        }catch (Exception e){
            System.out.println("Error");
        }
    }
}