import java.util.Scanner;

public class Rectangle
{// start class
	public static void main(String[] args)
	{// start main
		int length =0;
		int width = 0;
		int perimeter = 0;
		System.out.println("I will compute the perimeter of a rectangle for you after you give me a few measurements.");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of the box");
		length =  keyboard.nextInt();
		System.out.println("Please enter the width of the box");
		width = keyboard.nextInt();
		keyboard.close();
		perimeter = (length + width) * 2;
		System.out.println("These are the measurements that you have input \n " + "The legnth is : " + length + "\n the width is : " + width + "\n The perimeter is : " + perimeter );
	}// end main
}// end class