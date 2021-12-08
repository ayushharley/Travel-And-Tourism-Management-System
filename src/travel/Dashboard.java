package travel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.InsetsUIResource;
import java.awt.*;

public class Dashboard extends JFrame implements ActionListener {
	
	JButton b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
	String username;
	
	public Dashboard(String username) {
    this.username=username;
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		JPanel p1= new JPanel();
		p1.setLayout(null);
		p1.setBackground(new ColorUIResource(0,0,102));
		p1.setBounds(0,0,1950,50);
		add(p1);
		
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBackground(new ColorUIResource(0,0,102));
		p2.setBounds(0,50,300,1000);
		add(p2);
		
		 b1= new JButton("Add Personal Deatails");
		b1.setBackground(new Color(0,0,102));
		b1.setMargin(new Insets(0, 0, 0, 30));
		b1.setForeground(new ColorUIResource(255,255,255));
		b1.setFont( new FontUIResource("Tohimo",Font.PLAIN,20));
		b1.setBounds(0,0,300,40);
		b1.addActionListener(this);
		p2.add(b1);
		
		 b2= new JButton("Update Personal Details");
		 b2.addActionListener(this);
		b2.setBackground(new Color(0,0,102));
		b2.setMargin(new Insets(0, 0, 0,10));
		b2.setForeground(new ColorUIResource(255,255,255));
		b2.setFont( new FontUIResource("Tohimo",Font.PLAIN,20));
		b2.setBounds(0,40,300,40);
		p2.add(b2);
		
		 b3= new JButton("View Deatails");
		 b3.addActionListener(this);
		b3.setBackground(new Color(0,0,102));
		b3.setMargin(new Insets(0, 0, 0, 110));
		b3.setForeground(new ColorUIResource(255,255,255));
		b3.setFont( new FontUIResource("Tohimo",Font.PLAIN,20));
		b3.setBounds(0,80,300,40);
		p2.add(b3);
		
		 b4= new JButton("Delete Personal Details");
		b4.setBackground(new Color(0,0,102));
		 b4.addActionListener(this); 
		b4.setMargin(new Insets(0, 0, 0, 13));
		b4.setForeground(new ColorUIResource(255,255,255));
		b4.setFont( new FontUIResource("Tohimo",Font.PLAIN,20));
		b4.setBounds(0,120,300,40);
		p2.add(b4);
		
		 b5= new JButton("Check Package");
		 b5.addActionListener(this);
		b5.setBackground(new Color(0,0,102));
		b5.setMargin(new Insets(0, 0, 0, 95));
		b5.setForeground(new ColorUIResource(255,255,255));
		b5.setFont( new FontUIResource("Tohimo",Font.PLAIN,20));
		b5.setBounds(0,160,300,40);
		p2.add(b5);
		
		 b6= new JButton("Book Package");
		b6.setBackground(new Color(0,0,107));
		b6.setMargin(new Insets(0, 0, 0, 100));
		b6.setForeground(new ColorUIResource(255,255,255));
		b6.setFont( new FontUIResource("Tohimo",Font.PLAIN,20));
		b6.setBounds(0,200,300,40);
		b6.addActionListener(this);
		p2.add(b6);
		
		 b7= new JButton("View Package");
		b7.setBackground(new Color(0,0,102));
		b7.setMargin(new Insets(0, 0, 0,104));
		b7.setForeground(new ColorUIResource(255,255,255));
		b7.setFont( new FontUIResource("Tohimo",Font.PLAIN,20));
		b7.setBounds(0,240,300,40);
		b7.addActionListener(this);
		p2.add(b7);
		
		 b8= new JButton("View Hotels");
		b8.setBackground(new Color(0,0,102));
		b8.setMargin(new Insets(0, 0, 0, 117));
		b8.setForeground(new ColorUIResource(255,255,255));
		b8.setFont( new FontUIResource("Tohimo",Font.PLAIN,20));
		b8.setBounds(0,280,300,40);
		b8.addActionListener(this);
		p2.add(b8);
		
		 b9= new JButton("Book Hotel");
		b9.setBackground(new Color(0,0,102));
		b9.setMargin(new Insets(0, 0, 0, 125));
		b9.setForeground(new ColorUIResource(255,255,255));
		b9.setFont( new FontUIResource("Tohimo",Font.PLAIN,20));
		b9.setBounds(0,320,300,40);
		b9.addActionListener(this);
		p2.add(b9);
		
		 b10= new JButton("View Book Hotels");
		b10.setBackground(new Color(0,0,102));
		b10.setMargin(new Insets(0, 0, 0, 57));
		b10.setForeground(new ColorUIResource(255,255,255));
		b10.setFont( new FontUIResource("Tohimo",Font.PLAIN,20));
		b10.setBounds(0,360,300,40);
		b10.addActionListener(this);
		p2.add(b10);
		
		 b11= new JButton("Destination");
		b11.setBackground(new Color(0,0,102));
		b11.setMargin(new Insets(0, 0, 0, 122));
		b11.setForeground(new ColorUIResource(255,255,255));
		b11.setFont( new FontUIResource("Tohimo",Font.PLAIN,20));
		b11.setBounds(0,400,300,40);
		b11.addActionListener(this);
		p2.add(b11);
		
		 b12= new JButton("Payment");
		b12.setBackground(new Color(0,0,102));
		b12.setMargin(new Insets(0, 0, 0, 145));
		b12.setForeground(new ColorUIResource(255,255,255));
		b12.setFont( new FontUIResource("Tohimo",Font.PLAIN,20));
		b12.setBounds(0,440,300,40);
		b12.addActionListener(this);
		p2.add(b12);
		
		 b13= new JButton("About");
		b13.setBackground(new Color(0,0,102));
		b13.setMargin(new Insets(0, 0, 0, 170));
		b13.addActionListener(this);
		b13.setForeground(new ColorUIResource(255,255,255));
		b13.setFont( new FontUIResource("Tohimo",Font.PLAIN,20));
		b13.setBounds(0,480,300,40);
		b13.addActionListener(this);
		p2.add(b13);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("home.jpg"));
		Image i2=i1.getImage().getScaledInstance(1950,1000, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel l1= new JLabel(i3);
		l1.setBounds(0,0,1950,1000);
	    add(l1);
		
		JLabel l2= new JLabel("DashBoard");
		l2.setBounds(70,15,200,30);
		l2.setForeground(new ColorUIResource(255,255,255));
	    l2.setFont(new FontUIResource("Tahoma",Font.BOLD,25 ));
		p1.add(l2);


		JLabel l3= new JLabel("Travel And Tourism Management System ");
		l3.setBounds(500,100,1200,30);
		l3.setForeground(new ColorUIResource(255,255,255));
	    l3.setFont(new FontUIResource("Tahoma",Font.BOLD,30 ));
	   l1.add(l3);
		

	  
	this.setVisible(true);	
}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1) {
			new AddCustomer(username).setVisible(true);
		}
		else if(ae.getSource()==b2) {
			new UpdateCustomer(username).setVisible(true);
		}
		else if(ae.getSource()==b3) {
			new ViewDetails(username).setVisible(true);
		}
		else if(ae.getSource()==b4) {
			new DeleteDetails(username).setVisible(true);
		}
		
		else if(ae.getSource()==b5) {
			new CHeckPackage().setVisible(true);
		}
		else if (ae.getSource()==b6) {
			new BookPackage(username).setVisible(true);
		}
		else if (ae.getSource()==b7) {
			new ViewPackage(username).setVisible(true);
		}
		else if (ae.getSource()==b8) {
			new CheckHotels().setVisible(true);
		}
		else if (ae.getSource()==b9) {
			new BookHotel(username).setVisible(true);
		}
		
		
		else if (ae.getSource()==b10) {
			new viewhoteldetails(username).setVisible(true);
		}

		else if (ae.getSource()==b11) {
			new CheckDestination().setVisible(true);
		}
		else if (ae.getSource()==b12) {
			new Payment().setVisible(true);
		}
		else if (ae.getSource()==b13) {
			new About().setVisible(true);
		}
	}
	
}


