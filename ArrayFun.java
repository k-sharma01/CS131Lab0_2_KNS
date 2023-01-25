/**
 * This class contains various methods for manipulating an array of squares
 * 
 * @author Kirin Sharma
 * @version 1.0
 * Spring/2023
 */

public class ArrayFun {

	private Square[] myArray; // stores an array of 6 squares
	
	/**
	 * Constructs an ArrayFun object, initializing 6 squares with lengths 0-5
	 */
	public ArrayFun()
	{
		myArray = new Square[6];
		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = new Square(i);
		}
	} // end constructor
	
	/**
	 * Gets a specific square from myArray
	 * @param index the index to retrieve the square from in myArray
	 * @return the square from the specified index
	 */
	public Square getArrayItem(int index) 
	{
		return myArray[index];
	} // end getArrayItem
	
	/**
	 * Sets a specific index in an array to a specific square
	 * @param index the index which to update
	 * @param s the square to update into the array
	 */
	public void setArrayItem(int index, Square s)
	{
		myArray[index] = s;
	} // end setArrayItem
	
	/**
	 * Prints the areas of each square in the array first to last
	 */
	public void forward()
	{
		System.out.println();
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.println("The area of square #" + (i+1)+ " is: " + myArray[i].area());
		}
	} // end forward
	
	/**
	 * Prints the areas of each square in the array last to first
	 */
	public void backward() 
	{
		System.out.println();
		for (int i = myArray.length - 1; i >=0; i--)
		{
			System.out.println("The area of square #" + (i+1)+ " is: " + myArray[i].area());
		}
	} // end backward
	
	/**
	 * Sums the areas of each of the squares contained in the array
	 */
	public void sum()
	{
		double totalArea = 0;
		for (int i = 0; i < myArray.length; i++)
		{
			totalArea += myArray[i].area();
		}
		System.out.println("\nThe sum of the areas of the squares is: " + totalArea);
	} // end sum
	
} // end class
