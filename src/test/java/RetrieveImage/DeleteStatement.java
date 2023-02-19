package RetrieveImage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStatement {

	public DeleteStatement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{			

			// db parameters
			String url       = "jdbc:mysql://localhost:3306/fsae01";
			String user      = "root";
			String password  = "1234";

			// Class.forName("com.mysql.cj.jdbc.Driver");

			// create a connection to the database
			Connection con = DriverManager.getConnection(url, user, password);	

			Statement stmt= con.createStatement();

			String isim =" 'Yavuz Bal' ";  // cift tirnakli
			//int result=stmt.executeUpdate("delete from ogrenciler where isim = " + isim);



			//int result=stmt.executeUpdate("update ogrenciler set isim = 'Umit Kalemkus' where id = 121");
			//int result=stmt.executeUpdate("insert into ogrenciler values (221, 'Akif Kalemkus','Akhisar', 75)");
			int result=stmt.executeUpdate(" create table personel2 (id char(4), isim varchar(50), maas int)");

			System.out.println("result");




			//int result=stmt.executeUpdate("delete from ogrenciler where id = 120");
			//int result=stmt.executeUpdate("delete from ogrenciler where id in( 122,123)");

			// int result=stmt.executeUpdate("update ogrenciler set isim = 'Martin Parr' where id = 120");

			System.out.println(result+" records affected");			

			con.close();  
		}catch(SQLException e){ System.out.println(e);}

	}

}