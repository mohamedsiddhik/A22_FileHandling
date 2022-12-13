

package fileHandling;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOut
{
    static  int c = 10;
    int t = 5;
    public static void main(String[] args) throws IOException {
        DataOut data = new DataOut();
//        System.out.println(data.e);
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("D:/test/dataExample.txt"));
        dout.writeInt(5);
        dout.writeInt(10);
        dout.writeInt(26);
        dout.writeChar('A');
        dout.writeDouble(87.65);
        dout.close();

//        System.out.println(c);


    }
}