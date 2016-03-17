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
public class HiLoLimited 
{
    public static void main( String[] args)
    {
        Random r = new Random();
        int guess =0;
        Scanner keyboard = new Scanner(System.in);
    
        
        System.out.println("I'm thinking of a number 1-100. You have 7 guesses ");
        int rand =  1 + r.nextInt(100);
  
        
        int count = 1;
        while(guess != rand && count <=7 )
        {
           
          System.out.print("Guess # " + count +": ");
          guess = keyboard.nextInt();
          count++;
          
          if(guess == rand)
        {
           System.out.println("You guessed it! You must be a genius");
          
        }
        else if(guess > rand)
        {
        System.out.println("Sorry, that guess is too high! ");    
        }
        else
        {
        System.out.println("Sorry, you are too low! ");    
        }
                
        }
           System.out.println("Sorry, you didnt get it in 7 tries. You lose.");
    }
}
