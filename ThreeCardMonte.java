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
import java.util.Random;

public class ThreeCardMonte 
{
    public static void main( String[] args)
    {
       Scanner Keyboard = new Scanner(System.in);
       Random r = new Random();
               
       System.out.println("You slide up to Fast Eddie's card table and plop down your cash");
       System.out.println("He glances at you out of the corner of his eye and starts shuffling");
       System.out.println("He lays down three cards");
       
       System.out.println();
       System.out.println("Which one has the ace?");
       System.out.println();
       System.out.println("## ## ##");
       System.out.println("## ## ##");
       System.out.println("1  2  3" );
       
       int x = (1 + r.nextInt(3));
       int number = Keyboard.nextInt();
       
       
    }
}