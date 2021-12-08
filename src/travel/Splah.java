package travel;

import java.awt.*;
import java.util.Iterator;

import javax.swing.*;
public class Splah {

	public static void main(String[] args) {
		
  SplashFrame frame= new SplashFrame();
	frame.setVisible(true);
	int x=1;
  for (int i=1; i<=500; i+=6, x+=7) {
   			frame.setLocation(460-(x+1)/2,300-(i/4));
   			frame.setSize(x+i,i);
   				
   			try {
				Thread.sleep(20);
			} catch (Exception e) {
				// TODO: handle exception
			}
   			
   			
   				frame.setVisible(true);
  }
   				
	}	

}

class SplashFrame extends JFrame implements Runnable{
	Thread t1;
	SplashFrame(){
		//ImageIcon i1 = lblImage.setIcon(new ImageIcon(getClass().getResource("/imagepac/logo.png")));
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("splash.jpg"));
		 Image i2 = i1.getImage().getScaledInstance(1400, 500,Image.SCALE_DEFAULT);
		 ImageIcon i3= new ImageIcon(i2);
	
		JLabel l1= new JLabel(i3);
	     add(l1);
	   
	     //setBounds(200,200,1000,400);
	     setUndecorated(true);
	  t1=new Thread(this);
	t1.start();
	}
	
	public void run() {
		
		try {
			Thread.sleep(5000);
			this.setVisible(false);
			new login().setVisible(true);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
}