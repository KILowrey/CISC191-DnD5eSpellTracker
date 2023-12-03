package model;

/**
 * 
 * @author KILowrey
 */

public interface dndInterface
{
	
	/**
	 * readFromFile
	 * not currently in use
	 */
	public void readFromFile();
	
	/**
	 * readFromTextBox
	 * not currently in use
	 */
	public void readFromTextBox();
	
	/**
	 * readNextIndex
	 * will set the index to what is read
	 */
	public void readNextIndex();
	
	/**
	 * getNextIndex
	 * incremetns in the index
	 */
	public int getNextIndex();

	/**
	 * yornCheck
	 * "yorn" is my made up word for "'y' or 'n'"
	 * checks if the letter 'y' or not
	 */
	public boolean yornCheck();
	
	/**
	 * checkLevelInRange
	 * the range for what is an acceptable level is different between characters, spells, and spell slots
	 */
	public abstract boolean checkLevelInRange();
	
}
