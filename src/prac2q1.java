
import java.util.Scanner;
import java.lang.Math;

public class prac2q1 {
    public static void displaySquareRoot(int max)
    {
        System.out.println("Number     SquareRoot");
        for(int i=0;i<max;i+=2)
        {
            System.out.printf("  %d         %.4f\n",i,Math.sqrt(i));
        }
         
        
    }
    public static void main(String[] args)
     {
         displaySquareRoot(20);
         
     }
     
}

