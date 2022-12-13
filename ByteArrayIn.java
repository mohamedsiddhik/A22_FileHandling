

package fileHandling;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayIn {
    public static void main(String[] args) throws IOException {
        byte[] byt = {115, 105, 100, 100, 104, 105, 107};

        // Create the new byte array input stream
        ByteArrayInputStream bin = new ByteArrayInputStream(byt);
        int k = 0;
        while ((k = bin.read()) != -1) {
            //Conversion of a byte into character
            char ch = (char) k;
            System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
        }
    }
}