


//checking the information


package fileHandling;

import java.io.File;

public class File5
{
    public static void main(String[] args) {
        File file = new File("D:/test/test2.txt");
        if (file.exists()){
            //getting a file name
            System.out.println("The name of the file is : " + file.getName());

            //getting a path name
            System.out.println("The absolute path of the file is : " + file.getAbsolutePath());

            //checking the file is writable or not
            System.out.println("is file Writable : " + file.canWrite());

            //checking the file is readable or not
            System.out.println("is file is Readable : " + file.canRead());

            //getting the length of the file byte
            System.out.println("The sixe of the file in bytes is : " + file.length());


        }else {
            System.out.println("file does not exists");
        }

    }
}