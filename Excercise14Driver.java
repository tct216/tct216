import javax.swing.SwingUtilities;


public class Excercise14Driver
{

	public static void main(String[] args) 
	{
		
		SwingUtilities.invokeLater(new Runnable() 
		{
			public void run()
			{
						
			Excercise14 gui = new Excercise14();
			
			Excercise14b gui1 = new Excercise14b();
		
			Excercise14c gui2 = new Excercise14c();
			}
			

		
		});

	}
}
