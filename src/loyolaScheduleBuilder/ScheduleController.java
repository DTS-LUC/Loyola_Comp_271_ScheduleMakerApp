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
	private RemoveClass removeView;
	private AddClass addView;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class removeListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			

				
			}
			
		}
		
	}
	
}