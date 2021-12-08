package travel;


import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorListener;

import java.awt.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import java.awt.event.*;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	JTextField t1;
	JPasswordField t2;
public login() {
	
	setLayout(null);
	
//	setSize(400,400);
//	setLocation(400,200);
	
	getContentPane().setBackground(new ColorUIResource(255,255,255));
	setBounds(250,200,900,400);
	
	//jpanel
	
	JPanel p1= new JPanel();
	p1.setBounds(0,0,400,400);
	p1.setBackground(new ColorUIResource(131,193,233));
	add(p1);
	
	ImageIcon i1= new ImageIcon
			(ClassLoader.getSystemResource("login.png"));
	JLabel l1= new JLabel(i1);
	
	l1.setBounds(0,0,400,400);
	p1.setLayout(null);
	p1.add(l1);
	
	
	JPanel p2= new JPanel();
	p2.setLayout(null);
	p2.setBounds(400,30,450,300);
	add(p2);
	
	
	JLabel l2 =new JLabel("Username");
	l2.setBounds(60,20,150,25);
	l2.setFont(new FontUIResource("SAN SERIF", 100, 20));
	p2.add(l2);
	
	 t1= new JTextField();
	t1.setBounds(60,60,300,30);
	t1.setBorder(BorderFactory.createEmptyBorder());
	p2.add(t1);
	
	
	
   JLabel l3 =new JLabel("Password");
	l3.setBounds(60,110,150,25);
	l3.setFont(new FontUIResource("SAN SERIF", 100, 20));
	p2.add(l3);
	
	 t2= new JPasswordField();
	t2.setBounds(60,150,300,30);
	t2.setBorder(BorderFactory.createEmptyBorder());
	p2.add(t2);
	
	 b1= new JButton("Login");
	b1.addActionListener(this);
	b1.setBounds(60,200,130,30);
   b1.setBackground(new Color(133,193,233));
	b1.setForeground(new Color(255,255,255));
	b1.setBorder(BorderFactory.createEmptyBorder());
	p2.add(b1);
	
	 b2= new JButton("SignUp");
	b2.addActionListener(this);
	b2.setBounds(230,200,130,30);
	b2.setForeground(new Color(13,193,233));
	b2.setBackground(new Color(255,255,255));
	b2.setBorder(new LineBorder(new Color(133,193,233)));
	p2.add(b2);
	
	
	b3= new JButton("Forgot Password");
	b3.addActionListener(this);
	b3.setBounds(130,250,160,30);
	b3.setForeground(new Color(13,193,233));
	b3.setBackground(new Color(255,255,255));
	b3.setBorder(BorderFactory.createEmptyBorder());
	p2.add(b3);
	
	JLabel l4= new JLabel("Trouble in login...");
	l4.setBounds(300,250,130,30);
	l4.setForeground(new Color(255, 0,0));
	p2.add(l4);
	this.setVisible(true);
	
}
			@Override
			public void actionPerformed(ActionEvent ae) {
					if(ae.getSource()==b1) {
						
						try {
							String username=t1.getText();
							String password= t2.getText();
							String query= "select * from account where username= '"+username+"'"
									+ " AND password='"+password+"'";
							
							ResultSet rs=db.dbconnect.s.executeQuery(query);
							if(rs.next()) {
								new Loading(username).setVisible(true);
								this.setVisible(false);
							}
							else {
								JOptionPane.showMessageDialog(null, "Invalid Crediantials");
							}
							
						} catch (Exception e) {
							// TODO: handle exception
						}
						
					}
					else if (ae.getSource()==b2) {
					new Signup().setVisible(true);
					this.setVisible(false);
						
					}
					else if (ae.getSource()==b3) {
						
						new ForgotPassword().setVisible(true);
						this.setVisible(false);
					}
		
}
                     	
}
