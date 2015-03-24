import javax.swing.JOptionPane;


public class Excercise10
{
	public enum MonthType {January, February, March, April, May, June, July, August, September, October, November, December}
	public static void main(String[] args)
	{	
		MonthType [] choices = {MonthType.January , MonthType.February , MonthType.March , MonthType.April , MonthType.May, MonthType.June, MonthType.July, MonthType.August, MonthType.September, MonthType.October, MonthType.November, MonthType.December};
		MonthType select = (MonthType)JOptionPane.showInputDialog(null, "Please select which month it is :", "Month of Year" , 	JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);

		
		while (select!= null)
		{
			switch (select) 
			{
				case December: case January : case February:
					JOptionPane.showMessageDialog(null,"Do you want to build a snowman ?!");
					break;
				case March: case April: case May:
					JOptionPane.showMessageDialog(null,"Happy Spring Days!");
					break;
				case June: case July: case August:
					JOptionPane.showMessageDialog(null,"Its Summer Time!");
					break;
				case September: case October: case November:
					JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");
					break;
				default :				
					JOptionPane.showMessageDialog(null,"Invalid Month!");
					break;	

			}// end switch
			select = (MonthType)JOptionPane.showInputDialog(null, "Please select which month it is :", "Month of Year" , 	JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
		}// end while
	}// end main
}// end class
