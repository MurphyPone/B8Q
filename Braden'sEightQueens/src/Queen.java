
/**
 * Queen class that represents a queen to be placed on a ChessSquarePanel
 * @author Braden Hoagland
 *
 */
public class Queen {
	
	/**
	 * row the queen is in
	 */
	public int row;
	
	/**
	 * column the queen is in
	 */
	public int col;
	
	/**
	 * constructor that sets the row and column of the queen to the given values
	 * @param x column the queen is in
	 * @param y row the queen is in
	 */
	public Queen(int x, int y) {
		col = x;
		row = y;
	}
	
	/**
	 * get the queen's column
	 * @return column the queen is in
	 */
	public int getCol() {return col;}
	
	/**
	 * get the queen's row
	 * @return row the queen is in
	 */
	public int getRow() {return row;}
	
	/**
	 * increment the queen's row by 1; to be used when iterating through queen placements
	 */
	public void incrementRow() {row++;}
	
	/**
	 * get a string representation of the queen
	 * @return String displaying the col and row of the queen
	 */
	public String toString() {return "(" + col + ", " + row + ")";}
	
	/**
	 * get a clone of the current queen to make storing queen positions not cause unexpected errors
	 * @return a copy of the current Queen
	 */
	public Queen clone() {return new Queen(col, row);}
}