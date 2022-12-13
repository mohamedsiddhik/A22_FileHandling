


package fileHandling;

import java.io.FileInputStream;

public class FileIn
{
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("D:/test/FileOut.txt");
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