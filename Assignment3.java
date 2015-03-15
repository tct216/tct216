/**
 * Author: Truong Tran
 * Date : 3/11/15
 * Assignment 3
 */


import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Assignment3
{
	public static void main(String[] args) 
	{
		String userName = "asdf";
		String passWord = "Buddy";
		String tempName = "";
		String tempPass = "";
		String statement1 = " Welcome Admin! You can update and read file.";
		String statement2 = " Welcome Student! You can only read file.";
		String statement3 = " Welcome Staff! You can update, read, add, delete file.";
		String statement4 = " Well keep choosing until you get the right ONE! ";
		String[] choices = { "Admin", "Student", "Staff", "Not Sure"};
		tempName = JOptionPane.showInputDialog(null,"Please enter your user name :");
		// check for username with 3 try limit
		for (int i = 0; i <2; i++ )
		{
			if (!tempName.equalsIgnoreCase(userName))
			{
				tempName = JOptionPane.showInputDialog(null,"Please re-enter your user name :");
			}// end if
		}// end for
		// checking for pass word with 3 tries limit
		if (tempName.equalsIgnoreCase(userName))
		{
			tempPass = JOptionPane.showInputDialog(null,"Please enter your password");
			for (int i = 0; i <2; i++ )
				{
					if (!tempPass.equalsIgnoreCase(passWord))
					{
						tempPass = JOptionPane.showInputDialog(null,"Please re-enter your Password :");
					}// end if
				}// end for
		}// end if
		if(tempName.equalsIgnoreCase(userName) && (tempPass.equalsIgnoreCase(passWord)))
		{
		    JFrame frame = new JFrame("Input Dialog Example 4");
		    String type = (String) JOptionPane.showInputDialog(frame, 
		        "What is your account type ?",
		        "Account Type",
		        JOptionPane.QUESTION_MESSAGE, 
		        null, 
		        choices, 
		        choices[0]);
		 
		 	if (type == "Admin")
		 	{
		 		JOptionPane.showMessageDialog(null,statement1);
		 	}// end if
		 	if (type == "Student")
		 	{
		 		JOptionPane.showMessageDialog(null,statement2);
		 	}// end if
		 	if (type == "Staff")
		 	{
		 		JOptionPane.showMessageDialog(null,statement3);
		 	}// end if
		 	if (type == "Not Sure")
		 	{
		 		JOptionPane.showMessageDialog(null,statement4);
		 	}//end if
		}//end if
		
		if(!tempName.equalsIgnoreCase(userName) || (!tempPass.equalsIgnoreCase(passWord)))
		{
			JOptionPane.showMessageDialog(null," Please contact and admin, Your account has been locked! ");
		}// end if	
	}//end main
}// end class