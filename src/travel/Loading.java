package travel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
	Thread t;
	JProgressBar p;
	String username;
	public Loading(String user) {
		t=new Thread(this);
		getContentPane().setBackground(new ColorUIResource(255,255,255));
		setBounds(500,260,600,400);
		setLayout(null);
		
		JLabel l1= new JLabel("Travel And Tourism App");
		l1.setFont(new Font("Raleway",Font.BOLD,30));
		l1.setBounds(100,40,600,30);
		l1.setForeground(new ColorUIResource(0, 0, 255));
		add(l1);
	
		p= new JProgressBar();
		p.setStringPainted(true);
		p.setBounds(130,90,350,30);
		add(p);
		
		JLabel l2= new JLabel("Please Wait...");
		l2.setFont(new Font("Tohomo",Font.BOLD,16));
		l2.setBounds(250,130,600,30);
		l2.setForeground(new ColorUIResource(255, 0, 0));
		add(l2);
		
		 username=user;
		JLabel l3= new JLabel("Welcome " + username);
		l3.setFont(new Font("Tohimo",Font.BOLD,16));
		l3.setBounds(30,310,400,30);
		l3.setForeground(new ColorUIResource(255, 0, 0));
		add(l3);
		
		t.start();
		this.setVisible(true);
	}
	
	@Override
	public void run() {
		try {
			
			for (int i = 1; i <=101; i++) {
				int m=p.getMaximum();
				int n=p.getValue();
				if (n<m) {
					p.setValue(p.getValue()+1);
				}
				else {
					i=101;
					
					new Dashboard(username).setVisible(true);
					setVisible(false);
				
				}
				Thread.sleep(50);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
