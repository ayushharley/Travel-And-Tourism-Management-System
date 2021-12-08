package travel;

import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class CheckHotels extends JFrame implements Runnable {
	 JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19;
	 JLabel caption;
	 Thread t1;
	
	public void run(){
		
		   try {

	            l2.setVisible(true);
	            caption.setText("JW Marriott Hotel");
	            l2.add(caption);
	            Thread.sleep(2800);
	            l2.setVisible(false);
	            l3.setVisible(true);
	            caption.setText("Mandarin Oriental Hotel");
	            l3.add(caption);
	            l3.setVisible(true);
	            Thread.sleep(2800);
	            l3.setVisible(false);
	            l4.setVisible(true);
	            caption.setText("Four Seasons Hotel");
	            l4.add(caption);
	            Thread.sleep(2800);
	            l4.setVisible(false);
	            l5.setVisible(true);
	            caption.setText("Radisson Hotel");
	            l5.add(caption);
	            Thread.sleep(2800);
	            l5.setVisible(false);
	            l6.setVisible(true);
	            caption.setText("Classio Hotel");
	            l6.add(caption);
	            Thread.sleep(2800);
	            l6.setVisible(false);
	            l7.setVisible(true);
	            caption.setText("The Bay Club Hotel");
	            l7.add(caption);
	            Thread.sleep(2800);
	            l7.setVisible(false);
	            l8.setVisible(true);
	            caption.setText("Breeze Blows Hotel");
	            l8.add(caption);
	            Thread.sleep(2800);
	            l8.setVisible(false);
	            l9.setVisible(true);
	            caption.setText("Quick Stop Hotel");
	            l9.add(caption);
	            Thread.sleep(2800);
	            l9.setVisible(false);
	            l10.setVisible(true);
	            caption.setText("Happy Mornings Motel");
	            l10.add(caption);
	            Thread.sleep(2800);
	            l10.setVisible(false);
	            l11.setVisible(true);
	            caption.setText("Moss View Hotel");
	            l11.add(caption);
	            Thread.sleep(2800);
	            l11.setVisible(false);
	            
	            this.setVisible(false);
	            
	        } catch (Exception e) {
	            System.out.println(e);
	        }

	}
	
	public CheckHotels() {
		setBounds(400,200,700,520);
		setLayout(null);
		 
		//thread reference
		t1= new Thread(this);
		

        caption = new JLabel();
        caption.setBounds(30, 380, 1000, 70);
        caption.setForeground(Color.WHITE);
        caption.setFont(new Font("Tahoma", Font.BOLD, 40));
        add(caption);
	
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("hotel1.jpg"));
		Image i2=i1.getImage().getScaledInstance(680,480, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		 l2= new JLabel(i3);
		l2.setBounds(10,10,680,460);
		add(l2);

		
		

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("hotel2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(680,480, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i4);
        l3.setBounds(10, 10, 680,460);
        add(l3);


        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("hotel3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(680,480, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(10, 10, 680,460);
        add(l4);
  

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("hotel4.jpg"));
        Image i11 = i10.getImage().getScaledInstance(680,480, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(10, 10, 680,460);
        add(l5);
      

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("hotel5.jpg"));
        Image i14 = i13.getImage().getScaledInstance(680,480, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(10, 10, 680,460);
        add(l6);
       

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("hotel6.jpg"));
        Image i17 = i16.getImage().getScaledInstance(680,480, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(10, 10, 680,460);
        add(l7);
       

        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("hotel7.jpg"));
        Image i20 = i19.getImage().getScaledInstance(680,480, Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        l8 = new JLabel(i21);
        l8.setBounds(10, 10, 680,460);
        add(l8);


        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("hotel8.jpg"));
        Image i23 = i22.getImage().getScaledInstance(680,480, Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        l9 = new JLabel(i24);
        l9.setBounds(10, 10, 680,460);
        add(l9);
     

        ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("hotel9.jpg"));
        Image i26 = i25.getImage().getScaledInstance(680,480, Image.SCALE_DEFAULT);
        ImageIcon i27 = new ImageIcon(i26);
        l10 = new JLabel(i27);
        l10.setBounds(10, 10, 680,460);
        add(l10);


        ImageIcon i28 = new ImageIcon(ClassLoader.getSystemResource("hotel10.jpg"));
        Image i29 = i28.getImage().getScaledInstance(680,480, Image.SCALE_DEFAULT);
        ImageIcon i30 = new ImageIcon(i29);
        l11 = new JLabel(i30);
        l11.setBounds(10, 10, 680,460);
        add(l11);
      

        t1.start();
        this.setVisible(true);
		}
	
}