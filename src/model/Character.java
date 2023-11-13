package model;


/**
 * 
 * @author KILowrey
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Character 
{
	//////// FIELDS ////////
	// name of character
	private String characterName;
	// text for character's class and subclass
	private String characterClass;
	// character's level
	private int characterLevel;
	// character's attack bonus
	private int attackBonus;
	// characters spell save dc
	private int spellSaveDC;
	// if character has spell points
	private boolean hasSpellPoints = false;
	// if character has sorcery points
	private boolean hasSorceryPoints = false;
	
	private final int charIndex;
	private static int charCounter;

	// if spellPoints == true they will have a spellPoints object
	//

	// if sorceryPoints == true they will have a sorceryPoints obj
	//

	// spell slots objects
	// private [datastruc] SpellSlot

	// they will also have a collection of character spell objects
	// private [datastruc] CharacterSpell

	//////// CONSTRUCTORES ////////

	/**
	 * reading a character from the database and adding them as an object
	 * @throws FileNotFoundException
	 */
	public Character(File input) throws FileNotFoundException 
	{
		Scanner characterFile = new Scanner(input);
		charIndex = characterFile.nextInt();
		characterName = characterFile.nextLine();
		characterClass = characterFile.nextLine();
		characterFile.nextLine();
		characterLevel = characterFile.nextInt();
		attackBonus = characterFile.nextInt();
		spellSaveDC = characterFile.nextInt();
		
		String yorn;
		yorn = characterFile.nextLine();
		if (yorn == "y")
		{
			hasSpellPoints = true;
		}
		yorn = characterFile.nextLine();
		if (yorn == "y")
		{
			hasSorceryPoints = true;
		}
	}

	/**
	 * creating a new character object and adding them to the database
	 */
	public Character(Scanner input)
	{
		Scanner keyboard = input;
		// receive characterName
		characterName = keyboard.nextLine();
		// receive characterClass 
		characterClass = keyboard.nextLine();
		// receive characterLevel
		characterLevel = keyboard.nextInt();
		// receive attackBonus 
		attackBonus = keyboard.nextInt();
		// receive spellSaveDC
		spellSaveDC = keyboard.nextInt();
		
		// create a variable for our input so we can do it statements for them
		String yorn;
		// set hasSpellPoints
		yorn = keyboard.next();
		if (yorn == "y") {
			hasSpellPoints = true;
		}
		// receive hasSorceryPoints
		yorn = keyboard.next();
		if (yorn == "y") {
			hasSorceryPoints = true;
		}
	}

	//////// ALL THE BASIC GETTERS AND SETTERS BELOW ////////
	/**
	 * set name
	 * @param
	 */
	public void setCharacterName(String newName) 
	{
		characterName = newName;
	}

	/**
	 * set classes
	 * @param
	 */
	public void setCharacterClass(String newClass) {
		characterClass = newClass;
	}

	/**
	 * set level
	 * @param
	 */
	public void setCharacterLevel(int newLevel) {
		characterLevel = newLevel;
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
	 * set spell points
	 * @param 
	 */
	public void setHasSpellPoints(String yorn) {
		if (yorn == "y") {
			hasSpellPoints = true;
		}
	}

	/**
	 * set sorcery points
	 * @param 
	 */
	public void setHasSorceryPoints(String yorn) {
		if (yorn == "y") {
			hasSorceryPoints = true;
		}
	}
	
	/**
	 * getCharacterName
	 * @return characterName
	 */
	public String getCharacterName() {
		return characterName;
	}
	
	/**
	 * getCharacterClass
	 * @return characterClass
	 */
	public String getCharacterClass() {
		return characterClass;
	}
	
	/**
	 * getCharacterLevel
	 * @return characterLevel
	 */
	public int getCharacterLevel() {
		return characterLevel;
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
	 * getHasSpellPoints
	 * @return hasSpellPoints
	 */
	public boolean getHasSpellPoints() {
		return hasSpellPoints;
	}
	
	/**
	 * getHasSorceryPoints
	 * @return hasSorceryPoints
	 */
	public boolean getHasSorceryPoints() {
		return hasSorceryPoints;
	}

}
