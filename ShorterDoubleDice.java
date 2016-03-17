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
public class ShorterDoubleDice {
    
 public static void main( String [] args)
 {
        Random r = new Random();
        int y, z, b, a, sum1, sum2;
        System.out.println("HERE COMES THE DICE!");
            
       do
       { 
       y = 1 + r.nextInt(6);
       z= (1 + r.nextInt(6));
       
       System.out.println("Roll #1: " + y);
       System.out.println("Roll #2: " + z);
       sum1 = y + z;
       System.out.println("The total is "+ sum1);
       System.out.println();
       
         a = 1 + r.nextInt(6);   
         b =  1 + r.nextInt(6);
       }
       
           
        while(a != b );
        {
        
            System.out.println("Roll #1 = " + a);
            System.out.println("Roll #2 = "+  b);
            sum2 = a + b;
            System.out.println("The total is "+ sum2);
         
        }

    }
    
}

