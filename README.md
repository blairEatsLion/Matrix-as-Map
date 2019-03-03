# Matrix-as-Map

Java Program focusing on testing and validating input/output.

An application uses a 2D character matrix as a map. The map has a max size, maxRow and maxWidth.
The map can be populated with a fixed set of characters: ‘~’ for water, ‘G’ for grass, and ‘#’ for tree. No
other characters are permitted. The application begins by asking the user for the size of the map. In
other words, the integer values for maxRow and maxWidth. These values must be greater than 0. The
matrix is instantiated at runtime, and it is initialized with the water character. Validate whether the
matrix was successfully instantiated. After this, the program, in a loop, asks the user for a row and
column coordinate, and a character. The program validates the inputs displaying an error message if
anything is incorrect, and then prompts the user to provide another input tuple (ie. row, column,
character). If the inputted values are correct then the input character is placed into the map at the
specified coordinate, overwriting whatever was there. The program then asks the user if they would like
to input another character. The application allows the user to input as many characters as they want. If
the user does not want to enter more characters, then the program displays the final ASCII map to the
console and terminates. The 2D character matrix is within a class called Map (Map.java). The user
interface loop will be in the main() method in a class called MapMain (MapMain.java).
