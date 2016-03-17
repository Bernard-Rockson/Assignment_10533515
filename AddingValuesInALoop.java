/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10533515;

/**
 *
 * @author NANA
 */
import java.util.Scanner;
public class AddingValuesInALoop 
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
       
        
        System.out.println("I will add up the numbers you give me. ");
        System.out.print("Number: ");
        int Number = keyboard.nextInt();
        System.out.println("The total so far is " + Number);
        int sum = Number;
        while( Number != 0)
        {
          System.out.print("Number: ");
          Number = keyboard.nextInt();
          sum  = sum + Number;
          
                 
          System.out.println("The total so far is " + sum );
        }
        
    }
    
}
