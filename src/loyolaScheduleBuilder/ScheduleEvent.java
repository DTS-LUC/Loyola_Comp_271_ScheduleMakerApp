//package loyolaScheduleBuilder;

import java.awt.Color;
import java.lang.*;

public class ScheduleEvent
{
	private String department;
	private int	courseNumber;
	private String courseName;
	private String professor;
	private int[]	daySlots;	// Integer 0 = Monday, 1 = Tuesday,...
	private int timeSlot;
	// private Color background = Color.GREEN;

// Constructor
	public ScheduleEvent (String dept, int cNum, String cName, String prof, int[] dSlot, int tSlot, Color bGround)
	{
		// Add department
		this.department = new String(dept);

		// Add course number
		this.courseNumber = cNum;

		// Add course name
		this.courseName = cName;

		// Add professor
		this.professor = new String(prof);

		// Add day
		this.daySlots = dSlot;

		// Add time
		this.timeSlot = tSlot;

		// Add background color
		// this.background = bGround;
	} 

// Methods for setting individual data fields
	private void setDepartmentNumber(String dept)
	{
		this.department = new String(dept);
	}

	private void setCourseNumber(int cNum)
	{
		this.courseNumber = cNum;
	}

	public void setCourseName(String cName)
	{
		this.courseName = cName;
	}

	public void setProfessor(String prof)
	{
		this.professor = new String(prof);		
	}

	public void setDays(int[] dSlot)
	{
		this.daySlots = dSlot;
	}

	public void setTime(int tSlot)
	{
		this.timeSlot = tSlot;
	}

	// public void setBackground(Color bGround)
	// {
	// 	this.background = bGround;
	// }



// Methods for returning data	
	public String getDeptartment()
	{
		return department;
	}

	public int getCourseNumber()
	{
		return this.courseNumber;
	}

	public String getCourseName()
	{
		return this.courseName;
	}

	public String getProfessor()
	{
		return this.professor;
	}

	public int[] getDays()
	{
		return this.daySlots;
	}
}
