package travel;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

import db.dbconnect;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookPackage extends JFrame implements ActionListener{
    private JTextField 	 t1;
    private JLabel l1,l2,l3,l4,l5,l7,l8,l9,l10,l11,l12,l13,l14;
    private JComboBox c1;
	private JButton b1,b2,b3;
	
	public BookPackage(String username) {
	setBounds(300,200,900,470);
	setLayout(null);
		
	
	 l1= new JLabel("Book Package");
	l1.setBounds(140,10,300,30);
	 l1.setFont(new FontUIResource("Tahoma",Font.BOLD,30));
	 l1.setForeground(new ColorUIResource(219, 33, 33));
	 add(l1);
		
		
		JPanel p1= new JPanel();
		p1.setBounds(30,50,420,350);
		p1.setBackground(new Color(216, 155, 155));
		p1.setLayout(null);
		add(p1);
		
		
		 l2= new JLabel("Username :");
	    l2.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
		l2.setBounds(20, 30 ,100 ,25);
		p1.add(l2);
		

		 l3= new JLabel();
	    l3.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
		l3.setBounds(200, 30 ,100 ,25);
		p1.add(l3);

		 l4= new JLabel("Select Package :");
	    l4.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
		l4.setBounds(20, 65 ,240 ,25);
		p1.add(l4);
		
		String[] packages= {"Gold package", "Silver package","Bronze package"};
	     c1= new JComboBox<>(packages);  
	    c1.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
		c1.setBounds(200, 65 ,150 ,25);
		p1.add(c1);
		
		 l5= new JLabel("Total Person :");
	    l5.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
		l5.setBounds(20, 100 ,180 ,25);
		p1.add(l5);
		
		 t1= new JTextField();
	    t1.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
		t1.setBounds(200, 100 ,150 ,25);
		p1.add(t1);
		

		 l7= new JLabel("ID :");
	    l7.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l7.setBounds(20, 135 ,100 ,25);
		p1.add(l7);
		
		 l8= new JLabel();
	    l8.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
		l8.setBounds(200, 135 ,200 ,25);
		p1.add(l8);
		
		 l9= new JLabel("ID no :");
	    l9.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l9.setBounds(20, 170 ,100 ,25);
		p1.add(l9);
			

		 l10= new JLabel();
	    l10.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
		l10.setBounds(200, 170 ,100 ,25);
		p1.add(l10);
	
		 l11= new JLabel("Phone no:");
	    l11.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l11.setBounds(20, 205 ,100 ,25);
		p1.add(l11);
			

		 l12= new JLabel();
	    l12.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
		l12.setBounds(200, 205 ,180 ,25);
		p1.add(l12);
		

		 l13= new JLabel("Total Price:");
	    l13.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l13.setBounds(20, 240 ,180 ,25);
		p1.add(l13);
			

		 l14= new JLabel();
	    l14.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
	    l14.setForeground(new ColorUIResource(219, 33, 33));
		l14.setBounds(200, 240 ,100 ,25);
		p1.add(l14);
		
		b1= new JButton("Check Price");
		b1.setBounds(50, 280 ,100 ,25);
		b1.addActionListener(this);
		b1.setBackground(new Color(0,0,0));
		b1.setForeground(new Color(255,255,255));
		b1.setBorder(BorderFactory.createEmptyBorder());
		p1.add(b1);
		
		b2= new JButton("Book Package");
		b2.setBounds(160, 280 ,110 ,25);
		b2.addActionListener(this);
		b2.setBackground(new Color(0,0,0));
		b2.setForeground(new Color(255,255,255));
		b2.setBorder(BorderFactory.createEmptyBorder());
		p1.add(b2);
		
		b3= new JButton("Back");
		b3.setBounds(280, 280 ,100 ,25);
		b3.addActionListener(this);
		b3.setBackground(new Color(0,0,0));
		b3.setForeground(new Color(255,255,255));
		b3.setBorder(BorderFactory.createEmptyBorder());
		p1.add(b3);
		

		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("book.jpg"));
		Image i2=i1.getImage().getScaledInstance(400,300, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel l15= new JLabel(i3);
		l15.setBounds(480,70,400,320);
		add(l15);
		try {
			ResultSet rs=db.dbconnect.s.executeQuery("select * from customer where username='"+username+"' ");
			while(rs.next()) {
				l3.setText(rs.getString("username"));
				l8.setText(rs.getString("id"));
				l10.setText(rs.getString("idno"));
				l12.setText(rs.getString("phone"));
				
			}
			
		} catch (Exception e) {
		
		}
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
	  if (ae.getSource()==b1) {
		  
		 String p=(String)c1.getSelectedItem();
		  
			int cost=0;
			if(p.equals("Gold package")) {
				cost+=12000;
				
			}else if(p.equals("Silver package")) {
				cost+=24000;
			}else if(p.equals("Bronze package")) {
				cost+=36000;
			}
			
			int person=Integer.parseInt(t1.getText()); 
		   cost*=person;
			l14.setText("Rs"+ cost);
	}
	  else if (ae.getSource()==b2) {
		
		  try {
			
			  db.dbconnect.s.executeUpdate("insert into bookPackage values"
			+ "('"+l3.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"',"
			+ " '"+l8.getText()+"','"+l10.getText()+"','"+l12.getText()+"','"+l14.getText()+"')");
			  JOptionPane.showMessageDialog(null, "Package Book Succesfully");
			  this.setVisible(false);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	  else if (ae.getSource()==b3) {
		  this.setVisible(false);
	  }
		
	}
	
	



}
