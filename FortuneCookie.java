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

public class FortuneCookie
{
    public static void main( String [] args)         
            
 {
     Random r = new Random();
     
     System.out.println( "Fortune cookie says:" + " You will find happiness with a new love.");
     System.out.println();
 
     System.out.println(" Fortune cookie says: Stick with your wife ");
     System.out.print(1 + r.nextInt(54) + " - ");
     System.out.print(1 + r.nextInt(54) + " - ");
     System.out.print(1 + r.nextInt(54) + " - ");
     System.out.print(1 + r.nextInt(54) + " - ");
     System.out.print(1 + r.nextInt(54) + " - ");
     System.out.print(1 + r.nextInt(54) + " - ");
   
    }  
}  
  
   

