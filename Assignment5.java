import java.awt.Color;



import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;






public class Assignment5 implements ActionListener 
{
	// JFrame : windows
		private JFrame frame;

		
		// JTextField : for user input
		private JTextField[] textbox = new JTextField[13];
		
		// JButton : user can click on
		private JButton button = new JButton();
		

		
		
		
		// JLabel : text
		private JLabel label[] = new JLabel[20];
		
		double grades[] = new double [4];
		double finalGrade;

		public Assignment5()
		{
			frame = new JFrame("CSC 200 Grading");
			frame.setVisible(true);
			frame.setSize(500,500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new GridLayout(8,4));
			
			label[0] = new JLabel(" ");
			label[1] = new JLabel("Truong");
			label[2] = new JLabel("Tran");
			label[3] = new JLabel("");
			label[4] = new JLabel("");
			label[5] = new JLabel("Grade");
			label[6] = new JLabel("Weight");
			label[7] = new JLabel("Total");
			label[8] = new JLabel("Assignments");
			label[9] = new JLabel("Quiz");
			label[10] = new JLabel("Mid Term");
			label[11] = new JLabel("Final ");
			label[12] = new JLabel("Weighted Average");
			label[13] = new JLabel("");
			
			label[14] = new JLabel("-----");
			label[15] = new JLabel("-----");
			label[16] = new JLabel("-----");
			label[17] = new JLabel("-----");
			label[18] = new JLabel("-----");
			
			label[19] = new JLabel("I Hope I Pass!!!");
			
			

			textbox[0] = new JTextField(5);
			textbox[1] = new JTextField(5);
			textbox[2] = new JTextField(5);
			textbox[3] = new JTextField(5);
			textbox[4] = new JTextField(5);
			textbox[5] = new JTextField(5);
			textbox[6] = new JTextField(5);
			textbox[7] = new JTextField(5);
			textbox[8] = new JTextField(5);
			textbox[9] = new JTextField(5);
			textbox[10] = new JTextField(5);
			textbox[11] = new JTextField(5);
			textbox[12] = new JTextField(5);

			frame.add(label[0]);
			frame.add(label[1]);
			frame.add(label[2]);
			frame.add(label[3]);
			frame.add(label[4]);
			frame.add(label[5]);
			frame.add(label[6]);
			frame.add(label[7]);
			frame.add(label[8]);
			frame.add(textbox[0]);
			frame.add(textbox[1]);
			frame.add(label[14]);
			frame.add(label[9]);
			frame.add(textbox[3]);
			frame.add(textbox[4]);
			frame.add(label[15]);
			frame.add(label[10]);
			frame.add(textbox[6]);
			frame.add(textbox[7]);
			frame.add(label[16]);
			frame.add(label[11]);
			frame.add(textbox[9]);
			frame.add(textbox[10]);
			frame.add(label[17]);
			frame.add(label[12]);
			frame.add(label[13]);
			frame.add(button);
			frame.add(label[18]);
			frame.add(label[19]);
			
			button.setText("Calculate");
			button.addActionListener(this);
		}//end class
			
			public void calculateAvgScore(double num1, double num2, double num3, double num4, 
					double weight1, double weight2, double weight3, double weight4) 
			{
					this.grades[0] = (num1 * weight1);
					this.grades[1] = (num2 * weight2);
					this.grades[2] = (num3 * weight3);
					this.grades[3] = (num4 * weight4);
					this.finalGrade = (this.grades[0]+this.grades[1]+this.grades[2]+this.grades[3]);
					
			}
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				double num1 = Double.parseDouble(textbox[0].getText());
				double percent1 = Double.parseDouble(textbox[1].getText());
				double num2 = Double.parseDouble(textbox[3].getText());
				double percent2 = Double.parseDouble(textbox[4].getText());
				double num3 = Double.parseDouble(textbox[6].getText());
				double percent3 = Double.parseDouble(textbox[7].getText());
				double num4 = Double.parseDouble(textbox[9].getText());
				double percent4 = Double.parseDouble(textbox[10].getText());
				
				
				calculateAvgScore(num1, num2, num3, num4, percent1, percent2, percent3, percent4);
				
				label[14].setText(String.valueOf(String.format( "%.2f",this.grades[0])));
				label[15].setText(String.valueOf(String.format( "%.2f",this.grades[1])));
				label[16].setText(String.valueOf(String.format( "%.2f",this.grades[2])));
				label[17].setText(String.valueOf(String.format( "%.2f",this.grades[3])));
				label[18].setText(String.valueOf(String.format( "%.2f", this.finalGrade)));
						
			}
}
			