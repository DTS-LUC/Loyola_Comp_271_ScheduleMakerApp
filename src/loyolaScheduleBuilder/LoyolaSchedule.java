// package loyolaScheduleBuilder;

import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.util.*;
import javax.swing.*;
import java.awt.BorderLayout;

public class LoyolaSchedule extends JFrame implements ActionListener
{
	// Components needed for schedule GUI

	// Button Components
	private JPanel buttonPane;
	private JButton addButton;
	private JButton removeButton;
	// printButton
	// resetButton
	

	// Schedule Components
	private JPanel schedulePane;
	private JPanel monPane;
	private JPanel tuePane;
	private JPanel wedPane;
	private JPanel thrPane;
	private JPanel friPane;
	private EventPanel[] monday = new EventPanel[9];
	private EventPanel[] tuesday = new EventPanel[8]; // Contains a blank label for alignment
	private EventPanel[] wednesday = new EventPanel[9];
	private EventPanel[] thursday = new EventPanel[8];
	private EventPanel[] friday = new EventPanel[9];

	
	public LoyolaSchedule()
	{
		courseList = new LinkedList<String>();

		this.setSize(800, 800);
		Toolkit tk = Toolkit.getDefaultToolkit();
		this.setVisible(true);
		Dimension dim = tk.getScreenSize();
		// Find the center of the screen
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		this.setLocation(xPos, yPos);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Loyola Schedule Builder");

		//Create and initialize the buttons. **** Edited from Oracle Documentation ListDialog.java
        addButton = new JButton("Add"); // By default sets ActionCommand to match the label
        addButton.addActionListener(this);
        removeButton = new JButton("Remove");
        removeButton.addActionListener(this);

		//Lay out the buttons from left to right.
		buttonPane = new JPanel();
		buttonPane.setPreferredSize(new Dimension(800, 100));
		buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
		buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		buttonPane.add(Box.createHorizontalGlue());
		buttonPane.add(addButton);
		buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonPane.add(removeButton);

		// TO_DO: Set grid constraints

		sizePanels();

		// schedulePane = new JPanel();

		// Fill Monday Pane -Set dimensions for each pane Dimensions(160,700)

		// Fill Tuesday Pane

		// Fill Wednesday Pane

		// Fill Thursday Pane

		// Fill Friday Pane

		// Fill Schedule pane left to right
	
		this.add(buttonPane, BorderLayout.PAGE_START);
		this.setVisible(true);
	}

	public void sizePanels()
	{
		int i;
		// Monday
		for (i = 0; i <= 6; i++) // Set first set of dimensions
		{
			monday[i].setPreferredSize(new Dimension(80, 160));		
		}
		monday[7].setPreferredSize(new Dimension(100, 160)); // Dimensions
		monday[8].setPreferredSize(new Dimension(100, 160));

		// Tuesday
		tuesday[0].setPreferredSize(new Dimension(20, 160));
		for (i = 1; i <= 7; i++)
		{
			tuesday[i].setPreferredSize(new Dimension(100, 160));
		}

		// Wednesday
		for (i = 0; i <= 6; i++)
		{
			wednesday[i].setPreferredSize(new Dimension(80, 160));
		}
		wednesday[7].setPreferredSize(new Dimension(100, 160));
		wednesday[8].setPreferredSize(new Dimension(100, 160));

		// Thursday
		thursday[0].setPreferredSize(new Dimension(20, 160));
		for (i = 1; i <= 5; i++)
		{
			thursday[i].setPreferredSize(new Dimension(100, 160));
		}
		thursday[6].setPreferredSize(new Dimension(100, 160));
		thursday[7].setPreferredSize(new Dimension(100, 160));

		// Friday
		for (i = 0; i <= 6; i++)
		{
			friday[i].setPreferredSize(new Dimension(80, 160));
		}
		friday[7].setPreferredSize(new Dimension(100, 160));
		friday[8].setPreferredSize(new Dimension(100, 160));
	}

	public void setPanel(ScheduleEvent e)
	{
		courseList.add(e.getDepartment() + " " + String.valueOf(e.getCourseNumber()));

		int time = e.getTime;

		switch (e.getDay()){
			case 0:	//Monday
				monday[time].setCourse(e.getDepartment(), e.getCourseNumber());
				monday[time].setCourseName(e.getCourseName());
				monday[time].setProfessor(e.getProfessor());
				monday[time].setBackground(e.getBackground());
				return;

			// Possible issues with location of Tuesday and Thursday slots
			case 1: // Tuesday
				tuesday[time].setCourse(e.getDepartment(), e.getCourseNumber());
				tuesday[time].setCourseName(e.getCourseName());
				tuesday[time].setProfessor(e.getProfessor());
				tuesday[time].setBackground(e.getBackground());
				return;

			case 2: // Wednesday
				wednesday[time].setCourse(e.getDepartment(), e.getCourseNumber());
				wednesday[time].setCourseName(e.getCourseName());
				wednesday[time].setProfessor(e.getProfessor());
				wednesday[time].setBackground(e.getBackground());
				return;

			case 3: // Thursday
				thursday[time].setCourse(e.getDepartment(), e.getCourseNumber());
				thursday[time].setCourseName(e.getCourseName());
				thursday[time].setProfessor(e.getProfessor());
				thursday[time].setBackground(e.getBackground());
				return;

			case 4: // Friday
				friday[time].setCourse(e.getDepartment(), e.getCourseNumber());
				friday[time].setCourseName(e.getCourseName());
				friday[time].setProfessor(e.getProfessor());
				friday[time].setBackground(e.getBackground());
				return;

			default:
				return; // Set an error message
			}
	}

	public void actionPerformed(ActionEvent e)
	{
        if ("Add".equals(e.getActionCommand()))
        {
        	this.setVisible(false);
            // Call add class
        }
    }

	public static void main (String[] args)
	{
		new LoyolaSchedule();
	}


}







