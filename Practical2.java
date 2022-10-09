import java.util.*;
import java.io.*;
//ID : 21CE142
//Name : Krishna M. Thakor
// Aim : When to use Character Stream over Byte Stream? When to use Byte Stream over Character
// Stream? Give example.

public class Practical2 
{
    public static void main(String[] args) throws IOException
    {
        FileReader sourceStream = null;
        try
        {
            sourceStream = new FileReader("C:\\Users\\krishana\\eclipse-workspace\\Character.txt");
            
            // reading from the file character by character
            int temp;
            while ((temp = sourceStream.read()) != -1)
            {
                System.out.println((char)temp);
            }
                    
        }
        finally
        {           
                // closing stream 
                if (sourceStream != null)   
                {
                    sourceStream.close();
                }       
                                
        }
        
        System.out.println("ID : 21CE142 \nName : Krishna M. Thakor");
    }
}

		

	