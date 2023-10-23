# CISC191-DnD5eSpellTracker
8 week Java Project for CISC 191. A Spells Tracker for DnD5e

## Project Proposal

### Project Pitch
Spells are a major part of playing Dungeons & Dragons. It you're a Spellcaster like a Wizard or Sorcerer, it's pretty much your entire gameplay. If you're a partial caster, it's still a part of your game play. and while there are a few classes that can go spell free, usually the party will be at least half people who can cast some kind of spells.

But keeping track of spells can be a hassle. If you're a Wizard you learn 2 new spells each time you gain a level, which can really add up. If you're a Cleric you can prepare any spell on the Cleric spell list. Anyone who casts spells needs to keep track of how many they've casted and how many spell slots they have left.

__I'm making a D&D fifth edition Spell Tracker to help make spells less of a hassle when playing D&D.__

Players will be able to keep track of how many spells slots they have and have left (or if they use spell points keep track of those). Players will have an easy to navigate list of their spells that can be sorted by if they're a ritual (meaning you can cast them without using your limited number of spells you can cast a day as long as you take 10 minutes on it), if they're prepared (meaning you don't just know it but can actually cast it right now) or not (or *always* prepared due to subclass or other features), or just the level of the spells. 

### Learning Outcomes

__Employ design Principles of Object-Oriented Programming (LO1):__
This is an Object-Oriented project not just because it's made using an object oriented language. The core of the project is that users will create a "Character" object that stores relevant data including which "Spells" the character has access to. Spells are another object with stores lots of data. The data stored in objects like character and spell and how we use/display/track it is the basis of this project. 

__Util Single and Multidimensional Arrays (LO2, optional):__
(I don't think arrays will be used in this project but I'm keeping this up here in case I find that they *are* the best way to do something later.)

__Object and Classes in Object-Oriented Programming, Including Aggregation (LO3):__
Character HAS-A Spells List of the Spells they know.
Spell List is made of Spells.

__Util Inheritance and Polymorphism, Including Abstract Classes and Interfaces (LO4):__
Spell Points and Sorcery points will both inherent from a "Points" abstract class which has an interface for adding, subtracting, displaying, etc. the number of points.

__Util Generic Collections and Data Structures (LO5):__
In order to store and access spell elements this project will have to use generic collections and data structures for the Spells and also the Characters and their settings that the user has saved.

__Util Graphical User Interfaces and utilizing Event-Driven Programming (LO6):__
This program will be a window with with the user selecting buttons and other GUI interfaces to change what they see. For example, There will be checkboxes for spell slots that users can set to keep track of if they used that spell slot.

__Util Exception Handling (LO7):__
This project will through up errors when users do something they're not supposed to in the program that would mess it up. Such as subtract the number of spell points they have into a negative number (you can't have negative spell points in DnD)

__Util Text File I/O (LO8)__
This project will utilize text file input/output by reading and writing to files to store spells and save data, such as characters, between sessions.

### Timeline
__Everyweek__
 - Updtae project page with the progress details.
 - Submit code written so far.

__Week 1__
 - Write the project proposal
 - Plan the object-oriented design, starting with CRC cards. Determine classes (with fields and methods) and interfaces and their responsibilities. (the "model" part of MVC.)
 - Create the UML.
 - Begin writing project page.

__Week 2__
 - Write code for all the Character, Spells, and Points classes and Interfaces
 - Start copying over all the SRD spell files
 - Develop text cases and test code as it is written.

__Week 3__
 - "Finalize" the code for Character, Spells, and Points classes and interfaces
 - Continue to copy over the SRD spell files
 - Determine where exception handling is needed to ensure the program fails gracefully
 - Design th eGUI (sketch it out on paper) - include the design in the weekly update!

__Week 4__
 - Finish copying over the SRD spell files if haven't already
 - Perfect code for the Character, Spells, and Points classes and interfaces.
 - Test, test, test, debug, and test some more.

__Week 5__
 - Write code to create a non-functional GUI (the "view" part of MVC.)

__Week 6__
 - Add event handling to make the GUI funcitonal (the "controller" part of MVC).

__Week 7__
 - Test, test, test, debug, and test some more

__Week 8__
 - Debug any remaining problems.
 - Create project demonstration video, including information about hwo each LO is used as part of the project.
 - Submit final code on Canvas, and add videos to project page.

## Deliverables per Week

## Project Wrap-up

