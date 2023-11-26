import java.sql.*;
public class sturecord {

	public static void main (String args[])throws Exception {
		insert();
	}
	public static void insert() throws Exception {
		String url ="jdbc:mysql://127.0.0.1:3306/?details";
		String username="Gk";
		String password="Kutty";
		String query="insert into studetails values(?,?,?)";
		
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.execute();
		con.close();
		
	}
}
