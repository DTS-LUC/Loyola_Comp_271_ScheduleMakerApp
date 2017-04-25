
package loyolaScheduleBuilder;

import java.awt.Color;
import java.lang.*;

public class ScheduleEvent
{
	private String department;
	private int	courseNumber;
	private String courseName;
	private String professor;
	private int	daySlot;	// Integer 0 = Monday, 1 = Tuesday,...
	private int timeSlot;
	private Color background = Color.GREEN;

	public scheduleEvent (String dept, int cNum, String cName, String prof, int dSlot, int tSlot, Color bGround)
	{
		// Add department
		this.department[i] = new String(dept);

		// Add course number


		// Add course name
		

		// Add professor


		// Add day


		// Add time


		// Add background color
	} 

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

	}

	public void setProfessor(String prof)
	{
		
	}

	public void setDay(int dSlot)
	{
		
	}

	public void setTime(int tSlot)
	{
		
	}

	public void setBackground(Color bGround)
	{
		
	}
		
	public String getDeptartment()
	{
		return department;
	}
}
