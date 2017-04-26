/*
	Main controller class for communicating between View and Model

	Action Listeners for add and remove class
*/

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
		
		this.theView.addCalculateListener(new CalculateListener());
	}


	// Action listener for add button on theSchedule
	class addClassListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			// Needs to call viewAdd
			viewAdd = new AddClass();
			
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
			viewRemove = new RoveClass(courseList);
			viewRemove.toFront();
		}
		
	}

	// Action listener for viewRemove submit button
	class removeListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			// Need to build removeCourse method in RemoveClass to retrieve selected course
			String removedClass = new String(viewRemove.removeCourse());
			viewRemove.setVisible(false);
			viewRemove.dispose();

			//
			theSchedule.removePanel(removedClass); //need to build in theSchedule
			//

		}
		
	}

	
}