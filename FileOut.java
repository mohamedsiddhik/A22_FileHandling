

package fileHandling;

import java.io.FileOutputStream;

public class FileOut
{
    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("D:/test/FileOut.txt");
            fout.write(66);
            System.out.println("Success...");
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}