//ID : 21CE142
//Name : Krishna M. Thakor
//Aim :  WAP to show use of character and byte stream.
 import java.io.FileInputStream;
 import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
 
 public class Practical4
 {
     public static void main(String[] args) throws IOException
     {
         FileReader sourceStream = null;
         try
         {
             sourceStream = new FileReader("C:\\Users\\krishana\\eclipse-workspace\\Practical_5_4.txt");
             
             // reading from the file character by character
             int temp;
             while ((temp = sourceStream.read()) != -1)
             {
                 System.out.println((char)temp);
             }
                     
         }
         finally
         {           
                 // closing stream as no longer in use
                 if (sourceStream != null)       
                 {
                     sourceStream.close();
                 }   
                             
         }
         
         System.out.println("ID : 21CE142 \nName : Krishna M. Thakor");
     }
 }
