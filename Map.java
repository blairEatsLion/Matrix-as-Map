// Program: Map
// Author : Xiaohui Wang
// Student ID: 260719359
// Created: September 2018
// Purpose: Stores the matrix for Map

//package map;

public class Map {
	
	//
	// set private variables
	//
	
	private int maxRow;
	private int maxWidth;
	String[][] map = null; 
	
	// Map Constructor
	// Creator: Xiaohui Wang
	// Purpose: give parameters for constructing map structure
	// Parameters: maxRow and maxWidth - 2 dimensions of 2-D array

	public Map(int maxRow, int maxWidth) {
		this.maxRow = maxRow;
		this.maxWidth = maxWidth;
	}
	
	// Name: init
	// Creator: Xiaohui Wang
	// Purpose: Initialize the map and fill it with '~'
	// Inputs: row, col - number of rows and columns
	// Outputs: boolean - true if the map is successfully set up
	
	public boolean init(int row, int col) {
		
		// check row and col number must be greater than 0
		if(row<=0 || col<=0) {
			return false;
		}
		// initialize array of strings with the parameters entered in constructor
		map = new String[maxRow][maxWidth];  
		
		// call setter method as to set each coordinate to '~'
		for(int i = 0; i < this.maxRow; i++) {
			for(int j = 0; j < this.maxWidth; j++) {
				setter(i,j,"~"); 		
			}
		}		
		return true;
	}
	
	// Name: setter
	// Creator: Xiaohui Wang
	// Purpose: Set one of the restricted items on a particular coordinate
	// Inputs: row, col - number of rows and columns
	//		item - one of the three accepted signs on the map		
	// Outputs: boolean - true if the map is successfully updated
	
	public boolean setter(int row, int col, String item) {
		
		// check the numbers are not smaller than 0
		if(row<0 || col<0) {
			return false;
		}
		// check the numbers does not exceed boundary
		if(row>=this.getRow() || col>=this.getWidth()) {
			return false;
		}
		
		// check item is valid
		if (!((item.equals("~")||item.equals("G"))||item.equals("#"))) {
			return false;
		}
		
		this.map[row][col] = item;
		return true;
	}
	
	// Name: getRow and getWidth
	// Creator: Xiaohui Wang
	// Purpose: return the private variables
	// Inputs: none	
	// Outputs: the private parameter for Map
	
	public int getRow() {
		if(maxRow > 0) {
			return maxRow;
		}else {
			System.out.print("Error for invalid row magnitude. ");
			return maxRow;
		}
	}
	
	public int getWidth() {
		if(maxWidth > 0) {
			return maxWidth;
		}else {
			System.out.print("Error for invalid width magnitude. ");
			return maxWidth;
		}
	}
	

	// Name: display
	// Creator: Xiaohui Wang
	// Purpose: display image before program termination
	// Inputs: none	
	// Outputs: print the map to console
	
	public void display() {
		for(int i = 0; i < this.maxRow; i++) {
			for(int j = 0; j < this.maxWidth; j++) {
				System.out.print(this.map[i][j]);			
			}
			System.out.println();
		}		
	}


}
