/**
 * Author Truong Tran
 * Date 2/24/2015
 * Program to Verify Username and Password
 */
 
import java.util.Scanner;

public class Excercise7
{
	public static void main (String [] args)
	{
		String username = "Going";
		String password = "Fishing";
		String demoUser = "";
		String demoPass = "";		
		Scanner keyboard =new Scanner(System.in);
		System.out.println("Please Enter the username");
		demoUser = keyboard.next();
		System.out.println("Please Enter the password");
		demoPass = keyboard.next();	
		keyboard.close();
		if ( demoUser.equalsIgnoreCase(username) && (demoPass.equalsIgnoreCase(password)))
			{//start if
				System.out.println("Welcome " + username);
			}// end if
		else
			{//start else
				System.out.println("Wrong username and password!");
			}// end else
		}// end main
}// end class
