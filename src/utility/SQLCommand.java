package utility;

public interface SQLCommand {
	String LOGIN_USER = "SELECT username, password FROM clientaccounts";
	
	
	String GET_UPLOAD = "SELECT *"
			+ "upload";
	
	String GET_PATIENT = "SELECT * "
			+ "patientregistry";
	
	String GET_PATIENT_ADDRESS = "SELECT *"
			+ "patientaddewssregistry";
	
	String GET_PATIENT_CONTACT = "SELECT *"
			+ "patientcontactregistry";
	
	String GET_PATIENT_EMERGENCY_CONTACT = "SELECT *"
			+ "patientemergencycontact";
}
