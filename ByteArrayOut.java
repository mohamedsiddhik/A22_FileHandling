

package fileHandling;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteArrayOut
{
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("D:/test/byteArray1.txt");
        FileOutputStream fout2 = new FileOutputStream("D:/test/byteArray2.txt");


        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(67);
        bout.writeTo(fout);
        bout.writeTo(fout2);
        bout.flush();
        bout.close();
        System.out.println("Success...");
    }
}