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

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it several times times." );
		System.out.print( "Message: " );
                String message = keyboard.nextLine();
                
                System.out.println("How many times? ");
                int numtimes = keyboard.nextInt();
                        
		

		int n = 10;
		while ( n <= numtimes * 10)
		{
			System.out.println( (n) +"." + message );
			n+=10;
		}

	}
}
                  //n++ increase the counter by 1 and terminates the loop
                  