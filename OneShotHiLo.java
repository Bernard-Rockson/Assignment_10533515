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
import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo
{
    public static void main( String[] args)
    {
    Random r = new Random();
    Scanner  Keyboard = new Scanner(System.in);
    
    System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
    int x = (1 + r.nextInt(100));
    
    int GuesNum = Keyboard.nextInt();
       
   
     if(GuesNum == x)
     {
      System.out.println("You are right"); 
     }
     else if(GuesNum < x)
     {
      System.out.println("Sorry. Too low. I was thinking of " + x );  
     }
     else 
     {
      System.out.println("Sorry. Too high. I was thinking of " + x);
     }
  }
}
