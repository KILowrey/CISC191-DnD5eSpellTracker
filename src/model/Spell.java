package model;
import enums.*;

/**
 * 
 * @author KILowrey
 *
 */
public class Spell
{
	//////// FIELDS ////////
	// name of spell
	private String spellName;
	// spell level 0-9
	private int spellLevel;
	// what school of magic it is
	private Enum school;
	// how long it takes to cast
	private String castTime;
	// spell's range
	private String range;
	// spell has a verbal component
	private boolean isV;
	// spell has a "somatic" (hand gesture) component
	private boolean isS;
	// spell has a material component
	private boolean isM;
	// if spell has a material component, what are the materials?
	private String materials;
	// how long does it last?
	private String duration;
	// can it be case a a ritual?
	private boolean isRitual;
	// does it require concentration?
	private boolean isConcentration;
	// is it an attack roll?
	private Enum attckType;
	// what kind of saving throw (null if isAttack = true)
	private Enum saveType; // SWITCH to ENUM later that is the six stats with
								// NULL for not a save
	// the description of the spell in the book
	private String spellDescription;
	// the descriiption of what te spell does at higher levels
	private String higherLevels;
	// if it's SRD or otherwise
	private Enum source; // SWITCH TO ENUM THAT IS SRD, WOTC, OR HB
	
	/**
	 * TODO: create an @override hasher
	 * that generated a hashed index for each spell where
	 * 
	 */
	private final int hashIndex;

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
