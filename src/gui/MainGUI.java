/**
 * 
 */
package gui;
import javax.swing.*;

public class MainGUI extends JFrame
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
		createMainPanel();
		add(mainPanel);
		
		// display the window
		setVisible(true);
	}
	
	private void createMainPanel()
	{
		mainPanel = new JPanel();
		
		// create all our stuff we need
	}

}
