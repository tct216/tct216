/**
 * 
 * @author GotchaMan
 * Date 4-14-15
 * Driver for Calculator to compute Sum, Average, and Product for array of numbers
 */


import java.util.Scanner;
public class CalculatorDriver 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		double [] num = new double [5];
		for (int i = 0; i<num.length; i++)
		{
			System.out.println("Please enter number for an array :");
			num[i] = input.nextDouble();
		}//end for 
		
		
		double [] product = new double [2];
		for (int i =0; i< product.length; i++)
		{
			System.out.println("Please enter number for product");
			product[i] = input.nextDouble();
		}//end for
		
		
		System.out.println("The average is : " + Calculator.getAverage(num));
		System.out.println("The sum is : " + Calculator.getSum(num));
		System.out.println("The product for " + product[0] + " and " + product[1] + " is : " + Calculator.getProduct(product));

	}// end main

}// end class
