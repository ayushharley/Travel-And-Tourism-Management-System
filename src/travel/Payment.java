package travel;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Payment extends JFrame implements ActionListener{
JButton b1,b2;
	public Payment() {
		setBounds(200,200,850,530);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		 
        JLabel label=new JLabel("Pay using Paytm");
        label.setFont(new Font("Raleway", Font.BOLD, 30));
        label.setForeground(new ColorUIResource(0, 43, 177));
        label.setBounds(300, 20, 450, 35);
        add(label);
		
         b1= new JButton("Pay");
			b1.addActionListener(this);
			b1.setBounds(250, 85 ,150 ,35);
			b1.setBackground(new Color(0, 43, 177));
			b1.setForeground(new Color(255,255,255));
			b1.setFont(new Font("Raleway", Font.BOLD, 17));
			b1.setBorder(BorderFactory.createEmptyBorder());
		    add(b1);

	         b2= new JButton("Back");
				b2.addActionListener(this);
				b2.setBounds(460, 85 ,150 ,35);
				b2.setBackground(new Color(0, 43, 177));
				b2.setForeground(new Color(255,255,255));
				b2.setFont(new Font("Raleway", Font.BOLD, 17));
				b2.setBorder(BorderFactory.createEmptyBorder());
			    add(b2);
      
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("paytm.jpeg"));
		Image i2=i1.getImage().getScaledInstance(800,500,Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel l2= new JLabel(i3);
		 l2.setBounds(30, 100, 800, 500);
		add(l2);
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
     if (ae.getSource()==b1) {
    	 new Paytm().setVisible(true);
		
	}
	
     if (ae.getSource()==b2) {
    	this.setVisible(false);
 		
 	}
	}

}
