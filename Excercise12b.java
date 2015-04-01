/**
 * Author Truong Tran
 * Date : 3/31/15
 * programs with out Math.pow, Math.sqrt, Math.abs
 */



import java.util.Scanner;
public class Excercise12b{

	public static void main(String[] args) // main method
	{
		output(tenth(input()));
		output(sum(intake(), 0));
		output2((takein()));	
	}// end main
	
	
		public static int sum(int x, int y)// method f
		{
			return x+y;
		}// end sum Method
		
			public static int tenth(int x)
			{
				return x*x*x*x*x*x*x*x*x*x;
			}	// end tenth method
			
			
				public static void output(int x)// method output
				{
					System.out.println(x);
				}// end output method
				
					public static void output2(double x)// method output
					{
						System.out.println(x);
					}//end output2 method
					
					
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
							}// end input method
							
								public static int intake()
								{
									Scanner keyboard = new Scanner(System.in);
									System.out.println("Enter a number for X :");
									int x = keyboard.nextInt();
									System.out.println("Enter a number for Y :");
									int y = keyboard.nextInt();
									return x + y ;
								}// end intake method
	
}// end class