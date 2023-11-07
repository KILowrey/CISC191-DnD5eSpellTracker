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
	private boolean hasSpellPoints;
	// if character has sorcery points
	private boolean hasSorceryPoints;

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
	 * 
	 * @throws FileNotFoundException
	 */
	public Character(String characterFileName) throws FileNotFoundException
	{
		Scanner characterFile = new Scanner(new File(characterFileName));
		characterName = characterFile.nextLine();
		characterClass = characterFile.nextLine();
		characterFile.nextLine();
		characterLevel = characterFile.nextInt();
		attackBonus = characterFile.nextInt();
		spellSaveDC = characterFile.nextInt();
		characterFile.nextLine();
		if (characterFile.nextChar() == 'y')
		{
			spellPoints = true;
			// number of spell points max
			// current number of spell points
		}
		else
		{
			spellPoints = false;
		}
		characterFile.nextLine();
		if (characterFile.nextChar() == 'y')
		{
			sorceryPoints = true;
			// number of sorcerypoint max
			// current number of sorcery points
		}
		characterFile.nextLine();
		for (int i = 1; i < 10; i++)
		{
			// recive number of spell slots for level
			// recive if spell slot is used
			// recive what spell slot was used for??
		}

	}

	/**
	 * creating a new character object and adding them to the database
	 */
	public Character()
	{
		// recive name from keyboard
		// recive level from keyboard
		// recive character class form keyboard
		// recive attackBonus from keyboard
		// recive spellSaveDC form keyboard
		// recive spellPoints yes/no
		// reive sorceryPoints yes/no
	}

	//////// METHODS ////////
	/**
	 * set name
	 */

	/**
	 * set classes
	 */

	/**
	 * set level
	 */

	/**
	 * set attack bonus
	 */

	/**
	 * set spell save dc
	 */

	/**
	 * set spell points
	 */

	/**
	 * set sorcery points
	 */

}
