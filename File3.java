

// write a file

package  fileHandling;

import java.io.File;
import java.io.FileWriter;

public class File3
{
    public static void main(String[] args) {
        try {
            File file = new File("D:/test/test2.txt");
            if (file.createNewFile()){
                System.out.println("File created");
            }
            else {
                System.out.println("File exists");
            }
        }catch (Exception e){
            System.out.println("Error");
        }

        try {
            FileWriter fileWriter=new FileWriter("D:/test/test2.txt");
            fileWriter.write("Mohamed Siddhik. ");
//            fileWriter.close();
            fileWriter.append(" \n Learning Java");
            fileWriter.close();
        }catch (Exception e){
            System.out.println("Error");
        }


    }
}