package View;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.net.ConnectException;
import java.sql.*;



public class baglanti {
	static Connection con;
	static java.sql.Statement stat;
	
	static ResultSet yap()
	{
		ResultSet rs = null;
		try{  
		con = DriverManager.getConnection("jdbc:mariadb://localhost:3307/hospital?user=root&password=5757");
	 	stat = con.createStatement();	
	 	rs = stat.executeQuery("Select * from appointment");	
	}
		catch(Exception e){ 	
		e.printStackTrace();
	}
		return rs;		
	}
	
	static ResultSet randevuListele() {
		ResultSet rs = null;
				try{  
			 con = DriverManager.getConnection("jdbc:mariadb://localhost:3307/hospital?user=root&password=5757");// veritabanýma baðlanýyorum.
			 stat = con.createStatement();
			rs = stat.executeQuery("Select * from appointment"); 		
			}
		catch(Exception e){ 
			
				e.printStackTrace();
			}
		return rs;		
	}
	
	static ResultSet doktorSaatleri() {
		ResultSet rs = null;
				try{  
			 con = DriverManager.getConnection("jdbc:mariadb://localhost:3307/hospital?user=root&password=5757");
			 stat = con.createStatement();
			rs = stat.executeQuery("Select * from whour");					
			}
		catch(Exception e){ 
			
				e.printStackTrace();
			}
		return rs;		
	}

}
