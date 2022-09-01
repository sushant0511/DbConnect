import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "123456");
		Statement statement=connection.createStatement();
		ResultSet set=statement.executeQuery("select * from user");
		while(set.next())
		{
			System.out.println(set.getInt(1)+"   "+set.getString(2)+"   "+set.getString(3)+"   "+set.getString(4));
		}
			System.out.println("Connection success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
