package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PdfUtil {
	public ResultSet fetchData(){
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			   Connection con = DriverManager
					   .getConnection("jdbc:mysql://localhost:3306/codersofbabylon2","root","");  
			   PreparedStatement ps = con.prepareStatement(  
					     "select filePath from upload where uploadID=?"); 
			ResultSet rs = ps.executeQuery();
			return rs;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}