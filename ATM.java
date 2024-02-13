package java_lectures;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ATM implements ActionListener {
	
	JFrame frame;
	JPanel panel;
	JLabel bakiyeSorguLabel;
	int bakiye = 100;
	
	JLabel paraCekLabel;
	JLabel mesajLabel;
	JLabel hataMesajLabel;
	
	public ATM() {
		// CONSTRUCTOR
		
		frame = new JFrame();
		panel = new JPanel();
		
		JButton bakiyeSorguButton = new JButton ("Bakiye Sorgula");
		JButton islemlerButton = new JButton ("İşlemler");
		JButton paraCekButton = new JButton ("Para Çek");
    	JButton paraYatırButton = new JButton ("Para Yatır");
		
		bakiyeSorguLabel = new JLabel ();
		paraCekLabel = new JLabel ();
		mesajLabel = new JLabel ();
		hataMesajLabel = new JLabel ();
		
		bakiyeSorguButton.addActionListener(this);
		islemlerButton.addActionListener(this);
		paraCekButton.addActionListener(this);
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(bakiyeSorguButton);
		panel.add(islemlerButton);
		panel.add(bakiyeSorguLabel);
		panel.add(paraCekLabel);
		panel.add(mesajLabel);
		panel.add(hataMesajLabel);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("ATM EKRANI");
		frame.pack();
		frame.setVisible(true);
		
		bakiyeSorguButton.addActionListener( new ActionListener() {
		    public void actionPerformed(ActionEvent e) { 
		    	bakiyeSorguLabel.setText("Mevcut Bakiyeniz  : " + bakiye);
		    																	}});
		    																			
		
    	islemlerButton.addActionListener( new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	panel.add(paraCekButton);
		    	panel.add(paraYatırButton);}       
																							}
																								);
    	
    	paraCekButton.addActionListener( new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	
		    	Scanner scanner = new Scanner(System.in);
		    	System.out.print("Çekmek istediğinz tutarı tuşlayınız  : " );
		    	
		    	int cekilecekTutar = scanner.nextInt();
		    	if (cekilecekTutar > bakiye) {
		    		hataMesajLabel.setText("Çekilebilecek bakiye aşıldı !!!");
		    	}
		    		
		    	else {
		    		bakiye += -cekilecekTutar;
			    	paraCekLabel.setText("Çekilen Tutar  : " + cekilecekTutar );
			    	mesajLabel.setText("Mevcut Bakiyenizi Kontrol Edebilirsiniz  "  );
			    	hataMesajLabel.setText("");
		    	}	
		    }
		    	       
																							}
																								);
    	
    	paraYatırButton.addActionListener( new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	
		    	Scanner scanner = new Scanner(System.in);
		    	System.out.print("Yatırmak istediğinz tutarı tuşlayınız  : " );
		    	
		    	int yatırılanTutar = scanner.nextInt(); 
		    	bakiye += yatırılanTutar;
		    	
		    	paraCekLabel.setText("Yatırılan Tutar  : " + yatırılanTutar );
		    	mesajLabel.setText("Mevcut Bakiyenizi Kontrol Edebilirsiniz  "  );
		    }    
																							}
																								);
	
	}
	
	
	public static void main(String[] args) {
		// CREATE AN OBJECT FROM ATM CLASS
		new ATM();	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
