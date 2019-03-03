// Program: MapMain
// Author : Xiaohui Wang
// Student ID: 260719359
// Created: September 2018
// Purpose: a well-designed software solution for creating and updating a map structure

//package map;
import java.util.*;

public class MapMain {
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);	
		int maxRow = 0;
		int maxWidth = 0;	
		System.out.println("Welcome to Map!");	
	
		//
		// continue asking for input when invalid
		//
		
		while(!(maxRow>0)) {
			System.out.println("Please input the maximum number of rows: ");		
			
			// step 1: helper method to make sure that input is integer
			helperInt(scan);
			
			// step 2: check that input number is greater than 0
			maxRow = scan.nextInt();
			if(maxRow <= 0) {
				System.out.println("A row must be greater than 0.");
			}
		}	
		
		//
		// do the same set of checking to width as for row input
		//
		
		while(!(maxWidth>0)) {
			System.out.println("Please input the maximum number of columns: ");
			helperInt(scan);
			maxWidth = scan.nextInt();
			if(maxWidth <=0 ) {
				System.out.println("A column must be greater than 0.");
			}
		}
		
		//
		// create my new Map object by calling the method init 
		//
		
		Map myMap = new Map(maxRow,maxWidth);
		
		if(myMap.init(maxRow,maxWidth)) {
			System.out.println("Map has been created.");
		}
		
		//
		// construct the loop asking for user update(s)
		//
		
		String answer;
		do {	
			System.out.println("Please add an object to the map (~ for water, G for grass, # for tree)");
				
			//
			// ask for number and check whether valid
			//
			
			int myRow = -1;
			int myCol = -1;
			String item = "";
			
			while(myRow < 0 || myRow >= maxRow) {
				System.out.println("Row:");
				helperInt(scan);
				myRow = scan.nextInt();
				// if not valid, display error message and prompt for user input
				if(myRow < 0 || myRow >= maxRow) {
					System.out.println("Invalid row! It must be between 0 and " + (myMap.getRow()-1) + ".");  
				}	
			}
			
			while(myCol<0 || myCol>=maxWidth) {
				System.out.println("Column:");
				helperInt(scan);
				myCol = scan.nextInt();
				if(myCol<0 || myCol>=maxWidth) {
					System.out.println("Invalid column! It must be between 0 and " +(myMap.getWidth()-1)+ ".");
				}
			}
			
			//
			// ask for character and check whether valid	
			//
			
			String garbage1;
			while(!((item.equals("~") || item.equals("G")) || item.equals("#"))) {
				System.out.println("Character:");
				garbage1= scan.nextLine(); 
				item = scan.nextLine();
				
				while(!((item.equals("~") || item.equals("G")) || item.equals("#"))) {
					System.out.println("Invalid character! It must be either ~ or G or #.");
					System.out.println("Character:");	
					item = scan.nextLine();
				}
			}	
			
			//
			// call method setter to store user update to the existing map
			//
					
			if(myMap.setter(myRow,myCol,item)) {
				System.out.println("Your "+item+" was added to "+myRow+","+myCol+" in the map.");
			}
		
			System.out.println("Would you like to enter another character (Y/N): ");
			answer = scan.nextLine();

			//
			// call function to display map image if no more updates
			//
			
			if(answer.equals("N")) {
				myMap.display();
			}
		} while(answer.equals("Y"));
		
		scan.close();
	}
	
	// Name: helperInt
	// Creator: Xiaohui Wang
	// Purpose: In a while loop ensures that input is integer, display error message if not
	// Inputs: scan - user input from console
	// Outputs: None
	
	public static void helperInt(Scanner scan) {
		while(!scan.hasNextInt()){
			   System.out.println("Number must be integer, please try another input");
			   scan.next();
		}
	}	
}
