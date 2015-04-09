/**
 * 
 * @author GotchaMan
 * Date : 4/7/15
 * Driver class for the Car objects
 */


import javax.swing.JOptionPane;
public class CarDriver 
{
	final static int NUMBER_OF_CAR = 3;

	public static void main(String[] args) 
	{
		//instantiations
		Car [] cars = new Car[NUMBER_OF_CAR];
		for (int i=0; i < NUMBER_OF_CAR; i++)
		{
		int horsePower = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the horse power :"));
		String color = JOptionPane.showInputDialog(null, "Please enter the Color :");
		double engineSize = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the engine size :"));
		cars[i] = new Car(horsePower, color, engineSize);
		}
		
		Car ferrari = new Car (571, "white" , 8.0);
		Car maserati = new Car (703, "white" , 12.0);
		
		
		for (Car x:cars)
		{
		JOptionPane.showMessageDialog(null, "New  " + x  );
		}
		JOptionPane.showMessageDialog(null, "There are " + Car.getCount() + " cars.");
		JOptionPane.showMessageDialog(null, " Comparison if a Ferrari and Maserati are the exact same : " + ferrari.equals(maserati));
	}// end main

}// end class
