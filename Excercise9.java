import java.util.Scanner;

public class Excercise9 
{
	public static void main(String[] args) 
	{
		 Scanner keyboard = new Scanner (System.in);
		 System.out.println ("Please enter your position: Administrator, Faculty, Staff, Student, or Guest :");
		 String position = keyboard.next();
		 switch (position) 
		 {
			 case "Administrator": case "administrator": case "Fishing": case "fishing":
			 System.out.println ("Welcome " + position + "!");
			 break;
			 case "Faculty": case "faculty":
			 System.out.println ("Welcome " + position + "!");
			 break;
			 case "Staff": case "staff":
			 System.out.println ("Welcome " + position + "!");
			 break;
			 case "Student": case "student":
			 System.out.println ("Welcome " + position + "!");
			 break;
			 case "Guest": case "guest":
			 System.out.println ("Welcome " + position + "!");
			 break;
			 default:
			 System.out.println ("Unrecognized position. Please try again.");
			 break;
		 }// end switch
 	}// end main
}// end class