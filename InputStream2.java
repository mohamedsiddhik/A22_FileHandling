


// read all characters

package fileHandling;

import java.io.FileInputStream;

public class InputStream2
{
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("D:/test/test2.txt");
            int i =0;
            while ((i =fin.read()) !=-1){
                System.out.println((char) i);
            }
            fin.close();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}