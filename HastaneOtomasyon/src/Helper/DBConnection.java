package Helper;
import java.sql.*;
public class DBConnection {
	Connection c = null;

	public DBConnection() {
	}

	public Connection connDb() {
		try {
			this.c = DriverManager.getConnection("jdbc:mariadb://localhost:3307/hospital?user=root&password=5757");
			return c;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("baðlandý");
		}
 
		return c;
	}
}
