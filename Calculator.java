/**
 * 
 * @author GotchaMan
 * Date 4-14-15
 * Calculator to compute Sum, Average, and Product for array of numbers
 */
public class Calculator 
{
	
	
	// methods
	public static double getAverage(double [] num)
	{
		double sum = 0;
		for (int i =0 ; i < num.length; i++)
		{
			sum+=num[i];
		}
		return(sum/num.length);
	}//end getAverage
	
	public static int getAverage(int [] num)
	{
		int sum = 0;
		for (int i =0 ; i < num.length; i++)
		{
			sum+=num[i];
		}
		return(sum/num.length);
	}//end getAverage
	
	public static double getSum(double[] num)
	{
		double sum = 0;
		for (int i =0 ; i < num.length; i++)
		{
			sum+=num[i];
		}
		return(sum);
	}//end getSum
		
	public static double getProduct(double [] product)
	{
		double p = 1;
		for (int i =0 ; i < product.length; i++)
		{
			 p = product[0] * product [1];
		}
		return(p);
	}//end getProduct
	
}//end class
