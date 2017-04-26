/*
	Main controller class for communicating between View and Model

	Action Listeners for add and remove class

	List(Int or String) of classes - May want to Append into 1 variable

Methods:
	Retrive data from Add class

	Append text on JLables
*/

// Focus on how to edit & remove labels in LoyolaSchedule.java
	// Searching Grid? Columns? GridBagLayout

package loyolaScheduleBuilder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class ScheduleController
{
	
	private LoyolaSchedule theSchedule;
	private RemoveClass viewRemove;
	private AddClass viewAdd;

	private List<String> courseList;
	
	public ScheduleController(LoyolaSchedule theSchedule, RemoveClass viewRemove, AddClass viewAdd, ) {
		this.theSchedule = theSchedule;
		this.viewRemove = viewRemove;
		this.viewAdd = viewAdd;
		
		this.theView.addCalculateListener(new CalculateListener());
	}


	// Action listener for add button on theSchedule
	class addClassListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			// Needs to call viewAdd	
			
		}
		
	}

	// Action listener for viewAdd submit button
	class addListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			// Needs to collect ScheduleEvent and pass it to the setEventPanel in theSchedule
			
		}
		
	}
	
	// Action listener for remove button on theSchedule
	class removeClassListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			// Needs to pass course list to removeView

			
		}
		
	}

	// Action listener for viewRemove submit button
	class removeListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			// Needs to collect course from removeView and pass it to remove method on theSchedule

		}
		
	}

	
}