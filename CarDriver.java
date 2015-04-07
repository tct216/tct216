/**
 * 
 * @author GotchaMan
 * Date : 4/7/15
 * Driver class for the Car objects
 */
public class CarDriver 
{

	public static void main(String[] args) 
	{
		//instantiations
		Car truongCar = new Car();
		System.out.println(truongCar);
		Car yoboCar = new Car (900, "white", 6.8);
		System.out.println(yoboCar);
		Car oldCar = new Car ("blue", 456);
		System.out.println(oldCar);
		

	}// end main

}// end class
