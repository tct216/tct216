/**
 * Author Truong Tran
 * Date : 3/31/15
 *  programs with Math.pow, Math.sqrt, Math.abs
 */



import java.util.Scanner;
public class Ecercise12{

	public static void main(String[] args) // main method
	{
		output(tenth(input()));
		output(sum(intake(), 0));
		output2((takein()));
		
			
	}
	
	
	public static int sum(int x, int y)// method f
	{
		return x+y;
	}
	
	
	public static int tenth(int x)
	{
		return (int) Math.pow(x,10);
	}	
	
	
	public static void output(int x)// method output
	{
		System.out.println(x);
	}
	public static void output2(double x)// method output
	{
		System.out.println(x);
	}
	
	
	public static double takein() 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number for X :");
		double x = keyboard.nextDouble();
		System.out.println("Enter a number for Y :");
		double y = keyboard.nextDouble();
		System.out.println("Enter a number for Z :");
		double z = keyboard.nextDouble();
		return  ((Math.sqrt(x)) + (Math.abs(y)) + Math.pow(z, y));
	}
	
	
	public static int input() 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number :");
		return keyboard.nextInt();
	}
	

	

	public static int intake()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number for X :");
		int x = keyboard.nextInt();
		System.out.println("Enter a number for Y :");
		int y = keyboard.nextInt();
		return x + y ;
	}
}