import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * ChessSquarePanel class to represent a space on a ChessBoard
 * @author BradenHoagland
 *
 */
public class ChessSquarePanel extends JPanel {
	
	/**
	 * constant representing the font size
	 */
	public final static int FONTSIZE = 60;
	
	/**
	 * Color field representing the background color of the space
	 */
	public Color bgColor;
	
	/**
	 * boolean field representing whether or not the space holds a queen
	 */
	public boolean hasQueen;
	
	/**
	 * String field that stores the letter to be displayed if the space holds a queen
	 */
	public String letter;
	
	/**
	 * constructor that sets bgColor and hasQueen to the given arguments and sets letter to "Q"
	 * @param c color to set the space's background color to
	 * @param b true if the space has a queen, false otherwise
	 */
	public ChessSquarePanel(Color c, boolean b) {
		bgColor = c;
		hasQueen = b;
		letter = "Q";
	}
	
	/**
	 * redraw the space to update it based on the current field values
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setFont(new Font("Calibri", Font.BOLD, FONTSIZE));
		this.setBackground(bgColor);
		g.setColor(Color.RED);

		if (hasQueen) {
			int x = (this.getWidth() / 2) - FONTSIZE/3;
			int y = (this.getHeight() / 2) + FONTSIZE/4;
			g.drawString(letter, x, y);
		}
	}
	
	/**
	 * update the background color of the space
	 * @param c color to set the background color of the space to
	 */
	public void setColor(Color c) {
		bgColor = c;
		repaint();
	}
	
	/**
	 * update the queen status of the space
	 * @param b true if the space has a queen, false otherwise
	 */
	public void setQueenStatus(boolean b) {
		hasQueen = b;
		repaint();
	}
}