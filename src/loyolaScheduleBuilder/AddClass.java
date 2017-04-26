//READ THIS FIRST
/*
* I needed a place to back this up cause I'm still working on it and I'm paranoid my computer will crash
*... this is not even close to where I want it to be tho SO gimme a hot sec before using it in the program
* Will be uploading again later tonight...probably multiple times
* thanks fam
* 25 Apr 17 -- 6:18pm
*/





/*
	Pop up window for creating new events
		-Called from main class 'Schedule'
		-Collects information to store in 'ScheduleEvent'
		-Returns newly 'ScheduledEvent' to 'Schedule'
		
	BASIC_STRUCTURE
	
	
	Notes:
		Will need to extend class JFrame JFrame
		
		Time variable should be selected from JComboBox (like a drop down menu). This will make it easier to assign the proper jlabel for time slots
			-Will also limit to classes that don't align perfectly - Difficult for lab times
	TO_DO
		Declare variables (courseName, day(s), time, location, bgColor, anything else? ) to collect
		
		create JTextFields, OptionPanes, or other form to collect data in proper format
		- JColorChooser to select background
		
		
		
		- Check boxes to select days
			values(Monday 0, Tuesday 1, ...)
		
		create a new 'ScheduleEvent' with variables
		return new 'ScheduleEvent' to main class
 */

/*Add Class 
		BASIC_STRUCTURE
			- Add Class Button with textArea for user input of class
			- Day Check Boxes (M-F)
			- Time: Start and End --> Drop down boxes for 01-12 hour, 00-59 min, am & pm buttons
			- Location: LSC only... Building Drop down, room number user input
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
