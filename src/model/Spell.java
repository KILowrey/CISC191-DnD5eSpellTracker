package model;
import enums.*;

/**
 * 
 * @author KILowrey
 *
 */
public class Spell extends dndObj
{
	//////// FIELDS ////////
	
	// index for finding the spell
	// spell level (0-9)
	// name of spell
	// notes for spell
	private Enum school; // what school of magic it is
	private String castTime; // how long it takes to cast
	private String range; // the spell's range
	private boolean isV; // if the spell has a verbal component
	private boolean isS; // if the spell has a "somatic" (hand gesture) component
	private boolean isM; // if the spell has a material component
	private String materials; // if it does need materials, what are they?
	private String duration; // how long does it last?
	private boolean isRitual; // can it be ritual cast?
	private boolean isConcentration; // does it require concentration?
	private Enum attckType; // null if not an attack roll, otherwise ranged or melee
	private Enum saveType; // null if not a save, otherwise what kind of save?
	private String spellText; // the text description of the spell
	private String higherLevels; // the description of what the spell does at higher levels
	private Enum source; // if it's a SRD spell, a not SRD but still WOTC, or a HomeBrew spell

	//////// CONSTRUCTORS ////////

	// add a spell from the database
	public Spell(File input)
	{

	}

	// user adds a spell wholecloth
	public Spell(Scanner input)
	{

	}

}
