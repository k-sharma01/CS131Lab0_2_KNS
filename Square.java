/**
 * This class implements a basic square
 * 
 * @author Kirin Sharma
 * @version 1.0
 * Spring/2023
 */

public class Square {
	
	private double side; // Stores the length of the sides of the square
	
	/**
	 * Constructs a square with side set to 0
	 */
	public Square()
	{
		side = 0.0;
	} // end constructor
	
	/**
	 * Constructs a square with a side length specified by argument
	 * @param length the value which to initialize side to
	 */
	public Square(double length)
	{
		side = length;
	} // end constructor
	
	/**
	 * Gets the current value of side
	 * @return the current value of side
	 */
	public double getSide()
	{
		return side;
	} // end getSide
	
	/**
	 * Sets the value of side
	 * @param length the value which side will be updated to
	 */
	public void setSide(double length)
	{
		side = length;
	} // end setSide
	
	/**
	 * Calculates the area of the square
	 * @return the area of the square
	 */
	public double area()
	{
		return (side * side);
	} // end area
	
} // end class
