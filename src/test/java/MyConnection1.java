import java.sql.*;

public class MyConnection1 {

    public static void main(String[] args) throws SQLException {

       try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01","root","1234");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from ogrenciler");
        rs.next();
        System.out.println(rs.getInt("id")+" "+rs.getString("isim")+" "+rs.getString(3)+" "+rs.getInt(4));
        rs.next();
        System.out.println(rs.getInt("id")+" "+rs.getString("isim")+" "+rs.getString(3)+" "+rs.getInt(4));
        rs.next();
        System.out.println(rs.getInt("id")+" "+rs.getString("isim")+" "+rs.getString(3)+" "+rs.getInt(4));
        rs.next();
        System.out.println(rs.getInt("id")+" "+rs.getString("isim")+" "+rs.getString(3)+" "+rs.getInt(4));
        rs.next();
        System.out.println(rs.getInt("id")+" "+rs.getString("isim")+" "+rs.getString(3)+" "+rs.getInt(4));
        //con.close();
         /*  while (rs.next()){
               System.out.println(rs.getInt(1)
                       +" "+rs.getString(2)+
                       " "+rs.getString(3)+
                       " "+ rs.getInt(4));
           }*/

           con.close();
           rs.close();
           stmt.close();





        } catch (SQLException e){

           e.printStackTrace();

       }
    }


}
