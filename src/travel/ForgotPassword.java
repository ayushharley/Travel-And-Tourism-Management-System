package travel;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ForgotPassword extends JFrame implements ActionListener {

	JButton b1,b2,b3;
	JTextField t1,t2,t3,t4,t5;
	
	ForgotPassword(){
		
		getContentPane().setBackground(new ColorUIResource(255,255,255));
		setBounds(200,220,800,350);
		setLayout(null);
		
		JPanel p1= new JPanel();
		p1.setBounds(30,30,520,260);
		p1.setBackground(new Color(208,208,208));
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
		
		b1=new JButton("search");
		  b1.addActionListener(this);
		b1.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		b1.setBackground(new Color(96,96,96));
		b1.setForeground(new Color(255,255,255));
		b1.setBounds(420, 20 ,90 ,25);
		p1.add(b1);
		
		
		JLabel l2= new JLabel("Name");
	    l2.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l2.setBounds(50, 60 ,100 ,25);
		p1.add(l2);
		
		 t2= new  JTextField();
		t2.setBounds(210, 60 ,200 ,25);
		t2.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t2);
		
		JLabel l4= new JLabel("Security Question");
	    l4.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l4.setBounds(50, 100 ,145 ,25);
		p1.add(l4);
			
		
		 t3= new  JTextField();
		 t3.setBorder(BorderFactory.createEmptyBorder());
		t3.setBounds(210, 100 ,200 ,25);
		p1.add(t3);

		JLabel l5= new JLabel("Anwser");
	    l5.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l5.setBounds(50, 140 ,100 ,25);
		p1.add(l5);
			
		 t4= new  JTextField();
		t4.setBounds(210, 140 ,200 ,25);
		t4.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t4);
		
		
		b2=new JButton("Retrive");
		  b2.addActionListener(this);
		b2.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		b2.setBackground(new Color(96,96,96));
		b2.setForeground(new Color(255,255,255));
		b2.setBounds(420, 140 ,90 ,25);
		p1.add(b2);
		
		JLabel l3= new JLabel("Password");
	    l3.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l3.setBounds(50, 180 ,100 ,25);
		p1.add(l3);
			
		 t5= new  JTextField();
		t5.setBounds(210, 180 ,200 ,25);
		t5.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t5);
		
		
		b3=new JButton("Back");
		  b3.addActionListener(this);
		b3.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		b3.setBackground(new Color(96,96,96));
		b3.setForeground(new Color(255,255,255));
		b3.setBounds(90, 220 ,90 ,25);
		p1.add(b3);
		
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("forgotpassword.jpg"));
		Image i2=i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel l6= new JLabel(i3);
		l6.setBounds(570,50,200,200);
		add(l6);
		
		
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1) {
		
		try {
			String query= "select * from account where username ='"+t1.getText()+"'";
		ResultSet rs=db.dbconnect.s.executeQuery(query);
			while (rs.next()) {
				t2.setText(rs.getString("name"));
				t3.setText(rs.getString("security"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		else if(ae.getSource()==b2) {
			try {
				String query= "select * from account where answer ='"+t4.getText()+"' AND "
						+ "username= '"+t1.getText()+"'";
			ResultSet rs=db.dbconnect.s.executeQuery(query);
				while (rs.next()) {
					
					t5.setText(rs.getString("password"));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
		else if(ae.getSource()==b3) {
			this.setVisible(false);
			new login().setVisible(true);
		}
	}
	
}
