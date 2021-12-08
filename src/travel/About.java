package travel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class About extends JFrame implements ActionListener{
	JButton b1;
public About() {
	setBounds(400,200,600,500);
	setLayout(null);
	getContentPane().setBackground(Color.WHITE);
	
	JLabel l1=new JLabel("Travel And Tourism Management System ");
	l1.setBounds(30,40,550,25);
	l1.setFont(new Font("Raleway", Font.BOLD, 23));
	l1.setForeground(new ColorUIResource(3, 138, 177));
	add(l1);
	

   String s = "                                    About Projects          \n  "
            + "\nThe objective of the Travel and Tourism Management System"
            + "project is to develop a system that automates the processes "
            + "and activities of a travel and the purpose is to design a "
            + "system using which one can perform all operations related to "
            + "traveling.\n\n"
            + "This application will help in accessing the information related "
            + "to the travel to the particular destination with great ease. "
            + "The users can track the information related to their tours with "
            + "great ease through this application. The travel agency information "
            + "can also be obtained through this application.\n\n"
            + "Advantages of Project:"
            + "\n Gives accurate information"
            + "\n Simplifies the manual work"
            + "\n It minimizes the documentation related work"
            + "\n Provides up to date information"
            + "\n Friendly Environment by providing warning messages."
            + "\n travelers details can be provided"
            + "\n booking confirmation notification"
            ;

    TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
    t1.setEditable(false);
    t1.setBounds(80, 100, 450, 300);

    add(t1);
	
    b1= new JButton("Back");
	b1.addActionListener(this);
	b1.setBounds(260, 410 ,100 ,35);
	b1.setBackground(new Color(3, 138, 177));
	b1.setForeground(new Color(255,255,255));
	b1.setFont(new Font("Raleway", Font.BOLD, 17));
	b1.setBorder(BorderFactory.createEmptyBorder());
    add(b1);
	this.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1)
	{
		this.setVisible(false);
	}
	
}
}

