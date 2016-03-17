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
public class RightTriangleChecker 
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter three integers: ");
        System.out.print("Side 1: ");
        int Side1 = keyboard.nextInt();
        
        System.out.print("Side 2: ");
        int Side2 = keyboard.nextInt();
        
        while(Side2<Side1)
        {
          System.out.println(Side2 + "is smaller than " + Side1 + " Try again ");
          System.out.print("Side 2: ");
          Side2 = keyboard.nextInt();
        }
        System.out.print("Side 3: ");
        int Side3 = keyboard.nextInt();
        
         while(Side3<Side2)
        {
          System.out.println(Side3 + "is smaller than " + Side2 + " Try again ");
          System.out.print("Side 3: ");
          Side3 = keyboard.nextInt();
        }
         System.out.println("Your three sides are " + Side1 + " " + " " + Side2 + " " + Side3 );
         
        if((Side1*Side1 + Side2*Side2)!= Side3*Side3)
             {
        System.out.println("NO! These sides do not make a right angle");
            }
        else
        {
           
         System.out.println("These sides *do* make a right triangle!");
        }
          
    }
}
