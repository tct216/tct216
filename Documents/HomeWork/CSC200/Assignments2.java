/**
 * Author Truong Tran
 * Date 2-25-2015
 * Program will display sum and average.
 */
import java.util.Scanner;

public class Assignments2b
{// start class
	public static void main(String[] args)
	{// start main
		int n1, n2, n3, n4, n5, sum, avg;
		int max = 0;
		int min = 0;
		
		System.out.println("Please enter 5 numbers and I will compute the Sum and Average for you. If you are lucky, I will also tell you the Min, Ma, Mode, and Median");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the first number :");
		n1 =  keyboard.nextInt();
		System.out.println("Please enter the second number :");
		n2 =  keyboard.nextInt();
		System.out.println("Please enter the third number :");
		n3 =  keyboard.nextInt();
		System.out.println("Please enter the fourth number :");
		n4 =  keyboard.nextInt();
		System.out.println("Please enter the fifth number :");
		n5 =  keyboard.nextInt();		
		sum = (n1 + n2 + n3 + n4 + n5);
		avg = ( sum / 5);
		min = n1;
		// Calculation for Max
		if (n1 > max)
		{
			max = n1;
		}
		else
		{
			max = max;
		}
		if (n2 > max)
		{
			max = n2;
		}
		else
		{
			max = max;
		}
		if (n3 > max)
		{
			max = n3;
		}
		else
		{
			max = max;
		}
		if (n4 > max)
		{
			max = n4;
		}
		else
		{
			max = max;
		}
		if (n5 > max)
		{
			max = n5;
		}
		else
		{
			max = max;
		}
		
		// Calculation for Min
		if (n1 < min)
		{
			min = n1;
		}
		else
		{
			min = min;
		}
		if (n2 < min)
		{
			min = n2;
		}
		else
		{
			min = min;
		}
		if (n3 < min)
		{
			min = n3;
		}
		else
		{
			min = min;
		}
		if (n4 < min)
		{
			min = n4;
		}
		else
		{
			min = min;
		}
		if (n5 < min)
		{
			min = n5;
		}
		else
		{
			min = min;
		}
		
		// Calculation for Median
		
		System.out.println("Here is the calculations for the numbers : " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ".");
		System.out.println("The sum is :" + sum);
		System.out.println("The average is :" + avg);
		System.out.println("The max is :" + max);
		System.out.println("The min is :" + min);
		
		
	}// end main
}// end class
