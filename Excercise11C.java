/*
 * Author: Truong Tran
 * Date 3/26/15
 * Making a diamond star
 */
public class Ecercise11C
{
	public static void main(String[] args) 
	{
		 int lines = 1;
		 String stars = "*";
		 while (lines < 6)
		 {
			 switch (lines) 
			 {
				 
			 	case 1: case 5:
			 	stars = "*";
				break;
				case 2: case 4:
				stars = " ***";
			 	break;
				case 3:
				stars = "*****";
				break;
			 }// end switch
		 System.out.printf ("\n %3s",stars);
		 lines++;
		 }// end while
	}// end main
}// end  class
