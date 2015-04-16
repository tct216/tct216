import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;


public class Calculate2Numbers implements ActionListener 
{
	
	// JFrame : windows
	private JFrame frame;
	
	// JPanel : separate sections in a frame
	private JPanel panel;
	
	// JTextField : for user input
	private JTextField textField1;
	private JTextField textField2;
	
	// JButton : user can click on
	private JButton button;
	
	// JLabel : text
	private JLabel label;
	private JLabel outPut;
	public Calculate2Numbers()
	{
		frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setSize(320,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel = new JPanel();
		panel.setBackground(Color.PINK);
		
		
		label = new JLabel();
		label.setText("Enter Number");
		outPut = new JLabel();
		outPut.setText("--------");
		
		textField1 = new JTextField(5);
		textField2 = new JTextField(5);
		
		button = new JButton("Find Sum");
		button.addActionListener(this);
		

		panel.add(label);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(button);		
		panel.add(outPut);
		
		
		
		
		frame.add(panel);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//System.out.println(textField1.getText() + textField2.getText());
		
		int num1 = Integer.parseInt(textField1.getText());
		int num2 = Integer.parseInt(textField2.getText());
		int sum = num1+num2;
		outPut.setText(String.valueOf(sum));
	}
		
}
