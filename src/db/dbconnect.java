package db;

import java.sql.*;

import javax.swing.JOptionPane;

public class dbconnect {
	public static Connection c;
	public static Statement s;
	static {
		try {
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","7219791328aA@");
			s= c.createStatement();	
		}catch (Exception ex) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, ex);
		}
	}

}

