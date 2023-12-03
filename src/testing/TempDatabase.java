/**
 * TempDatabase is a temporary database class for loading objects into the program 
 * So I can focus on making everything else work before getting bogged down with File I/O
 * 
 * @author KILowrey
 *
 */
package testing;
import enums.school;
import model.*;
import model.Character;
import model.Spell;
import enums.*;

public class TempDatabase
{

	
	/**
	 * populate characters
	 * parse in index, name, level, class, attackBonus, spellSaveDC, and notes.
	 */
	public void createCharacters() 
	{
		Character ThialaAloro = new Character(0, "Thiala Aloro", 4, "Wizard", 6, 14, "My First Major Character! \nThiala Aloro is an Astral Elf with the Lorehold Student Background for a Strixhaven campaign. \nShe is a Wizard with the Baldesinger subclass.");
	}
	
	/**
	 * load up spells as objects
	 * follow this format:
	 * * String inputName, int inputLevel, Enum inputsource,
	 * * Enum inputSchool, String inputCastTime, String inputRange,
	 * * boolean inputIsV, boolean inputIsS, boolean inputIsM, String inputMaterials,
	 * * String inputDuration, boolean inputIsRitual, boolean inputIsConcentration,
	 * * Enum inputAttackType, Enum inputSaveType, 
	 * * String inputSpellText, 
	 * * String inputHigherLevels
	 */
	public void populateSpellList() 
	{
		Spell Light = new Spell("Light", 0, source.SRD, 
				school.EVOCATION, "1 action", "touch", 
				true, false, true, "a firefly or phospehroscent moss", 
				"1 hour", false, false, 
				attackType.NONE, saveType.NONE, 
				"Touch one object that is no larger than 10 feet in any dimension. Until the spell ends, the object sheds bright light in a 20 foot radius and dim light for an additional 20 feet. The light can be colored as you like. Completely covering the object with something opaque blocks the light. The sepll ends if you cast it again or dismiss it as an action.",
				"");
		
		Spell SacredFlame = new Spell("Sacred Flame", 0, source.SRD,
				school.EVOCATION, "1 action", "60'",
				true, true, false, "", 
				"Instant", false, false,
				attackType.NONE, saveType.DEX, 
				"Flame-like radience dexcends on a creature that you can see within range. The target must succeed on a Dexterity saving throw or take 1d8 radiant damage. The target gains no benefit from cover for this saving thow.",
				"increases by 1d8 at levels 5, etc.");
		
		Spell Shield = new Spell("Shield", 1, source.SRD,
				school.ABJURATION, "1 react", "Self",
				true, true, false, "",
				"1 round", false, false,
				attackType.NONE, saveType.NONE,
				"An invisible barrier of magical force appears and protects you. Until the start of you next turn, you have +5 to AC, including against the triggering attack, and you take no damage from magic missile.",
				"");
		
		Spell MagicMissile = new Spell("Magic Missile", 1, source.SRD,
				school.EVOCATION, "1 act", "120'",
				true, true, false, "",
				"Instant", false, false,
				attackType.NONE, saveType.NONE,
				"You create 3 glovwing darts of magical force. Each dart hits a creature of your choice that you can see withn range. a dart deals 1d4+1 force damage to it's target. the darts all strike simltaneiously and you can direct them to hit one creature or several",
				"When you cast this spell useing a spell slot of 2nd level or higher, the spell creates one more dart for each slot level above 1st");
		
		Spell Shatter = new Spell("Shatter", 2, source.SRD,
				school.EVOCATION, "1 act", "60'",
				true, true, true, "a chip of mica",
				"1 act", false, false,
				attackType.NONE, saveType.CON,
				"a sudden loud ringing noise from point of choice. each creature in 10'rad sphere centered on that point makes a CON saving throw. take 3d8 thunder damage on a failed save and half as much on success. Creature made of inorganic mateiral has disadvantage on ST. Nonmagical object not being worn or carried also takes damage.",
				"Damage increases by 1d8 for each slot level above 2nd");
		
		
	}
}
