import javax.swing.SwingUtilities;


public class Calculate2NumbersDriver 
{

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Calculate2Numbers();					
			}
		
		});

	}

}
