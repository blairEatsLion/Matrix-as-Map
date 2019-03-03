// Program: MapTest
// Author : Xiaohui Wang
// Student ID: 260719359
// Created: September 2018
// Purpose: Test exhaustively every method

//package map;
abstract class MapTest {
	public static void main(String[] args) {
		
		//
		// call testing methods for every method in Map.java
		//
		
		initTest();
		
		setterTest();
		
		getRowTest();
		
		getWidthTest();
		
		displayTest();
		
		System.out.println("End of testing");

	}
	
	
	// Name: initTest
	// Creator: Xiaohui Wang
	// Purpose: Given valid/invalid inputs, check whether the map can be initialized
	// Inputs: None
	// Outputs: None
	
	public static void initTest() {

		System.out.println("Test case for method "+ "init" + " :");		

		for(int i = -1;i <= 3;i++) {
			for(int j = -1;j <= 3;j++) {
				Map myMap = new Map(i,j);
				String k = null;						
				if(myMap.init(i, j)) {
					k = "Yes, inputs successfully initialize the map";
				}else {
					k = "No, inpust could not successfully initialize the map";
				}
				
				System.out.print("Arguments: "+ i + " and " + j +"  ");
				System.out.println("Result: " + k);
			}	
		}
		System.out.println();				
	}
		
	// Name: setterTest
	// Creator: Xiaohui Wang
	// Purpose: Given valid/invalid inputs, check whether the map can be updated
	// Inputs: None
	// Outputs: None
	// Note: I initialize a 5*5 map to test this method and try to reset every spot on this map with all valid/invalid characters stored in array 'things'
	
	public static void setterTest() {
		Map myMap = new Map(5,5);
		myMap.init(5, 5);  //now that map is not created in constructor, this line is needed
		
		String[] things= {"~","G","#","g","A","!","ab"};
		
		System.out.println("Test case for method "+ "setter" + " :");		

		for(int i = -1;i <= myMap.getRow();i++) {          //changed
			for(int j = -1;j <= myMap.getWidth();j++) {				 
				for(int k = 0;k < things.length;k++) {			
					String message;

					if(myMap.setter(i, j, things[k])) {
						message= "Yes, inputs successfully update the map";
					}else {
						message= "No, inputs could not successfully update the map";
					}
					
					System.out.print("Arguments: "+ i + " and " + j +" and "+things[k]+"  ");
					System.out.println("Result: " + message);
				}
			}	
		}			
		System.out.println();							
	}
	
	// Name: getRowTest and getWidthTest
	// Creator: Xiaohui Wang
	// Purpose: Given valid/invalid inputs, check whether the variables can be returned
	// Inputs: None
	// Outputs: None
	
	public static void getRowTest() {
		System.out.println("Test case for method "+ "getRow" + " :");	
		for(int i = -1;i <= 4;i++) {
			for(int j = -1;j <= 4;j++) {
				Map myMap = new Map(i,j);
				myMap.init(i,j);
				System.out.print("Arguments: "+ i + "   ");
				System.out.print("Result: ");	
				System.out.println(myMap.getRow());	
			}
		}
		System.out.println();
	}

	public static void getWidthTest() {
		System.out.println("Test case for method "+ "getWidth" + " :");	
		for(int i = -1;i <= 4;i++) {
			for(int j = -1;j <= 4;j++) {
				Map myMap = new Map(i,j);
				myMap.init(i,j);
				System.out.print("Arguments: "+ j + "   ");
				System.out.print("Result: ");
				System.out.println(myMap.getWidth());
			}
		}
		System.out.println();
	}
	
	// Name: displayTest
	// Creator: Xiaohui Wang
	// Purpose: testing method display which prints a sample map
	// Inputs: None
	// Outputs: None
	
	public static void displayTest() {
		System.out.println("Test case for method "+ "display" + " :");	
		Map myMap = new Map(10,10);
		myMap.init(10,10);
		myMap.display();
		System.out.println();
	}
	
}	