/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10533515;

import java.util.Random;

/**
 *
 * @author NANA
 */
public class DiceDouble {
    
 public static void main( String [] args)
    {
        Random r = new Random();
        
        System.out.println("HERE COMES THE DICE!");
        
       
      
            
        
       int y = 1 + r.nextInt(6);
       int z= (1 + r.nextInt(6));
       
       System.out.println("Roll #1: " + y);
       System.out.println("Roll #2: " + z);
       int sum = y + z;
       System.out.println("The total is "+ sum);
        
        while(y != z) 
        {
            y = 1+r.nextInt(6);
            z = 1+r.nextInt(6);
            System.out.println();
            System.out.println("Roll #1 = "+y);
            System.out.println("Roll #2 = "+z);
            System.out.println("The total is "+sum);
         
        }
       
       
        
     
    }
    
}

