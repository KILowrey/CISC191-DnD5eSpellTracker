package model;


/**
 * 
 * @author KILowrey
 *
 */


public class Character implements dndInterface
{
	//////// FIELDS ////////
	private int index; // character's index
	private static int nextIndex = 0;
	private int level; // characters level
	private String name; // characters name
	private String notes; // notes on character
	private String classes; // the character's classes (wizard, sorcerer, etc.)
	private int attackBonus; // the character's attackBonus
	private int spellSaveDC; // the character's spellSaveDC
	

	//////// CONSTRUCTORES ////////
	
	/**
	 * creating a character object
	 * @param readIndex
	 * @param readName
	 * @param readLevel
	 * @param readClasses
	 * @param readAttackBonus
	 * @param readSpellSaveDC
	 * @param readNotes
	 */
	public Character(int readIndex, String readName, int readLevel, 
						String readClasses, int readAttackBonus, 
						int readSpellSaveDC, String readNotes) 
	{
		this.index = readIndex;
		this.name = readName;
		this.level = readLevel;
		this.classes = readClasses;
		this.attackBonus = readAttackBonus;
		this.spellSaveDC = readSpellSaveDC;
		this.notes = readNotes;
	}

	//////// THE BASIC GETTERS AND SETTERS ////////
	
	/**
	 * increments the next index counter
	 */
	public int getNextIndex() {
		return nextIndex++;
	}

	/**
	 * set classes
	 * @param 
	 */
	public void setClasses(String newClass) {
		classes = newClass;
	}

	/**
	 * set attack bonus
	 * @param
	 */
	public void setAttackBonus(int newAttackBonus) {
		attackBonus = newAttackBonus;
	}

	/**
	 * set spell save dc
	 * @param
	 */
	public void setSpellSaveDC(int newSaveDC) {
		spellSaveDC = newSaveDC;
	}
	
	/**
	 * getCharacterClass
	 * @return characterClass
	 */
	public String getClasses() {
		return classes;
	}
	
	/**
	 * getAttackBonus
	 * @return attackBonus
	 */
	public int getAttackBonus() {
		return attackBonus;
	}
	
	/**
	 * getSpellSaveDC
	 * @return spellSaveDC
	 */
	public int getSpellSaveDC() {
		return spellSaveDC;
	}

	/**
	 * 
	 * @param level
	 * @throws Exception
	 */
	public void checkLevelInRange(int level) throws Exception {
		if (level > 0 && level <= 20) {
			throw new Exception(level + " is out of range");
		}
	}

}
