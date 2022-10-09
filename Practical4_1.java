import java.io.*;
import java.util.*;

public class Practical4_1
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
 
        try
        {
            sourceStream = new FileInputStream("C:\\Users\\krishana\\eclipse-workspace\\Practical_5_4.txt");
            targetStream = new FileOutputStream ("C:\\Users\\krishana\\eclipse-workspace\\copy.txt");
 
            // reading from Practical_5_4.txt and writing in copy.txt and printing the byte in the program
            int temp;
            while ((temp = sourceStream.read()) != -1)
            {
                targetStream.write((byte)temp);
            }
                
        }
        finally
        {
            // closing the file if it is null
            if (sourceStream != null)
            {
                sourceStream.close();
            }
                            
            if (targetStream != null)   
            {
                targetStream.close();   
            }       
                        
        }
        System.out.println("ID : 21CE142 \nName : Krishna M. Thakor");
    }
}
