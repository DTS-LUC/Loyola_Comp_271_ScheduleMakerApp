// package loyolaScheduleBuilder;

import java.awt.Color;
import java.lang.*;
import javax.swing.*;
import java.awt.Dimension;

public class EventPanel extends JPanel
{
	private String	courseString;
	private JLabel	courseLabel;
	private JLabel	courseName;
	private JLabel	professor;

	public EventPanel(int x, int y)
	{
		// How to distinguish time
		// Set a border
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setPreferredSize(new Dimension(x, y));
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

	public void clear()
	{
		courseString = null;
		courseLabel = null;
		courseName = null;
		professor = null;
	}
}
