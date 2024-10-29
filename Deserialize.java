package serialize_concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
	
	// from byte to object
	
	
	
	public Object deserialize (String filename) {
		
		Object o = null;
		
		
		try {
			
			// use file class for more precise
			File file = new File(filename);
			
			// you can use directly FileInputStream with filename as string
			FileInputStream fileInput = new FileInputStream(file);
			
			
			
			System.out.println("file : " + filename);
			System.out.println("direction : " + file.getAbsolutePath());
			
			try {
				
				// use objectInputStream to Convert file to an object 
				// so just read it and casting as your object 
				ObjectInputStream objectInput = new ObjectInputStream(fileInput);
				try {
					// you see the object was found here so just cast as our class and that fine !
					

					// here is the converting from Byte to Object
					
					// i use loop for best experience 
					// so user see loading 
					
					System.out.print("reading");
					
					// just kidding !!!!
					for (int x = 0 ; x<7 ; x++) {
						
						System.out.print(".");
						try {
							Thread.sleep(1000);
						}catch(Exception ex) {
							
						}
					}
					
					System.out.println("\n\n");
					
					o = objectInput.readObject();
					
					// after complete get our object 
					// please close ObjectInputStream with close() function
					
					objectInput.close();
					
				} catch (ClassNotFoundException e) {
					
					// possible our class not found 
					System.out.println("classNotFoundException : " + e.toString());
					
				}
				
			} catch (IOException e) {
				
				// catch input and output exception
				System.out.println("io Exception : " + e.toString());
				
			}
			
			
		} catch (FileNotFoundException e) {
			
			// because possible not locate file
			System.out.println("file not found :" + e.toString());
		}
		
		return o;
	}
	

}
