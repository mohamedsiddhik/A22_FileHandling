
package fileHandling;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataIn
{

    public static void main(String[] args) throws IOException {
            DataIn data = new DataIn();


        DataInputStream din = new DataInputStream(new FileInputStream("D:/test/dataExample.txt"));
         int a = din.readInt();
        double d = din.readDouble();
        char ch = din.readChar();
        int e = din.readInt();
        int f = din.readInt();
        System.out.println(a + " " + d + " " + ch + " " + e + " " + f);



        din.close();
    }
}