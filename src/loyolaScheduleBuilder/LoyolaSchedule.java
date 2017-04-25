// GUI (Swing) class for displaying schedule
// Contains main method
/*
	BASIC_STRUCTURE
		-JButton AddClass
		-JButton RemoveClass
		-JMenu {"New", "Print"}
		-JLabel[42] TimeSlots (Will just read, then write, data recieved from 'LoyolaEvent'
		-Keylistener for buttons
		
	TO_DO
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
	//private JLabel scheduleSlot = new JLabel
	
	LoyolaSchedule()
	{
		
	}
}
