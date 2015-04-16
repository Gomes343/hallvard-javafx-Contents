package games.battleship.battleship3;

import games.IPersistable;
import games.imagegrid.ObservableGrid;

import java.util.Collection;
import java.util.List;

public interface IBattleship extends ObservableGrid {
	
	public static final char CELL_OCEAN = '~';
	public static final char CELL_EMPTY = '.';
    public static final char CELL_SHIP_HIT = 'X';
	
	/**
	 * Initializes a game with a String representation of a level. All other game state should be cleared.
	 * @param level The level represented as a String.
	 */
	public void init(String level);

    /*
     * Initializes a game with a String representation of all the cells' hit state and the ships on the board.
     *
     */
    public void init(String hits, List<ShipType> types, List<Ship> ships);

	/**
	 * @return The width/height of the grid, as the height and width should be equal.
	 */
	public int getSize();

	/**
	 * Get the ship in that cell, or null if the cell is empty.
	 * @param x The x-coordinate of the cell
	 * @param y The y-coordinate of the cell
	 * @return The ship type.
	 */
	public Cell getCell(int x, int y);

    /*
     * @return a list of all cells
     */
    public List<Cell> getCells();
	
    /**
     * @return All ships placed on the board
     */
    public Collection<Ship> getShips();

    /**
     * @return All ship types on the board
     */
    public Collection<ShipType> getShipTypes();


	/**
	 * Counts the cells of a ship type that are hit or not.
	 * @param shipType the ship type to count or null to count all ships
	 * @param hit the hit value or null to ignore
	 * @return the ship count
	 */
    public int countShips(ShipType shipType, Boolean hit);
	
	/**
	 * Fires a shot for the current player. 
	 * @param x The x-coordinate of the cell
	 * @param y The y-coordinate of the cell
	 * @return Null if no ship at coordinate. True if the ship was sunk, false if not.
	 */
	public Boolean fire(int x, int y);
}
