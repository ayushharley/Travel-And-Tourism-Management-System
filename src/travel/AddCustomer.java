package travel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class AddCustomer extends JFrame implements ActionListener{
	
	JTextField t1,t3,t4,t5,t6;
	JComboBox c1 ,c2;
	JRadioButton r1,r2;
	JButton b1,b2;
	JLabel l21,l22;
	public AddCustomer(String username) {
		
		
		getContentPane().setBackground(new ColorUIResource(255,255,255));
		setBounds(400,180,800,490);
		setLayout(null);
		
		
		JPanel p1= new JPanel();
		p1.setBounds(30,30,480,380);
		p1.setBackground(new Color(163,193,173));
		p1.setLayout(null);
		add(p1);
		
		JLabel l1= new JLabel("Username :");
	    l1.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l1.setBounds(50, 20 ,100 ,25);
		p1.add(l1);
			
		  l21= new  JLabel();
		l21.setBounds(210, 20 ,200 ,25);
		l21.setBorder(BorderFactory.createEmptyBorder());
		p1.add(l21);
		

		JLabel l2= new JLabel("ID :");
	    l2.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l2.setBounds(50, 55 ,100 ,25);
		p1.add(l2);
		
		c1= new JComboBox<>();
		c1.setBounds(210,55,200,25);
		c1.setBackground(new ColorUIResource(255,255,255));
		c1.addItem("Aadhar Card");
		c1.addItem("Passport");
		c1.addItem("Voting Card");
		c1.addItem("PanCard");
		p1.add(c1);
		
		JLabel l3= new JLabel("ID no :");
	    l3.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l3.setBounds(50, 90 ,100 ,25);
		p1.add(l3);
			
		  t1= new  JTextField();
		t1.setBounds(210, 90 ,200 ,25);
		t1.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t1);
		
		JLabel l4= new JLabel("Name :");
	    l4.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l4.setBounds(50, 125 ,100 ,25);
		p1.add(l4);
			
		 l22= new  JLabel();
		l22.setBounds(210, 125 ,200 ,25);
		l22.setBorder(BorderFactory.createEmptyBorder());
		p1.add(l22);
		
		JLabel l5= new JLabel("Gender :");
	    l5.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l5.setBounds(50, 160 ,100 ,25);
		p1.add(l5);
			
		r1= new JRadioButton("Male");
		r1.addActionListener(this);
		r1.setBounds(210, 160 ,70 ,25);
		r1.setBackground(new ColorUIResource(163,193,173));
		p1.add(r1);
		
		
		r2= new JRadioButton("Female");
		r2.addActionListener(this);
		r2.setBounds(285, 160 ,100 ,25);
		r2.setBackground(new ColorUIResource(163,193,173));
		p1.add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);


		JLabel l6= new JLabel("Country :");
	    l6.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l6.setBounds(50, 195 ,100 ,25);
		p1.add(l6);
			
		c2= new JComboBox<>();
		c2.setBounds(210, 195 ,200 ,25);
		c2.addItem("India");
		c2.addItem("Pakistan");
		c2.addItem("China");
		c2.addItem("Bangladesh");
		c2.addItem("UAE");
		c2.setBackground(new ColorUIResource(255,255,255));
		p1.add(c2);

		JLabel l7= new JLabel("Address :");
	    l7.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l7.setBounds(50, 230 ,100 ,25);
		p1.add(l7);
			
		 t4= new  JTextField();
		t4.setBounds(210, 230 ,200 ,25);
		t4.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t4);
		

		JLabel l8= new JLabel("Phone no :");
	    l8.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l8.setBounds(50, 265 ,100 ,25);
		p1.add(l8);
			
		 t5= new  JTextField();
		t5.setBounds(210, 265 ,200 ,25);
		t5.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t5);
		
		JLabel l9= new JLabel("Email :");
	    l9.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
		l9.setBounds(50, 300 ,100 ,25);
		p1.add(l9);
			
		 t6= new  JTextField();
		t6.setBounds(210, 300 ,200 ,25);
		t6.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t6);
		
		
		b1= new JButton("Add");
		b1.setBounds(70, 340 ,100 ,25);
		b1.addActionListener(this);
		b1.setBackground(new Color(0,0,0));
		b1.setForeground(new Color(255,255,255));
		b1.setBorder(BorderFactory.createEmptyBorder());
		p1.add(b1);
		
		b2= new JButton("Back");
		b2.addActionListener(this);
		b2.setBounds(260, 340 ,100 ,25);
		b2.setBackground(new Color(0,0,0));
		b2.setForeground(new Color(255,255,255));
		b2.setBorder(BorderFactory.createEmptyBorder());
		p1.add(b2);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("newcustomer.jpg"));
		Image i2=i1.getImage().getScaledInstance(400,500, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel l10= new JLabel(i3);
		l10.setBounds(420,40,450,420);
		add(l10);
		
		 try {
				String query="select * from account where username='"+username+"' ";
				   ResultSet rs=db.dbconnect.s.executeQuery(query);
				   while(rs.next()) {
					   l21.setText(rs.getString("username"));
					   l22.setText(rs.getString("name"));
				   }
			} catch (Exception e) {
				// TODO: handle exception
			}
		 
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(r1.isSelected()) {
			
			r2.setSelected(false);
			
			}
			else  if(r2.isSelected()) {
				r1.setSelected(false);
				
			}
			
		if(ae.getSource()==b1)
		{
			String username=l21.getText();
			String id=(String) c1.getSelectedItem();
			String idno= t1.getText();
			String name= l22.getText();
			String gender= "";
			if(r1.isSelected())
			{
				gender= "Male";
			}else if (r2.isSelected()){
				gender= "Female";
			}
			String country= (String) c2.getSelectedItem();
			String address= t4.getText();
			String phone= t5.getText();
			String email= t6.getText();
			
			String query= "insert into customer value('"+username+"','"+id+"','"+idno+"','"+name+"',"
					+ "'"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')  ";
			
			try {
				
				db.dbconnect.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Customer Added Succesfully");
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		else if(ae.getSource()==b2) {
			this.setVisible(false);
		}
		
	}



}
