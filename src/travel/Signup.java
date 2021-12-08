package travel;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import java.awt.event.*;
import java.sql.SQLException;


public class Signup extends JFrame implements ActionListener {

	JButton b1,b2;
	JTextField t1,t2,t3,t4;
	JComboBox c1;
	
	Signup(){
		getContentPane().setBackground(new ColorUIResource(255,255,255));
		setBounds(200,220,800,350);
		setLayout(null);
		
	JPanel p1= new JPanel();
	p1.setBounds(0,0,500,350);
	p1.setBackground(new Color(133,193,233));
	p1.setLayout(null);
	add(p1);
		
	JLabel l1= new JLabel("Username");
    l1.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
	l1.setBounds(50, 20 ,100 ,25);
	p1.add(l1);
		
	 t1= new  JTextField();
	t1.setBounds(210, 20 ,200 ,25);
	t1.setBorder(BorderFactory.createEmptyBorder());
	p1.add(t1);
	
	JLabel l2= new JLabel("Name");
    l2.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
	l2.setBounds(50, 60 ,100 ,25);
	p1.add(l2);
		
	 t2= new  JTextField();
	t2.setBounds(210, 60 ,200 ,25);
	t2.setBorder(BorderFactory.createEmptyBorder());
	p1.add(t2);
	
	JLabel l3= new JLabel("Password");
    l3.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
	l3.setBounds(50, 100 ,100 ,25);
	p1.add(l3);
		
	 t3= new  JTextField();
	t3.setBounds(210, 100 ,200 ,25);
	t3.setBorder(BorderFactory.createEmptyBorder());
	p1.add(t3);
	
	
	JLabel l4= new JLabel("Security Question");
    l4.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
	l4.setBounds(50, 140 ,145 ,25);
	p1.add(l4);
		
	
	 c1= new JComboBox<>();
	c1.addItem("What is your lucky number");
	c1.addItem("What is your nickname");
	c1.addItem("What is your mother name");
	c1.addItem("which is your first pet ");
	c1.setBounds(210, 140 ,200 ,25);
	p1.add(c1);

	JLabel l5= new JLabel("Anwser");
    l5.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
	l5.setBounds(50, 180 ,100 ,25);
	p1.add(l5);
		
	 t4= new  JTextField();
	t4.setBounds(210, 180 ,200 ,25);
	t4.setBorder(BorderFactory.createEmptyBorder());
	p1.add(t4);
	
	 b1= new JButton("Create");
    b1.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
    b1.addActionListener(this);
    b1.setForeground(new Color(13,193,233));
  	b1.setBackground(new Color(255,255,255));
  	b1.setBorder(new LineBorder(new Color(133,193,233)));
	b1.setBounds(100, 250 ,120 ,30);
	p1.add(b1);
	
  b2= new JButton("Back");
    b2.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
    b2.addActionListener(this);
    b2.setForeground(new Color(13,193,233));
	b2.setBackground(new Color(255,255,255));
	b2.setBorder(new LineBorder(new Color(133,193,233)));
	b2.setBounds(270, 250 ,120 ,30);
	p1.add(b2);
	
//	
//	JPanel p2= new JPanel();
//	p2.setBounds(500,350,400,350);
////	p2.setBackground(new Color(133,193,233));
//	p2.setLayout(null);
//	add(p2);
	
	ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("signup.png"));
	JLabel l6= new JLabel(i1);
	l6.setBounds(550,50,200,200);
	add(l6);
	
	
	
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
	
		if(ae.getSource()==b1) {
			String username = t1.getText();
			String name = t2.getText();
			String password = t3.getText();
			String security = (String) c1.getSelectedItem();
			String answer = t4.getText();
			
			String query  = "insert into account (username,name,password,security,answer)values('"+username+"','"+name+"'"
					+ ",'"+password+"','"+security+"','"+answer+"')" ;
			try {
				db.dbconnect.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Account created succesfully");
				this.setVisible(false);
				new login().setVisible(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null,e);
			}
			
		}
		else if (ae.getSource()==b2) {
		new login().setVisible(true);
		this.setVisible(false);
			
		}
	}
	
}
