package serialize_concept;

public class Main {
	
	public static void main(String[] args) {
		
		
		// serialize part
		
		// create instance of emp
		Employe emp = new Employe();
		
		// here initialize instance (object)
		emp.setEmploye("yohan", "libert", "manipilation");
		
		// here add your instance at convert
		Serialize serialize = new Serialize(emp);
		
		// here serialize mean convert from object emp to byte
		// type your location file/ filename.ser
		
		serialize.serialize("C:/emp1.ser");
		
		
		
		//deSerialize part 
		
		// create newInstance you want to get data to ...
		Employe getEmp = null;
		
		// this is convert from byte to object
		Deserialize deserialize = new Deserialize();
		
		// here is converting function so
		// just type your filename with direction if you have
		
		Object object = deserialize.deserialize("C:/emp1.ser");
		
		// at last just casting to our empInstance 
		// so 
		
		getEmp = (Employe) object;
		
		// now deSerialize success
		
		// so now i can read data 
		
		String data = getEmp.getEmploye(true);
		
		System.out.println(data);
		
		
		
		
	}

}
