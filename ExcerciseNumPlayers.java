/**
 * Truong Tran
 * Date 3/3/15
 * Program to calculate team and players
 */
 
 
import javax.swing.JOptionPane;
public class ExcerciseNumPlayers 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int numPeople ;
		int numPlayers ;
		int groupSize = 0 ;
		int teamSize = 0 ;
		boolean expression1, expression2, expression3;
		numPeople = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number of fishermans :"));
		numPlayers = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number of fishermans that will be fishing :"));
		expression1 = numPeople>10;
		expression2 = numPlayers>11;
		expression3 = numPeople < 3;
		if (expression3)
		{
			numPeople = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number of fishermans larger than 3 :"));
			numPlayers = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number of fishermans that will be fishing :"));
		}
		else if(expression1)		
			
			{
			
				groupSize = numPeople * 2;
				numPeople ++;
			}// end if
			else 
			{
				groupSize = numPeople * 3;
				numPeople ++;
			}// end else
		
		if (expression2)
			{
				teamSize = 11;
				teamSize = teamSize / 2;
			}// end if
			else 
			{
				teamSize = numPlayers;
				teamSize = teamSize / 2;
			}// end else
			JOptionPane.showMessageDialog(null,"The number of fishermans are : " + numPeople  
						+ "\nThe number of fishermans fishing is : " + numPlayers
						+ "\nThe group size of  fishermans are : " + groupSize
						+ "\nThe team size of fishable fishermans is : "+ teamSize );
		}//end else
	}// end main
// end class