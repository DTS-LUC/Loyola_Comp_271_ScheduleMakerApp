// GUI (Swing) class for displaying schedule
/*
	BASIC_STRUCTURE (old)
		-JButton AddClass
		-JButton RemoveClass
		-JMenu {"New", "Print"}
		-JLabel[42] TimeSlots (Will just read, then write, data recieved from 'LoyolaEvent'
		-Keylistener for buttons
		
	TO_DO (old)
		- Create constructor
		- Create event listeners for jButtons
		- Create methods for calling other classes
		- Method for removing events (Will simply clear JLabels)
		- Figure out menu bar
			- Also how to print schedule
		
*/
package loyolaScheduleBuilder;

import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.util.*;
import javax.swing.*;

public class LoyolaSchedule extends JFrame
{
	// Components need for schedule GUI

	// Button Components
	private Jpanel buttonPane;
	private JButton addButton;
	private JButton removeButton;
	// printButton
	// resetButton
	

	// Schedule Components
	private Jpanel schedulePane;
	private JLabel[] monday = new JLabel[9];
	private JLabel[] tuesday = new JLabel[8]; // Contains a blank label for alignment
	private JLabel[] wednesday = new JLabel[9];
	private JLabel[] thursday = new JLabel[8];
	private JLabel[] friday = new JLabel[9];
	
	public LoyolaSchedule()
	{
		this.setSize(800, 800);
		Toolkit tk = Toolkit
		this.setVisible(true);
		Dimension dim = tk.getScreenSize();
		// Find the center of the screen
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		this.setLocation(xPos, yPos);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Loyola Schedule Builder");

		//Create and initialize the buttons. **** Edited from Oracle Documentation ListDialog.java
        addButton = new JButton("Add"); // By default sets ActionCommand to match the label
        cancelButton.addActionListener(this);
        removeButton = new JButton("Remove");
        removeButton.addActionListener(this);

		//Lay out the buttons from left to right.
		buttonPane = new JPanel();
		buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
		buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		buttonPane.add(Box.createHorizontalGlue());
		buttonPane.add(addButton);
		buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonPane.add(removeButton);

		// TO_DO: Set grid constraints

		resetLabels()
		/* TO_DO:
			Set Layout
				-GridBagLayout
			Create Add Button
				- Create ActionListener
			Create Remove Button
				- Create ActionListener


		*/
	}

	public void resetLabels()
	{
		int i;
		// Monday
		for (i = 0; i <= 6; i++) // Set first set of dimensions
		{
			
		}
		monday[7] // Dimensions
		monday[8]

		// Tuesday
		tuesday[0]
		for (i = 1; i <= 5; i++)
		{
			
		}
		tuesday[6]
		tuesday[7]

		// Wednesday
		for (i = 0; i <= 6; i++)
		{
			
		}
		wednesday[7]
		wednesday[8]

		// Thursday
		thursday[0]
		for (i = 1; i <= 5; i++)
		{
			
		}
		thursday[6]
		thursday[7]

		// Friday
		for (i = 0; i <= 6; i++)
		{
			
		}
		friday[7]
		friday[8]
	}
}
