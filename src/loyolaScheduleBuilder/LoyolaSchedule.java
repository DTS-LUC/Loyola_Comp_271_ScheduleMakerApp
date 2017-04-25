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
	private JButton addButton = new JButton("Add Class");
	private JButoon removeButton = new JButton("Remove Class");
	// ?? Private JLabel scheduleSlot = new JLabel??
	// Eventually a print button
	
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

		/* TO_DO:
			Set Layout
			Create Add Button
				- Create ActionListener
			Create Remove Button
				- Create ActionListener


		*/
	}
}
