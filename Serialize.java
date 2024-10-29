package serialize_concept;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {
	
	private Object object;
	
	public Serialize(Object object) {
		this.object = object;
	}
	
	
	public void serialize(String filename) {
	
		try {
			
			// first create file best practice use extension .ser
			FileOutputStream file = new FileOutputStream(filename);
			
			try {
				
				// use ObjectOutputStream for serialize any object you want
				ObjectOutputStream stream = new ObjectOutputStream(file);
				
				System.out.println("file : " + filename + " was create");
				System.out.println("direction : " + new File(filename).getAbsolutePath());
				
				// use write function to convert from object to byte'
				// just type your instance
				stream.writeObject(object);
				
				// now serialize done
				// after done just close your stream output
				
				stream.close();
				System.out.println("serialize was done !");
				
			} catch (IOException e) {
				
				// use to catch any input or output exception
				System.out.println("io exception : " + e.toString());
			}
			
			
		} catch (FileNotFoundException e) {
			
			// use to check if file was exist
			System.out.println("FileNotFoundExc : " + e.toString());
		}
		
	}
	

}
