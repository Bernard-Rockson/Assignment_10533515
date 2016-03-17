/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10533515;
/**
 *
 * @author NANA
 */import java.util.Random;
import java.util.Scanner;
public class KeepGuessing {
    public static void main(String[] args){
		//variable declaration and scanner object creation
                Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
                int count = 1;
		int compuGuess;//= (int)(Math.random()*100)+1; //random number stored in the computer's guess
		int userGuess ;//user's input
                
                //computations
                System.out.println("WELCOME TO GUESSING GAME");
		System.out.println("Guess a random number between 1 and 10");
		compuGuess = 1 + r.nextInt(10);
                userGuess=keyboard.nextInt();
               
                
                while(compuGuess != userGuess)
                {
                    System.out.println("This is incorrect. Guess again");
                    
                     
                System.out.println("Your guess: ");
                userGuess = keyboard.nextInt();
                count++;
                
                }
               System.out.println("That's right you are a good Guesser!");
               
               System.out.println("It ony took you " + count + " tries");
                
           
              
                
               
    }
}
