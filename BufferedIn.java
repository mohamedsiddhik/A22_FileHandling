
package fileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedIn
{
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:/test/Buffered2.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i = bin.read();   //Read first byte from a file
            while (i!=-1){
                System.out.println((char) i);
                i = bin.read();       //  Read next byte from a file
            }
            bin.close();
        }catch (Exception e){
            System.out.println("Error");
        }

    }
}