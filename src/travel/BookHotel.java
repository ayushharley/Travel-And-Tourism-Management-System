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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

import db.dbconnect;

public class BookHotel extends JFrame implements ActionListener {

	JTextField t1, t2;
	JComboBox c1,c2,c3;
	private JButton b1,b2,b3;
	   private JLabel l1,l2,l2a,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;

	public BookHotel(String username) {
		getContentPane().setBackground(new ColorUIResource(255, 255, 255));
		setBounds(300, 180, 950, 510);
		setLayout(null);

		JPanel p1 = new JPanel();
		p1.setBounds(30, 50, 500, 390);
		p1.setBackground(new Color(137, 197, 209));
		p1.setLayout(null);
		add(p1);

		l1 = new JLabel("Book Package");
		l1.setBounds(140, 10, 300, 30);
		l1.setFont(new FontUIResource("Tahoma", Font.BOLD, 30));
		l1.setForeground(new ColorUIResource(3, 138, 177));
		add(l1);

		 l2 = new JLabel("Username :");
		l2.setFont(new FontUIResource("Tahoma", Font.PLAIN, 17));
		l2.setBounds(35, 45, 200, 20);
		p1.add(l2);

		 l2a = new JLabel();
		l2a.setBounds(230, 45, 200, 20);
		l2a.setFont(new FontUIResource("Tahoma", Font.PLAIN, 17));
		p1.add(l2a);

		 l3 = new JLabel("Select Hotel :");
		l3.setBounds(35, 75, 200, 20);
		l3.setFont(new FontUIResource("Tahoma", Font.PLAIN, 17));
		p1.add(l3);

		c1 = new JComboBox<>();
		try {
			ResultSet rs=db.dbconnect.s.executeQuery("select * from hotel");
			while(rs.next()) {
				c1.addItem(rs.getString("name"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		c1.setBounds(230, 75, 200, 20);
		p1.add(c1);

		 l4 = new JLabel("Total Persons");
		l4.setBounds(35, 105, 200, 14);
		l4.setFont(new FontUIResource("Tahoma", Font.PLAIN, 17));
		p1.add(l4);

		t1 = new JTextField();
	
		t1.setBounds(230, 105, 200, 20);
		p1.add(t1);
		

		 l5 = new JLabel("Number of Days");
		l5.setBounds(35, 135, 200, 14);
		l5.setFont(new FontUIResource("Tahoma", Font.PLAIN, 17));
		p1.add(l5);

		t2 = new JTextField();
	
		t2.setBounds(230, 135, 200, 20);
		p1.add(t2);
		

		 l6 = new JLabel("AC ");
		l6.setBounds(35, 165, 200, 20);
		l6.setFont(new FontUIResource("Tahoma", Font.PLAIN, 17));
		p1.add(l6);
		
		String[] ac= {"yes","no"};
		c2= new JComboBox(ac);
		  c2.setBounds(230, 165, 200, 20);
          p1.add(c2);
		
           l7 = new JLabel("Food ");
  		l7.setBounds(35, 195, 200, 20);
  		l7.setFont(new FontUIResource("Tahoma", Font.PLAIN, 17));
  		p1.add(l7);
  		
  		String[] food= {"yes","no"};
  		c3= new JComboBox(ac);
  		  c3.setBounds(230, 195, 200, 20);
            p1.add(c3);
  		
            l7= new JLabel("ID :");
    	    l7.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
    		l7.setBounds(35, 225 ,100 ,20);
    		p1.add(l7);
    		
    		 l8= new JLabel();
    	    l8.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
    		l8.setBounds(230, 225 ,200 ,20);
    		p1.add(l8);
    		
    		 l9= new JLabel("ID no :");
    	    l9.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
    		l9.setBounds(35, 255 ,100 ,20);
    		p1.add(l9);
    			

    		 l10= new JLabel();
    	    l10.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
    		l10.setBounds(230, 255 ,100 ,20);
    		p1.add(l10);
    	
    		 l11= new JLabel("Phone no:");
    	    l11.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
    		l11.setBounds(35, 285 ,100 ,20);
    		p1.add(l11);
    			

    		 l12= new JLabel();
    	    l12.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
    		l12.setBounds(230, 285 ,180 ,20);
    		p1.add(l12);
    		

    		 l13= new JLabel("Total Price:");
    	    l13.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
    		l13.setBounds(35, 315 ,180 ,20);
    		p1.add(l13);
    			

    		 l14= new JLabel();
    	    l14.setFont(new FontUIResource("Tahoma",Font.PLAIN,17 ));
    	    l14.setForeground(new ColorUIResource(219, 33, 33));
    		l14.setBounds(230, 315 ,200 ,20);
    		p1.add(l14);
    		
    		b1= new JButton("Check Price");
    		b1.setBounds(50, 350 ,100 ,25);
    		b1.addActionListener(this);
    		b1.setBackground(new Color(0,0,0));
    		b1.setForeground(new Color(255,255,255));
    		b1.setBorder(BorderFactory.createEmptyBorder());
    		p1.add(b1);
    		
    		b2= new JButton("Book hotel");
    		b2.setBounds(160, 350 ,110 ,25);
    		b2.addActionListener(this);
    		b2.setBackground(new Color(0,0,0));
    		b2.setForeground(new Color(255,255,255));
    		b2.setBorder(BorderFactory.createEmptyBorder());
    		p1.add(b2);
    		
    		b3= new JButton("Back");
    		b3.setBounds(280, 350 ,100 ,25);
    		b3.addActionListener(this);
    		b3.setBackground(new Color(0,0,0));
    		b3.setForeground(new Color(255,255,255));
    		b3.setBorder(BorderFactory.createEmptyBorder());
    		p1.add(b3);
    		

    		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("book.jpg"));
    		Image i2=i1.getImage().getScaledInstance(365,360, Image.SCALE_DEFAULT);
    		ImageIcon i3= new ImageIcon(i2);
    		JLabel l15= new JLabel(i3);
    		l15.setBounds(550,65,365,360);
    		add(l15);
    		try {
				ResultSet rs= db.dbconnect.s.executeQuery("select * from customer where username='"+username+"'");
				while(rs.next()) {
					l2a.setText(rs.getString("username"));
					l8.setText(rs.getString("id"));
					l10.setText(rs.getString("idno"));
					l12.setText(rs.getString("id"));
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
		
		try {
			ResultSet rs= db.dbconnect.s.executeQuery("select * from hotel where name"
					+ "='"+c1.getSelectedItem()+"'");
			while(rs.next()) {
				int cost=Integer.parseInt(rs.getString("cost_per_day"));
				int food=Integer.parseInt(rs.getString("food_charges"));
				int ac=Integer.parseInt(rs.getString("ac_charges"));
				
				  
                int persons = Integer.parseInt(t1.getText());
                int days = Integer.parseInt(t2.getText());
                
                String acprice = (String) c2.getSelectedItem();
                String foodprice = (String) c3.getSelectedItem();
						
                if(persons * days > 0) {
                    int total = 0;
                    total += acprice.equals("yes") ? ac : 1;
                    total += foodprice.equals("yes") ? food : 1;
                    total += cost;
                    total = total * persons * days;
                    l14.setText("Rs "+total);
                }
                else {
                	   l14.setText("insert a valid number");
				}
                
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	if(ae.getSource()==b2) {
		
		try {
			db.dbconnect.s.executeUpdate("insert into bookhotel values"
			+ "('"+l2a.getText()+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', "
			+ "'"+t2.getText()+"', '"+c2.getSelectedItem()+"', '"+c3.getSelectedItem()+"', "
				+ "'"+l8.getText()+"', '"+l10.getText()+"', '"+l12.getText()+"', '"+l14.getText()+"')");
			   
			JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                        setVisible(false);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	else if (ae.getSource()==b3) {
		  this.setVisible(false);
	  }
		
	 
	}


}
