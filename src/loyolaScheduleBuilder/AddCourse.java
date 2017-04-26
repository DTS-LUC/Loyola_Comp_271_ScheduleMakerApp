//READ THIS FIRST
/*
*Still not done... clearly... I am sorry I know y'all need this done I keep thinking in circles

Right now, here is what I'm doing:

I've scrapped a couple of different versions of this, but I am making the buttons for each option in add course. 
Here is how they should be laid out from what I understand:

BASICS

Pop up window for creating new events
		-Called from main class 'Schedule'
		-Collects information to store in 'ScheduleEvent'
		-Returns newly 'ScheduledEvent' to 'Schedule'

-JButton for AddCourse: 
	-JButton for addcourse... 
	-Action Listener adds course 
	-Tied to ScheduleEvent
	*Action Listener takes activity within AddCourse class and links it to ScheduleEvent
-JCheckBox Course Days
	-JCheckBox for each course day (M-T-W-TH-F)
	*ActionListener should add days to the array in ScheduleEvent.java based on the Day selected
-JComboBox Course Time (Military--it's easier)
	-JComboBox for each hour (01-23)
	-JComboBox for each minute (00-59)
	*Action: Tie the integer provided in hour and minute to the integer linked in each array
	

-Add action Listeners for each of these and link them Controller class



IF WE HAVE TIME WE CAN ADD SHIT FOR MORE DETAILS
-department
-prof
-course #
-Location
	
~fUtUrE ideas~	- Location: LSC only... Building Drop down, room number user input
					For program additions later on, we could also put
						-Campus drop down
						-Professor (User input)
							--with link to info/pic of prof
							--link to syllabus & office hour schedule
								---option to display office hour schedule over your own to see when you could go
						-Subject & Class #
						-etc. ... time constraints though so we will not work with these right now
			- Color of class input
			- The main class will then add the class input
			
*/

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

import java.awt.event.*;

public class AddCourse extends JFrame{
	
	JButton addCourseB;
	JTextField addCourseTF;
	JTextArea addCourseTxtA;
	String newCourse; 
	
	public static void main(String[] args){
		
		new AddCourse();
		
	}

	public AddCourse(){
		
		//Panel: newCourseP ... houses components of Course Addition
		
		JPanel newCourseP = new JPanel();
		newCourseP.setLayout(new BorderLayout());
		
			//Button for newCourseP
			addCourseB = new JButton("Add Course");
			
			newCourseP.add(addCourseB); //adds it to the panel
			
				//Text Field: newCoursePTF... where user will input their new Course
				JTextField newCoursePTF = new JTextField("", 35);
				
				newCoursePTF.setColumns(10);
				
				newCoursePTF.setText("");
				
				newCourseP.add(newCoursePTF); //adds field to panel
			
			//JCheckbox --> Days
			
			JPanel checkBoxPanel = new JPanel();
				
			JCheckBox mButton;
			JCheckBox tButton;
			JCheckBox wButton;
			JCheckBox thButton;
			JCheckBox fButton; 
			
			/*
			 * There are 25 possible combinations for these days... 
			 * 0 days
			 * 1 of the 5 days (5! ways, 5 without difference )
			 * 2 of the five days (60 [5!/2!], ...)
			 * 3 of the five days (20)
			 * 4 of the five days (5)
			 * 5 days
			 */
			
				//Here we create the checkboxes and add them to the check box panel
				mButton = new JCheckBox("M");
				checkBoxPanel.add(mButton);
				
				tButton = new JCheckBox("T");
				checkBoxPanel.add(tButton);
				
				wButton = new JCheckBox("W");
				checkBoxPanel.add(wButton);
				
				thButton = new JCheckBox("TH");
				checkBoxPanel.add(thButton);
				
				fButton = new JCheckBox("F");
				checkBoxPanel.add(fButton);
				
				newCourseP.add(checkBoxPanel);
				
				
				
				
				//Now the Listeners
				mButton.addDayListener(this);
				tButton.addDayListener(this);
				wButton.addDayListener(this);
				thButton.addDayListener(this);
				fButton.addDayListener(this);
				
				//Indicate what days you can choose
				choices = new StringBuffer("M-T-W-TH-F");
				
				
				
				add(addCourseP, BorderLayout.LINE_START);
				setBorder(BorderFactory.createEmptyBorder(20,20,20,20));// Unclear from java tutorial on oracle??? 
				
				
			//JComboBox & JRadioButton--> Time
			private
			
			}
			
				
				
			
			
			
			
		this.add(newCourseP);
		
		this.setVisible(true);
		
	}
	
	//Implements Listeners for all our controls (i.e., gives them actions)
	
	private class dayCheckBox implements ItemListener{
		
		public void actionPerformed(KeyEvent )
		
	}
	
}
