package model;

public abstract class dndObj
{
	/////// FIELDS ////////
	private final int index = 0;
	private static int counter = 1;
	private int level;
	private String name;
	private String notes;
	
	//////// INDEX MANAGEMENT ////////
	
	
	//////// GETTERS AND SETTERS ////////
	/**
	 * 
	 * @param newLevel
	 */
	public void setLevel(int newLevel) {
		level = newLevel;
	}
	
	/**
	 * 
	 * @param newName
	 */
	public void setName(String newName) {
		name = newName;
	}
	
	/**
	 * 
	 * @param newDescription
	 */
	public void setNotes(String newNotes) {
		notes = newNotes;
	}
	
	/**
	 * 
	 * @return level
	 */
	public int getLevel() {
		return level;
	}
	
	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return notes
	 */
	public String getNotes() {
		return notes;
	}
	
}
