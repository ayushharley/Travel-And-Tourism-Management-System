
package travel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class viewhoteldetails  extends JFrame implements ActionListener{
	 private JLabel l1,l2,l3,l4,l5,l7,l8,l9,l10,l11,l12,l13,
	 l14,l15,l16,l17,l18,l19,l20,l21,l22,l23;
	 private JButton b1;
	 viewhoteldetails (String username){
		
		setBounds(350,200,850,530);
		setLayout(null);
			
		
		 l1= new JLabel("View Hotel Details");
		l1.setBounds(80,10,400,26);
		 l1.setFont(new FontUIResource("Tahoma",Font.BOLD,26));
		 l1.setForeground(new ColorUIResource(0, 173, 24));
		 add(l1);
			
			
			JPanel p1= new JPanel();
			p1.setBounds(30,50,420,410);
			p1.setBackground(new Color(220, 120, 201 ));
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

				 l4= new JLabel("Hotel :");
			    l4.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
				l4.setBounds(20, 65 ,240 ,25);
				p1.add(l4);
		
				l16= new JLabel();
			    l16.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
				l16.setBounds(200, 65 ,150 ,25);
				p1.add(l16);
				
				 l5= new JLabel("Total Person :");
				    l5.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
					l5.setBounds(20, 100 ,180 ,25);
					p1.add(l5);
					
					l15=new JLabel();
				    l15.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
					l15.setBounds(200, 100 ,150 ,25);
					p1.add(l15);
					

					 l18 = new JLabel("Days");
					l18.setBounds(20, 135, 200, 25);
					l18.setFont(new FontUIResource("Tahoma", Font.PLAIN, 17));
					p1.add(l18);

					JLabel l19= new JLabel();
					l19.setBounds(200, 135, 200, 25);
					p1.add(l19);
					

					 l20 = new JLabel("AC ");
					l20.setBounds(20, 170, 200, 25);
					l20.setFont(new FontUIResource("Tahoma", Font.PLAIN, 17));
					p1.add(l20);
					
					 l21 = new JLabel();
						l21.setBounds(200, 170, 200, 25);
						l21.setFont(new FontUIResource("Tahoma", Font.PLAIN, 17));
						p1.add(l21);
					
			           l22 = new JLabel("Food ");
			  		l22.setBounds(20, 205, 200, 25);
			  		l22.setFont(new FontUIResource("Tahoma", Font.PLAIN, 17));
					p1.add(l22);
					
					 l23 = new JLabel();
						l23.setBounds(200, 205, 200, 25);
						l23.setFont(new FontUIResource("Tahoma", Font.PLAIN, 17));
						p1.add(l23);
					

					 l7= new JLabel("ID :");
				    l7.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
				    l7.setBounds(20, 230 ,100 ,25);
					p1.add(l7);
					
					 l8= new JLabel();
				    l8.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
					l8.setBounds(200, 230 ,100 ,25);
					p1.add(l8);
					
					 l9= new JLabel("ID no :");
				    l9.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
					l9.setBounds(20, 265 ,100 ,25);
					p1.add(l9);
						

					 l10= new JLabel();
				    l10.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
					l10.setBounds(200, 265 ,100 ,25);
					p1.add(l10);
				
					 l11= new JLabel("Phone no:");
				    l11.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
					l11.setBounds(20, 300 ,100 ,25);
					p1.add(l11);
						

					 l12= new JLabel();
				    l12.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
					l12.setBounds(200, 300 ,180 ,25);
					p1.add(l12);
					

					 l13= new JLabel("Total Price:");
				    l13.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
					l13.setBounds(20, 335 ,180 ,25);
					p1.add(l13);
						

					 l14= new JLabel();
				    l14.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
				    l14.setForeground(new ColorUIResource(219, 33, 33));
					l14.setBounds(200, 335 ,100 ,25);
					p1.add(l14);
		
					b1= new JButton("Back");
					b1.addActionListener(this);
					b1.setBounds(150, 375 ,100 ,25);
					b1.setBackground(new Color(0,0,0));
					b1.setForeground(new Color(255,255,255));
					b1.setBorder(BorderFactory.createEmptyBorder());
					p1.add(b1);
					
					ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("bookedDetails.jpg"));
					Image i2=i1.getImage().getScaledInstance(340,380, Image.SCALE_DEFAULT);
					ImageIcon i3= new ImageIcon(i2);
					JLabel l17= new JLabel(i3);
					l17.setBounds(470,60,340,380);
					add(l17);

					
					try {
						
						ResultSet rs=db.dbconnect.s.executeQuery
								("select * from bookhotel where username='"+username+"'");
								while(rs.next()) {
									l3.setText(rs.getString("username"));
									l16.setText(rs.getString("hotel"));
									l15.setText(rs.getString("persons"));
									l19.setText(rs.getString("days"));
									l21.setText(rs.getString("ac"));
									l23.setText(rs.getString("food"));
									l8.setText(rs.getString("id"));
									l10.setText(rs.getString("idno"));
									l12.setText(rs.getString("phone"));
									l14.setText(rs.getString("cost"));
								}
					} catch (Exception e) {
						// TODO: handle exception
					}
					this.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
		{
			this.setVisible(false);
		}
			
		
	}
	
}
