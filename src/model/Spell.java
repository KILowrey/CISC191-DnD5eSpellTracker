package model;
import enums.*;

/**
 * 
 * @author KILowrey
 *
 */
public class Spell implements dndInterface
{
	//////// FIELDS ////////
	private String name; // name of the spell
	private int index; // spell index
	private static int nextIndex = 0; // next index
	private int level; // spell level (0-9)
//	private String notes; // notes for the spell
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
	private Enum attackType; // null if not an attack roll, otherwise ranged or melee
	private Enum saveType; // null if not a save, otherwise what kind of save?
	private String spellText; // the text description of the spell
	private String higherLevels; // the description of what the spell does at higher levels
	private Enum source; // if it's a SRD spell, a not SRD but still WOTC, or a HomeBrew spell

	//////// CONSTRUCTORS ////////
	
	public Spell(String inputName, int inputLevel, Enum inputSource,
				Enum inputSchool, String inputCastTime, String inputRange,
				boolean inputIsV, boolean inputIsS, boolean inputIsM, String inputMaterials,
				String inputDuration, boolean inputIsRitual, boolean inputIsConcentration,
				Enum inputAttackType, Enum inputSaveType, String inputSpellText, String inputHigherLevels)
	{
		this.name = inputName;
		this.level = inputLevel;
		this.source = inputSource;
//		this.notes = inputNotes;
		this.school = inputSchool;
		this.castTime = inputCastTime;
		this.range = inputRange;
		this.isV = inputIsV;
		this.isS = inputIsS;
		this.isM = inputIsM;
		this.materials = inputMaterials;
		this.duration = inputDuration;
		this.isRitual = inputIsRitual;
		this.isConcentration = inputIsConcentration;
		this.attackType = inputAttackType;
		this.saveType = inputSaveType;
		this.spellText = inputSpellText;
		this.higherLevels = inputHigherLevels;
		//this.index = getNextIndex();
	}
	
	
	
	
	/**
	 * increments the next index counter
	 */
	public int getNextIndex() {
		return nextIndex++;
	}
	
	
	/**
	 * SPELL HAS INDEX PLAN
	 * first digit 0, 1, 2, for SRD, WOTC, HB
	 * second digit 0-9 for spell level
	 * third digit is 1-8 for school
	 * last 3 digits counting up from 1 (ideally based on how many of the above 3 there are) with leading 0s as needed
	 */

}
