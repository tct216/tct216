import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;


import javax.swing.JFrame;
import javax.swing.JTextField;


public class Excercise14c extends JFrame
{

	private JTextField[] textbox = new JTextField[4];
	private JPanel panel = new JPanel();
	
	public Excercise14c()
	{
		
		
	textbox[0] = new JTextField(10);
	textbox[1] = new JTextField(10);
	textbox[2] = new JTextField(10);
	textbox[3] = new JTextField(10);
	setLayout(new BorderLayout());
	add(textbox[0],BorderLayout.PAGE_START);
	add(textbox[1],BorderLayout.CENTER);
	add(textbox[2], BorderLayout.PAGE_END);
	add(textbox[3], BorderLayout.LINE_START);
	
	
	panel = new JPanel();
	panel.setBackground(Color.BLACK);
	add(panel);
	setSize(new Dimension(400,200));
	setVisible(true);
	}
}
