package controller;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import freemarker.ext.servlet.HttpRequestHashModel;
import utility.User;

public class Login implements SessionAware{ 
	
SessionMap<String,String> sessionmap;  
	
	private String username;
	private String password;  
	public List<String> filelist = new ArrayList<String>();
	
	public String getUsername() {  
	    return username;  
	}  
	  
	public void setUsername(String username) {  
	    this.username = username;  
	}  
	  

	  
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute(){  
		System.out.println(username);
		String status;
	    if(User.validate(username, password)){  
	    	sessionmap.put("username", username);
	    	
			  try{  
				  Class.forName("com.mysql.jdbc.Driver");  
					
				   Connection con = DriverManager
						   .getConnection("jdbc:mysql://localhost:3306/codersofbabylon2","root","");  
				     
				   PreparedStatement ps = con.prepareStatement(  
				     "SELECT filePath FROM upload WHERE patientid=?"); 
			
				   ps.setString(1,username);  
				   ResultSet rs = ps.executeQuery();  
				  // sessionmap.put("filePath", rs.getString("filePath")); 
				  }catch(Exception e){e.printStackTrace();}  
			  
			  getfiles();
			  
			  
			  
	    	status = "success";  
	    }  
	    else{  
	        status ="error";  
	    } 
	    return status;
	}  
	
	public void setSession(Map map) {  //This happens before execute
	    sessionmap=(SessionMap)map;  
	    sessionmap.put("login","true");
	    //sessionmap.put("username", username);
	}  
	  
	public String logout(){  
	    sessionmap.invalidate();  
	    return "success";  
	}  

	

	
	public List<String> getfiles(){
		
		File folder = new File("E:/Patient Medical Record/"+username);
		//File folder = new File("C:\\Users\\glenn_ailen\\Desktop");
		File[] listOfFiles = folder.listFiles();

		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		        System.out.println("File " + listOfFiles[i].getName());
		        filelist.add(listOfFiles[i].getName());
		      } else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory is not needed");
		      }
		    }
		    
		    return filelist;
	}
	
	
}
