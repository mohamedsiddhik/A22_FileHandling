


//read first character

package  fileHandling;

import java.io.FileInputStream;

public class InputStream
{
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:/test/test2.txt");
            int i = fin.read();
            System.out.println((char) i);
            fin.close();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}