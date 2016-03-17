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

public class Dice
{
    public static void main( String [] args)
    {
        Random r = new Random();
        
        System.out.println("HERE COMES THE DICE!");
        
        
       int y=1 + r.nextInt(6);
       System.out.println("Roll #1: "+ y);
         
        int z=(1 + r.nextInt(6));
        System.out.println("Roll #2: " + z);
        int sum = y + z;
       
       
        
        System.out.println("The total is " +sum);
    }
    
}
