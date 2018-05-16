
import java.util.ArrayList;

/**
 * OneSolution class that displays the solution to the 8 queens problem from my write-up
 * @author Braden Hoagland
 *
 */
public class OneSolution {
	
	/**
	 * main method that displays the solution from my write-up
	 * @param args
	 */
	public static void main(String[] args) {
		ChessBoard board = new ChessBoard();
		
		int[] cols = {3, 1, 7, 5, 0, 2, 4, 6};
		ArrayList<Queen> qs = new ArrayList<Queen>();
		for (int row = 0; row < board.getN(); row++) {
			qs.add(new Queen(row, cols[row]));
		}
		
		board.updateQueens(qs);
	}
}