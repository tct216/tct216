import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Excercise14b extends JFrame
{

	private JTextField[] textbox = new JTextField[4];
	private JPanel panel = new JPanel();

	
	public Excercise14b()
	{
		
	
	
		
	textbox[0] = new JTextField(10);
	textbox[1] = new JTextField(10);
	textbox[2] = new JTextField(10);
	textbox[3] = new JTextField(10);
	setLayout(new GridLayout(2,2));
	add(textbox[0]);
	add(textbox[1]);
	add(textbox[2]);
	add(textbox[3]);
	
	
	panel.setBackground(Color.PINK);
	add(panel);
	setSize(new Dimension(400,200));
	setVisible(true);
	}
}
