package travel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

import java.awt.*;


public class CHeckPackage extends JFrame{
	CHeckPackage(){
		setBounds(400,100,800,470);
		
		String[] package1= new String[] {"Gold Package","6 Days and & 5Nights","Airport Assistance",
				"Half Day City Tour","Daily Buffet","Weekend Drinks On Arrival","Full 3 days Island Cruise",
				"English Speking Guide","BOOK NOW","Summer Special","12000-/","package1.jpg"};
		
		String[] package2= new String[] {"Silver Package","5 Days and & 4Nights","Toll Free And Free TIcket",
				"Meet and Greet at Airport","Night Sufari","Full Day 3 Island Cruise","Full 3 days Island Cruise",
				"Cruise with Dinner","BOOK NOW","Vinter Special","24000-/","package2.jpg"};
		
		String[] package3= new String[] {"Broze Package","6 Days and & 5Nights","Return Airfair",
				"Horse riding and other games","Night Sufari","Full Day 3 Island Cruise","Full 3 days Island Cruise",
				"Welcome Drink On Arrival","BOOK NOW","Vinter Special","32000-/","package3.jpg"};
		
		
		JPanel p1= createPackage(package1);
		

		JPanel p2= createPackage(package2);
		
		JPanel p3= createPackage(package3);
		
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("Package 1", null,p1);
		
		pane.addTab("Package 2", null,p2);
		
		pane.addTab("Package 3",null, p3);
		add(pane ,BorderLayout.CENTER);
		
		
		
	}
	public JPanel createPackage(String[] pack ) {
		
		
		JPanel p1= new JPanel();
		p1.setLayout(null);
		p1.setBackground(new ColorUIResource(255, 255, 255));

		
		JLabel l1 = new JLabel(pack[0]);
       l1.setBounds(10,10,300,30);
       l1.setFont(new FontUIResource("Tahoma",Font.PLAIN,30));
       p1.add(l1);
       
       JLabel l2 = new JLabel(pack[1]);
       l2.setBounds(10,70,300,30);
       l2.setForeground(new ColorUIResource(255, 46, 0 ));
       l2.setFont(new FontUIResource("Tahoma",Font.PLAIN,20));
       p1.add(l2);

       JLabel l3 = new JLabel(pack[2]);
       l3.setBounds(10,110,300,25);
       l3.setForeground(new ColorUIResource(0, 15, 255));
       l3.setFont(new FontUIResource("Tahoma",Font.PLAIN,20));
       p1.add(l3);

       JLabel l4 = new JLabel(pack[3]);
       l4.setBounds(10,145,300,30);
       l4.setForeground(new ColorUIResource(255, 46, 0 ));
       l4.setFont(new FontUIResource("Tahoma",Font.PLAIN,20));
       p1.add(l4);
       
       JLabel l5 = new JLabel(pack[4]);
       l5.setBounds(10,185,300,25);
       l5.setForeground(new ColorUIResource(0, 15, 255));
       l5.setFont(new FontUIResource("Tahoma",Font.PLAIN,20));
       p1.add(l5);
		
       JLabel l6 = new JLabel(pack[5]);
       l6.setBounds(10,220,300,25);
       l6.setForeground(new ColorUIResource(255, 46, 0 ));
       l6.setFont(new FontUIResource("Tahoma",Font.PLAIN,20));
       p1.add(l6);
       
       JLabel l7 = new JLabel(pack[6]);
       l7.setBounds(10,255,300,25);
       l7.setForeground(new ColorUIResource(0, 15, 255));
       l7.setFont(new FontUIResource("Tahoma",Font.PLAIN,20));
       p1.add(l7);
       
       JLabel l8 = new JLabel(pack[7]);
       l8.setBounds(10,290,300,25);
       l8.setForeground(new ColorUIResource(255, 46, 0 ));
       l8.setFont(new FontUIResource("Tahoma",Font.PLAIN,20));
       p1.add(l8);
       
       JLabel l9 = new JLabel(pack[8]);
       l9.setBounds(10,330,300,35);
       l9.setForeground(new ColorUIResource(0, 15, 255));
       l9.setFont(new FontUIResource("Tahoma",Font.PLAIN,30));
       p1.add(l9);
       
       JLabel l10 = new JLabel(pack[9]);
       l10.setBounds(350,370,300,25);
       l10.setForeground(new ColorUIResource(255, 46, 0 ));
       l10.setFont(new FontUIResource("Tahoma",Font.PLAIN,20));
       p1.add(l10);
       
       JLabel l11 = new JLabel(pack[10]);
       l11.setBounds(650,370,300,25);
       l11.setForeground(new ColorUIResource(255, 46, 0 ));
       l11.setFont(new FontUIResource("Tahoma",Font.PLAIN,20));
       p1.add(l11);
       
       ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource(pack[11]));
		Image i2=i1.getImage().getScaledInstance(500,300, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel l12= new JLabel(i3);
		l12.setBounds(300,30,460,300);
		p1.add(l12);
//		
       
       
       
       
		this.setVisible(true);
		return p1;
	}
	
}
