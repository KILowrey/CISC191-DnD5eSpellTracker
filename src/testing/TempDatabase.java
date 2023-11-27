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
	Character ThialaAloro = new Character(0, "Thiala Aloro", 4, "Wizard", 6, 14, "My First Character!");
	
	/**
	 * FOR SPELLS
	 * String inputName, int inputLevel, String inputNotes,
	 * Enum inputSchool, String inputCastTime, String inputRange,
	 * boolean inputIsV, boolean inputIsS, boolean inputIsM, String inputMaterials,
	 * String inputDuration, boolean inputIsRitual, boolean inputIsConcentration,
	 * Enum inputAttackType, Enum inputSaveType, String inputSpellText, String inputHigherLevels, Enum inputSource
	 */
	Spell Light = new Spell("Light", 0, "from Astral Elf", 
							school.EVOCATION, "1 action", "touch", 
							true, false, true, "a firefly or phospehroscent moss", 
							"1 hour", false, false, 
							attackType.NONE, saveType.NONE, "Touch one object that is no larger than 10 feet in any dimension. Until the spell ends, the object sheds bright light in a 20 foot radius and dim light for an additional 20 feet. The light can be colored as you like. Completely covering the object with something opaque blocks the light. The sepll ends if you cast it again or dismiss it as an action.",
							"", source.SRD);
	Spell SacredFlame = new Spell("Sacred Flame", 0, "from Lorehold Student",
							school.EVOCATION, "1 action", "60'",
							true, true, false, "", 
							"Instant", false, false,
							attackType.NONE, saveType.DEX, "Flame-like radience dexcends on a creature that you can see within range. The target must succeed on a Dexterity saving throw or take 1d8 radiant damage. The target gains no benefit from cover for this saving thow.",
							"increases by 1d8 at levels 5, etc.", source.SRD);
	
}
