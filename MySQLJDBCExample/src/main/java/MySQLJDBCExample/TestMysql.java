package MySQLJDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestMysql {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String connectionUrl = "jdbc:mysql://localhost:3306/tutorials?useUnicode=true&characterEncoding=UTF-8&user=root&password=koreait";
		Connection conn = DriverManager.getConnection(connectionUrl);
		ResultSet rs = conn.prepareStatement("show tables").executeQuery();
		
		while(rs.next()) {
			String s = rs.getString(1);
			System.out.println(s);
		}
		boolean inserted = conn.prepareStatement("INSERT INTO topic VALUES(NULL, 'MySQL', 'MySQL is...', NOW());").execute();
			System.out.println(inserted);
	}
}