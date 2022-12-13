

package fileHandling;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileOut2
{
    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("D:/test/FileOut.txt");
            String s= "Welcome to Fileoutput Example";
            byte b[] = s.getBytes();
            fout.write(b);
            System.out.println("Success...");
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}