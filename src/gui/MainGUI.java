package gui;

/**
 * 
 * @author KILowrey
 */

import java.awt.event.ActionListener;
import javax.swing.*;

public class MainGUI extends JFrame implements ActionListener
{

	//////// FIELDS ////////
	private JPanel mainPanel;
	// add the rest of what I need
	
	public MainGUI() 
	{
		// call superclass constructor and title the window
		super("D&D Spell Tracker");
		
		// size of window stuff such as:
		// final int WINDOW_WIDTH = 350;
		// final int WINDOW_HEIGHT = 250;
		
		// set the size 
		setSize(350, 250);
		
		// set the program to end when the widow is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// make a JPANEL and add it to the frame
		//createMainPanel();
		mainPanel = new JPanel();
		add(mainPanel);
		
		// display the window
		setVisible(true);
	}
	
	/**
	 * TODO for V2: replace JFrame.EXIT_ON_CLOSE with a function that saves/updates the database and then invokes JFrame.EXIT_ON_CLOSE
	 */
	// public void saveAndClose() {}

}
