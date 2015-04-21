import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;











public class Excercise14 extends JFrame
{
	
	private JTextField[] textbox = new JTextField[4];
	
	private JPanel panel =new JPanel();
	
	
	
		public Excercise14()
		{
	
	
			
			
		textbox[0] = new JTextField(10);
		textbox[1] = new JTextField(10);
		textbox[2] = new JTextField(10);
		textbox[3] = new JTextField(10);
		

		
	
		panel.setBackground(Color.BLUE);
		panel.setSize(400,100);
		panel.setLayout(new FlowLayout ());
			
		
		panel.add(textbox[0]);
		panel.add(textbox[1]);
		panel.add(textbox[2]);
		panel.add(textbox[3]);
		
		add(panel);
		setSize(new Dimension(400,200));
		
		setVisible(true);
	}
	
	
	
	
	
	
	
}
