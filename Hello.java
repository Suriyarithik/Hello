# Hello
import java.io.*;
import java.util.*;
public class Hello
 {
   public static void main(String args[])throws IOException
    { 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String a=br.readLine();
       for(int i=0;i<=a;i++)
       {
         System.out.println("Hello");
       }
    }
 }
