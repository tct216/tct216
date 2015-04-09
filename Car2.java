/**
 * 
 * @author GotchaMan
 * Date : 4/7/15
 * Driver Class objects Car with methods and constructors
 */
public class Car
{
	
	// instance variables
	private int horsePower;
	private String color;
	private double engineSize;
	private static int count;
	
	

	// constructors
	public Car()
	{
		this.horsePower = 800;
		this.color = "white";
		this.engineSize = 5.7;
		count ++;
	}
	
	public Car(int horsePower)
	{
		this.horsePower = horsePower;
		count++;
	}
	
	public Car(String color)
	{
		this.color = color;
		count++;
	}
	
	public Car(double engineSize)
	{
		this.engineSize = engineSize;
		count++;
	
	}
	
	public Car (int horsePower, String color)
	{
		this.horsePower = horsePower;
		this.color = color;
		count++;
	}
	
	public Car(int horsePower, double engineSize)
	{
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		count++;
	}
	
	public Car(double engineSize, String color)
	{
		this.engineSize = engineSize;
		this.color = color;
		count++;
	}
	
	public Car(double engineSize, int horsePower)
	{
		this.engineSize = engineSize;
		this.horsePower = horsePower;
		count++;
	}
	
	public Car(String color, int horsePower)
	{
		this.color = color;
		this.horsePower = horsePower;
		count++;
		
	}
	public Car(String color, double engineSize)
	{
		this.color = color;
		this.engineSize = engineSize;
		count++;
	}
	
	public Car (int horsePower, String color, double engineSize)
	{
		this.horsePower = horsePower;
		this.color = color;
		this.engineSize = engineSize;
		count++;
	}
	
	
	// methods
	
	
	public int getPower()
	{
		return horsePower;
	}
	
	public double getSize()
	{
		return engineSize;
	}
	public String getColor()
	{
		return color;
	}
	
	public static int getCount()
	{
		return count;
	}

	public int setPower(int horsePower)
	{
		return this.horsePower = horsePower;
	}
	
	public double setSize(double engineSize)
	{
		return this.engineSize = engineSize;
	}
	
	public String setColor(String color)
	{
		return this.color = color;
	}

	public boolean equals(Car object)
	{
		return (this.color == object.color) && (this.engineSize == object.engineSize) &&(this.horsePower == object.horsePower); 
	}
	
		
	
	public String toString()
	{
		return ("Car !!!: \nHorse Power is : " + horsePower + "\nCar color is : " + color + "\nEngine size : " + engineSize + "\n");
	}
	
}
