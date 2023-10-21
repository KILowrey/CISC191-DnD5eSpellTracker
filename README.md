# CISC191-DnD5eSpellTracker
8 week Java Project for CISC 191. A Spells Tracker for DnD5e

## Project Proposal

### Project Pitch
Spells are a major part of playing Dungeons & Dragons. It you're a spallcaster like a Wizard or Sorcerer, it's pretty much your entire gameplay. If you're a partial caster, it's still a part of your game play. and while there are a few classes that can go spell free, usually the party will be at least half people who can cast some kind of spells.

But keeping track of spells can be a hassle. If you're a wizard you learn 2 new spells each time you gain a level, which can really add up. If you're a cleric you can prepare any spell on the cleric spell list. Anyone who casts spells needs to keep track of how many they're casted and how many spell slots they have left.

I'm making a D&D fifth edition Spell Tracker to help make spells less of a hassle when playing D&D.

Players will be able to keep track of how many spells slots they have and have left (or if they use spell points keep track of those). Players will have an easy to navigate list of their spells that can be sorted by if they're a ritual, if they're prepared or not (or *always* prepared due to subclass), or just the level of the spells. 

### CRC Cards
(insert CRC Cards)

### UML Diagram
(insert UML Diagram)

### Object-Oriented Design
(link to video of object oriented design.)

### Learning Outcomes

#### Employ design Principles of Object-Oriented Programming (LO1)
This is an Object-Oriented project. The core of the project is that users will create a "Character" object that stores relevant data including which "Spells" the character has access to. Spells are another object with stores lots of data. The data stored in objects like character and spell and how we use/display it is the core of this project.

#### Util Single and Multidimensional Arrays (LO2, optional)
(I don't think I'm gonna do this)

#### Util Object and Classes in Object-Oriented Programming, Including Aggregation (LO3)
"Character" HAS-[MANY] Spells they have access to.
"Character" HAS-A spell slots/points tracker.

#### Util Inheritance and Polymorphism, Including Abstract Classes and Interfaces (LO4)
Spell Points and Sorcery points will both inherite from a "Points" abstract class which has an interface for adding, subtracting, and displaying the number of points.

#### Util Generic Collections and Data Structures (LO5)
In order to store and access spell elements this project will have to use generic collections and data structures.

#### Util Graphical User Interfaces and utilizing Event-Driven Programming (LO6)
This program will be a window with with the user selecting buttons and other GUI interfaces to change what they see.

#### Util Exception Handling (LO7)
This project will through up errors when users do somthing they're not supposed to in the program that would mess it up.

#### Util Text File I/O (LO8)
This project will utilize text file input/output by reading and writing to files to store spells and save data between sessions.

### Timeline
__Everyweek__
 - Updtae project page with the progress details.
 - Submit code written so far.

__Week 1__
 - Write the project proposal
 - Plan the object-oriented design, starting with CRC cards. Determine classes (with fields and methods) and interfaces and their responsiblites. (the "model" part of MVC.)
 - Create the UML.
 - Begin writing project page.

__Week 2__
 - Write code for classes X, Y, Z.
 - Develop text cases and test code as it is written.

__Week 3__
 - Finish writing classes.
 - Determine where exception handling is needed to ensure the program fails gracefully
 - Design th eGUI (sketch it out on paper) - include the design in the weekly update!

__Week 4__
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

