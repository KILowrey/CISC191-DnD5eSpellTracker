/**
 * 
 * @author KILowrey
 *
 */

import model.*;
import gui.*;
import testing.TempDatabase;

public class Main
{

	/** 
	 * START UP FUNCTION
	 */
	public static void main(String[] args)
	{
		/**
		 * load up from our files database
		 */
		createCharacters();
		populateSpellList();
		
		/**
		 * load up GUI stuff
		 */
		MainGUI GUIPanel = new MainGUI();

	}
	
	public void loadSpellsFromDatabase() 
	{
		// read from database/spells/index.txt
		
		// read each line 
		
		// for each line find the file with the same name and upload it as a spell object
		
		
	}
	
	public void loadCharactersFromDatabase()
	{
		// read from database/characters/index.txt what the number of characters we have is
		
		// for each we create a character object from the chara[2 digit index] file in the folder of the same name
		
		// them we upload the the spell slots datastruc from the slots[2 digit index] file
		
		// them we upload the character's spells from the spells[2 digit index] file
	}

	/**
	 * save function for updating the files to match the objects
	 */
	public void save() 
	{
		
	}

}
