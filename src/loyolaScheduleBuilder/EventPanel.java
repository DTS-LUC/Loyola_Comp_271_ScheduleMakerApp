// package loyolaScheduleBuilder;

import java.awt.Color;
import java.lang.*;
import javax.swing.*;

public class EventPanel extends JPanel
{
	private String	courseString;
	private JLabel	courseLabel;
	private JLabel	courseName;
	private JLabel	professor;

	public EventPanel()
	{
		// How to distinguish time
		// Set a border
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	} 

	private void setCourse(String dept, int cNum)
	{
		courseString = dept + " " + String.valueOf(cNum);
		courseLabel = new JLabel(courseString);
		this.add(courseLabel);
	}

	public void setCourseName(String cName)
	{
		courseName = new JLabel(cName);
		this.add(courseName);
	}

	public void setProfessor(String prof)
	{
		professor = new JLabel(prof);
		this.add(professor);
	}
		
	public String getCourse()
	{
		return courseString;
	}
}
