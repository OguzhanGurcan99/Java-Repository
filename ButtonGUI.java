package java_lectures;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonGUI implements ActionListener {
	
	JFrame frame;
	JPanel panel;
	JLabel firstLabel;
	JLabel secondLabel;
	
	int firstClick = 0;
	int secondClick = 0;
	
	public ButtonGUI() {
		// CONSTRUCTOR
		
		frame = new JFrame();
		panel = new JPanel();
		
		JButton firstButton = new JButton ("First Button");
		JButton secondButton = new JButton ("Second Button");
		
		firstLabel = new JLabel ("Number of first button clicks : " + firstClick);
		secondLabel = new JLabel ("Number of second button clicks :  " + secondClick);
		
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(firstButton);
		panel.add(secondButton);
		panel.add(firstLabel);
		panel.add(secondLabel);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("First GUI");
		frame.pack();
		frame.setVisible(true);
		
		firstButton.addActionListener( new ActionListener() {
		    public void actionPerformed(ActionEvent e) { 
		    	firstClick += 1;
				firstLabel.setText("Number of first button clicks : " + firstClick);
				
		    																			}       
																							}
																								);
	
		secondButton.addActionListener( new ActionListener() {
		    public void actionPerformed(ActionEvent e) { 
		    	secondClick += 1;
				secondLabel.setText("Number of second button clicks :  " + secondClick);
		    																			}       
																							}
																								);
	}
	
	
	public static void main(String[] args) {
		// CREATE AN OBJECT FROM FirstGui CLASS
		new ButtonGUI();	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
