package model;
/**
 * 
 * @author KILowrey
 */
public interface dndInterface
{
	
	/**
	 * read from file
	 */
	public void readFromFile();
	
	/**
	 * reads what next nextIndex should be from input
	 */
	public void readNextIndex();
	
	/**
	 * incements nextIndex
	 */
	public int getNextIndex();

	/**
	 * checks if the letter 'y' or not
	 */
	public boolean yornCheck();
	
	/**
	 * range is different depending on thing
	 */
	public abstract boolean checkLevelInRange();
	
}
