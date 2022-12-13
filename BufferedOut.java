


package fileHandling;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOut
{
    public static void main(String[] args) {
        String data = "This is an example of BufferedStream";
        try {
            //creating a fileOnputStream file
            FileOutputStream fout = new FileOutputStream("D:/test/Buffered2.txt");
            //create a BufferedOutputStream File
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            byte[] array= data.getBytes();
            bout.write(array);
            bout.close();
            System.out.println("Success...");
        }

        catch (Exception e){
            e.getStackTrace();
        }
    }
}