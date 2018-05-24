package utility;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

public class DBSQLOperation implements SQLCommand{
	
	//Login method
	public static boolean loginAdmin(User user, Connection connection){
		String dbUsername, dbPassword;
		boolean isSuccessful = false;
		if(connection != null){
			try{
				PreparedStatement pstmnt = connection.prepareStatement(LOGIN_USER);
				pstmnt.executeQuery(LOGIN_USER);
				ResultSet rs = pstmnt.getResultSet();
				
				while(rs.next()){
					dbUsername = rs.getString("username");
					dbPassword = rs.getString("password");
					if(dbUsername == user.getUsername() && dbPassword == user.getPassword()){
						System.out.println("OK");
						isSuccessful = true;
					}
					
				}
				
			}catch(SQLException sqle){
				sqle.printStackTrace();
			}
		}
		return isSuccessful;
	}
}