package serialize_concept;

import java.io.Serializable;

public class Employe implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	
  	private String emp_name;
	private String emp_lastname;
	private String department;
	
	public void setEmploye(String emp_name , String emp_lastname , String department) {
		this.emp_name = emp_name;
		this.emp_lastname = emp_lastname;
		this.department = department;
	}
	
	
	public String getEmploye(boolean isNotCapitalCase) {
		String str = "name : " + emp_name + "\n";
		str += "lastname : " + emp_lastname + "\n";
		str += "department : " + department + "\n";
		
		if (isNotCapitalCase) {
			return str;
		}else {
			return str.toUpperCase();
		}
		
		
		
	}
	
	
	public long serialVersionUID () {
		return serialVersionUID;
	}
	
	
	

}
