package travel;

import javax.swing.JEditorPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Paytm extends JFrame{
public Paytm() {
	//jeditor pane ke andr juch bhi edit kr skte he
	JEditorPane j= new JEditorPane();
	j.setEditable(false);
	
	try {
		
		j.setPage("https://paytm.com/electricity-bill-payment");
	} catch (Exception e) {
		
            j.setContentType("text/html");
            j.setText("<html>Could not load 404 </html>");
	}
	
	
	add(j);
	setBounds(300,200,600,600);
	
	//for scroll 
	 JScrollPane scrollPane = new JScrollPane(j);     
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     getContentPane().add(scrollPane);
       this.setVisible(true);
	
}
	
}
