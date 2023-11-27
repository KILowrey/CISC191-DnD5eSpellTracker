package model;

public interface dndInterface
{


	
//	//////// INDEX MANAGEMENT ////////
//	public int getNextIndex() {
//		return nextIndex++;
//	}
	
	/**
	 * 
	 */
	public void readFromFile();
	
	/**
	 * reads what next nextIndex should be from database
	 */
	// public void readNextIndex();
	
	/**
	 * incements nextIndex
	 */
	public int getNextIndex();

	/**
	 * checks if 'y' or not
	 */
	public boolean yornCheck();
	
	/**
	 * range is different depending on thing
	 */
	public abstract boolean checkLevelInRange();
	
}
