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

public class Character extends dndObj
{
	//////// FIELDS ////////
	// index for finding character
	// character's level (1-20)
	// character's name
	// notes on character
	private String classes; // the character's classes (wizard, sorcerer, etc.)
	private int attackBonus; // the character's attackBonus
	private int spellSaveDC; // the character's spellSaveDC
	

	//////// CONSTRUCTORES ////////

	/**
	 * reading a character from the database and adding them as an object
	 * @throws FileNotFoundException
	 */
	public Character(File input) throws FileNotFoundException 
	{
		Scanner characterFile = new Scanner(input);
		index = characterFile.nextInt();
		name = characterFile.nextLine();
		classes = characterFile.nextLine();
		characterFile.nextLine();
		level = characterFile.nextInt();
		attackBonus = characterFile.nextInt();
		spellSaveDC = characterFile.nextInt();
		
	}

	/**
	 * creating a new character object and adding them to the database
	 */
	public Character(Scanner input)
	{
		Scanner keyboard = input;
		// receive characterName
		setName(keyboard.nextLine());
		//
		setLevel(keyboard.nextInt());
		// receive characterClass 
		classes = keyboard.nextLine();
		// receive attackBonus 
		attackBonus = keyboard.nextInt();
		// receive spellSaveDC
		spellSaveDC = keyboard.nextInt();

	}
	
	//////// INDEX JUNK ////////
	

	//////// THE BASIC GETTERS AND SETTERS ////////

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


}
