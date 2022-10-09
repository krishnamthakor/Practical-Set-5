//ID : 21CE142
//Name : Krishna M. Thakor
// Aim : Write a program to transfer data from one file to another file so that if the destination
// file does not exist, it is created.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Practical3
{
    public static void main(String[] args) throws IOException
    {
        // creating a file
        File f1 = new File("C:\\Users\\krishana\\eclipse-workspace\\Practical_5_3.txt");
        f1.createNewFile();
                
        // creating an object for reading and writing the file
        FileInputStream input = new FileInputStream("C:\\Users\\krishana\\eclipse-workspace\\Practical_5_3.txt");
        FileOutputStream output = new FileOutputStream("C:\\Users\\krishana\\eclipse-workspace\\copy.txt");
        
        int temp;
        
        // copying from first file and writing in another file
        while((temp = input.read()) != -1) 
        {
            output.write((char) temp);
        }
        
        // closing both the files
        output.close();
        input.close();
        
        System.out.println("ID : 21CE142 \nName : Krishna M. Thakor");
    }    
}
