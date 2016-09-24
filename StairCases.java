/**
 * @author Mitchell Pavlak
 * @version 1.0
 * file containing two methods to print staircases made out of x's
 */
import java.util.Scanner;
public class StairCases
{
  /**
   * Main method demonstrates the other wo methods by calling each of them.
   * @param args Standard array of commandline String arguments. Not used in this program.
   */

  public static void main(String[] args)
  {
    
    System.out.println("Please enter the size of the staircase: ");
    Scanner askSize = new Scanner(System.in);
    int size = askSize.nextInt();
    askSize.nextLine();

    printAscending(size);
    System.out.println("");
    printDescending(size);
  }

  /**
   * @param the size of the ascending staircase
   */
  public static void printAscending(int size)

  	{
  	 int count = 0;
  	 while (count < size) 
  	 	{
  	 	 for (int temp = 0; temp <= count; temp++)
  	 	 	{
  	 	 	System.out.print('x');
  	 	 	}
  	 	 count++;
  	 	 System.out.println("");  	 	}
  	 
 	}
	
  /**
   * @param the size of the ascending staircase
   */
  public static void printDescending(int size) 
  	{
  	int sizeTemp = size;
  	while (sizeTemp > 0)
  		{
  			for (int secondTemp = 0; secondTemp < sizeTemp; secondTemp++)
  				{
  				System.out.print('x');
  				}
  			sizeTemp--;
  			System.out.println("");
  		}
  	}
  
}