package serialize_concept;

public class Main {
	
	public static void main(String[] args) {
		
			
			Employe emp_1 = new Employe();
			emp_1.setEmploye("oussama", "salmi", "java developer");
			
			Employe emp_2 = new Employe();
			emp_2.setEmploye("fouzi", "mador", "ps5 player");
			
			
			
			Serialize ser = new Serialize(emp_1);
			
			ser.serialize("oussama.ser");
			
			
			
			

		
	}

}
