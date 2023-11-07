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
	private enum school; // SWITCH to ENUM later that is the 8 SCHOOLS
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
	private enum attckType;
	// what kind of saving throw (null if isAttack = true)
	private enum saveType; // SWITCH to ENUM later that is the six stats with
								// NULL for not a save
	// the description of the spell in the book
	private String spellDescription;
	// the descriiption of what te spell does at higher levels
	private String higherLevels;
	// if it's SRD or otherwise
	private enum source; // SWITCH TO ENUM THAT IS SRD, WOTC, OR HB
	// for tracking them:
	private final int index;
	private static int counter;

	//////// CONSTRUCTORS ////////

	// add a spell from the database
	public Spell(String source, int index)
	{

	}

	// user adds a spell wholecloth
	public Spell(String source, String spellName)
	{

	}

}
