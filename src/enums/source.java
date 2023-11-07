package enums;
/**
 * Enum for the source of a spell.
 * * SRD means it's a spell found in the System Reference Document and as such is free use for anyone
 * * WOTC means while it's not SRD, the source is still Wizards of the Coast and is an official spell
 * * HB stands for HomeBrew and encompasses all non-official spells such as third party or random spell on the internet DM said they'll allow
 */
public enum source
{
	SRD,
	WOTC,
	HB
}
