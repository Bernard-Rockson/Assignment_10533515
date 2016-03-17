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
public class SafeSquareRoot
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int number;
        
        System.out.println("SQUARE ROOT! ");
        System.out.print("Enter a number: ");
        number = keyboard.nextInt();
        
        while(number < 0)
        {
          System.out.println("You can't take the square root of a negative number ");
          System.out.print("Try again: ");
          number = keyboard.nextInt();
        }
       
        
        System.out.println("The square root of " + number + " is "  + Math.sqrt(number));
    }
}
