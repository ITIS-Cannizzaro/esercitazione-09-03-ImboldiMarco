import java.util.Scanner;
public class Cognome 
{
    public static void main(String[] args) 
    {
		Scanner in = new Scanner (System.in);
        double[] array1 = new double[4];
        double[] array2 = new double[array1.length/2];
        
        for (int i = 0; i < array1.length; i++)
        {
        	System.out.println("inserire un numero");
    		array1[i]=in.nextDouble();
        }
        for (int i = 0; i < array2.length; i++) 
        {
            array2[i] = array1[2*i] * array1[2*i + 1];
        }
        
        // Stampa i due array
        System.out.println("Array 1: ");
        for (double num : array1) 
        {
            System.out.print(num + " ");
        }
        
        System.out.println("\nArray 2: ");
        for (double num : array2) 
        {
            System.out.print(num + " ");
        }
    }
}