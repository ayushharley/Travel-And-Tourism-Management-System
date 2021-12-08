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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class DeleteDetails extends JFrame implements ActionListener{
	JButton b1,b2;
	String username;
	public DeleteDetails(String username) {
	this.username=username;
	
		getContentPane().setBackground(new ColorUIResource(255,255,255));
		setBounds(200,180,900,550);
		setLayout(null);
		
		JLabel l21= new JLabel("Delete Personal Details");
		l21.setForeground(new ColorUIResource( 248, 103, 9 ));
	    l21.setFont(new FontUIResource("Tahoma",Font.BOLD,25 ));
		l21.setBounds(100, 30 ,400 ,25);
		add(l21);
			
			
			JPanel p1= new JPanel();
			p1.setBounds(30,80,500,400);
			p1.setBackground(new Color( 232, 125, 56 ));
			p1.setLayout(null);
			add(p1);
			
			JLabel l1= new JLabel("Username :");
		    l1.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
			l1.setBounds(50, 20 ,100 ,25);
			p1.add(l1);
				
			JLabel l10= new  JLabel();
			l10.setBounds(180, 20 ,200 ,25);
			l10.setBorder(BorderFactory.createEmptyBorder());
			p1.add(l10);
			

			JLabel l2= new JLabel("ID :");
		    l2.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
			l2.setBounds(50, 55 ,100 ,25);
			p1.add(l2);
			
			
			JLabel l12= new JLabel();
			l12.setBounds(180, 55 ,200 ,25);
			p1.add(l12);
				
			JLabel l3= new JLabel("ID no :");
		    l3.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
			l3.setBounds(50, 90 ,100 ,25);
			p1.add(l3);
				
			JLabel l13= new JLabel();
			l13.setBounds(180, 90 ,200 ,25);
			l13.setBorder(BorderFactory.createEmptyBorder());
			p1.add(l13);
			
			JLabel l4= new JLabel("Name :");
		    l4.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
			l4.setBounds(50, 125 ,100 ,25);
			p1.add(l4);
				
			JLabel l14= new JLabel();
			l14.setBounds(180, 125 ,200 ,25);
			l14.setBorder(BorderFactory.createEmptyBorder());
			p1.add(l14);
			
			JLabel l5= new JLabel("Gender :");
		    l5.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
			l5.setBounds(50, 160 ,100 ,25);
			p1.add(l5);
				
			JLabel l15= new JLabel();
			l15.setBounds(180, 160 ,200 ,25);
			l15.setBorder(BorderFactory.createEmptyBorder());
			p1.add(l15);
			

			JLabel l6= new JLabel("Country :");
		    l6.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
			l6.setBounds(50, 195  ,100 ,25);
			p1.add(l6);

			JLabel l16= new JLabel();
			l16.setBounds(180, 195 ,200 ,25);
			l16.setBorder(BorderFactory.createEmptyBorder());
			p1.add(l16);

			JLabel l7= new JLabel("Address :");
		    l7.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
			l7.setBounds(50, 230 ,80 ,25);
			p1.add(l7);
				
			JLabel l17= new JLabel();
			l17.setBounds(180, 230 ,150 ,45);
			l17.setBorder(BorderFactory.createEmptyBorder());
			p1.add(l17);
			

			JLabel l8= new JLabel("Phone no :");
		    l8.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
			l8.setBounds(50, 265 ,100 ,25);
			p1.add(l8);
				
			JLabel l18= new JLabel();
			l18.setBounds(180, 265 ,200 ,25);
			l18.setBorder(BorderFactory.createEmptyBorder());
			p1.add(l18);
			
			JLabel l9= new JLabel("Email :");
		    l9.setFont(new FontUIResource("Tahoma",Font.BOLD,14 ));
			l9.setBounds(50, 300 ,100 ,25);
			p1.add(l9);
				
			JLabel l19= new JLabel();
			l19.setBounds(180, 300 ,200 ,25);
			l19.setBorder(BorderFactory.createEmptyBorder());
			p1.add(l19);
			
			
			b1= new JButton("Delete");
			b1.setBounds(100, 350 ,100 ,25);
			b1.addActionListener(this);
			b1.setBackground(new Color(0,0,0));
			b1.setForeground(new Color(255,255,255));
			b1.setBorder(BorderFactory.createEmptyBorder());
			p1.add(b1);
			
			b2= new JButton("Back");
			b2.setBounds(250, 350 ,100 ,25);
			b2.addActionListener(this);
			b2.setBackground(new Color(0,0,0));
			b2.setForeground(new Color(255,255,255));
			b2.setBorder(BorderFactory.createEmptyBorder());
			p1.add(b2);
			
			
			ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("delete.png"));
			Image i5=i4.getImage().getScaledInstance(600,350, Image.SCALE_DEFAULT);
			ImageIcon i6= new ImageIcon(i5);
			JLabel l20= new JLabel(i6);
			l20.setBounds(390,110,600,350);
			add(l20);
			
			 try {
					String query="select * from customer where username='"+username+"'";
					   ResultSet rs=db.dbconnect.s.executeQuery(query);
					   while(rs.next()) {
						   l10.setText(rs.getString("username"));
						   l12.setText(rs.getString("id"));
						   l13.setText(rs.getString("idno"));
						   l14.setText(rs.getString("name"));
						   l15.setText(rs.getString("gender"));
						   l16.setText(rs.getString("country"));
						   l17.setText(rs.getString("address"));
						   l18.setText(rs.getString("phone"));
						   l19.setText(rs.getString("email"));
					   }
				} catch (Exception e) {
					// TODO: handle exception
				}
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			int r=JOptionPane.showConfirmDialog(null, "Do you really want to delete "
					,"Deleation confirmation",JOptionPane.YES_NO_OPTION);
			if(r==JOptionPane.YES_OPTION)
			{
				try {
					db.dbconnect.s.executeUpdate("delete from customer where username='"+username+"'");
					db.dbconnect.s.executeUpdate("delete from account where username='"+username+"'");
					db.dbconnect.s.executeUpdate("delete from bookPackage where username='"+username+"'");
					db.dbconnect.s.executeUpdate("delete from bookhotel where username='"+username+"'");
					
					JOptionPane.showMessageDialog(null, "Deleted succesefully");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
				}
			}
			
		}
		
		if(e.getSource()==b2)
		{
			this.setVisible(false);
		}
		
	}
	
}
