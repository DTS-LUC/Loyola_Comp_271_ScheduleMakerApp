// package loyolaScheduleBuilder;
// Need to figure out how to get proper dimensions set


import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.util.*;
import javax.swing.*;
import java.awt.FlowLayout;



public class LoyolaSchedule extends JFrame
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
		this.setSize(850, 900);
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


		Box mainBox = Box.createVerticalBox();

		//Create and initialize the buttons. **** Edited from Oracle Documentation ListDialog.java
        addButton = new JButton("Add"); // By default sets ActionCommand to match the label
        removeButton = new JButton("Remove");




		//Lay out the buttons from left to right.
		buttonPane = new JPanel();
		buttonPane.setPreferredSize(new Dimension(800, 100));
		buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		buttonPane.add(Box.createHorizontalGlue());
		buttonPane.add(addButton);
		buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonPane.add(removeButton);


		sizePanels();

		schedulePane = new JPanel();
		schedulePane.setPreferredSize(new Dimension(850, 800));

		// Fill Monday Pane
		monPane = new JPanel();
		monPane.setPreferredSize(new Dimension(160,800));
		Box mondayBox = Box.createVerticalBox();
		for (int i = 0;i <= 8; i++)
		{
			mondayBox.add(monday[i]);
		}
		monPane.add(mondayBox);
		
		// Fill Tuesday Pane
		tuePane = new JPanel();
		tuePane.setPreferredSize(new Dimension(160,800));
		Box tuesdayBox = Box.createVerticalBox();
		for (int i = 0;i <= 7; i++)
		{
			tuesdayBox.add(tuesday[i]);
		}
		tuePane.add(tuesdayBox);

		// Fill Wednesday Pane
		wedPane = new JPanel();
		wedPane.setPreferredSize(new Dimension(160,800));
		Box wednesdayBox = Box.createVerticalBox();
		for (int i = 0;i <= 8; i++)
		{
			wednesdayBox.add(wednesday[i]);
		}
		wedPane.add(wednesdayBox);

		// Fill Thursday Pane
		thrPane = new JPanel();
		thrPane.setPreferredSize(new Dimension(160,800));
		Box thursdayBox = Box.createVerticalBox();
		for (int i = 0;i <= 7; i++)
		{
			thursdayBox.add(thursday[i]);
		}
		thrPane.add(thursdayBox);

		// Fill Friday Pane
		friPane = new JPanel();
		friPane.setPreferredSize(new Dimension(160,800));
		Box fridayBox = Box.createVerticalBox();
		for (int i = 0;i <= 8; i++)
		{
			fridayBox.add(friday[i]);
		}
		friPane.add(fridayBox);

		// Fill Schedule pane left to right
		schedulePane.add(monPane);
		schedulePane.add(tuePane);
		schedulePane.add(wedPane);
		schedulePane.add(thrPane);
		schedulePane.add(friPane);

		mainBox.add(buttonPane);
		mainBox.add(schedulePane);
		this.add(mainBox);
		this.setVisible(true);
	}

	public void sizePanels()
	{
		int i = 0;
		// Monday
		for (i = 0; i <= 6; i++) // Set first set of dimensions
		{
			monday[i] = new EventPanel(160, 80);		
		}
		monday[7] = new EventPanel(160, 100);
		monday[8] = new EventPanel(160, 100);

		// Tuesday
		tuesday[0] = new EventPanel(160, 25);
		for (i = 1; i <= 7; i++)
		{
			tuesday[i] = new EventPanel(160, 105);
		}

		// Wednesday
		for (i = 0; i <= 6; i++)
		{
			wednesday[i] = new EventPanel(160, 80);
		}
		wednesday[7] = new EventPanel(160, 100);
		wednesday[8] = new EventPanel(160, 100);

		// Thursday
		thursday[0] = new EventPanel(160, 25);
		for (i = 1; i <= 7; i++)
		{
			thursday[i] = new EventPanel(160, 105);
		}

		// Friday
		for (i = 0; i <= 6; i++)
		{
			friday[i] = new EventPanel(160, 80);
		}
		friday[7] = new EventPanel(160, 100);
		friday[8] = new EventPanel(160, 100);
	}

	// public void setPanel(ScheduleEvent e)
	// {
	// 	int time = e.getTime;

	// 	switch (e.getDay()){
	// 		case 0:	//Monday
	// 			monday[time].setCourse(e.getDepartment(), e.getCourseNumber());
	// 			monday[time].setCourseName(e.getCourseName());
	// 			monday[time].setProfessor(e.getProfessor());
	// 			monday[time].setBackground(e.getBackground());
	// 			return;

	// 		// Possible issues with location of Tuesday and Thursday slots
	// 		case 1: // Tuesday
	// 			tuesday[time].setCourse(e.getDepartment(), e.getCourseNumber());
	// 			tuesday[time].setCourseName(e.getCourseName());
	// 			tuesday[time].setProfessor(e.getProfessor());
	// 			tuesday[time].setBackground(e.getBackground());
	// 			return;

	// 		case 2: // Wednesday
	// 			wednesday[time].setCourse(e.getDepartment(), e.getCourseNumber());
	// 			wednesday[time].setCourseName(e.getCourseName());
	// 			wednesday[time].setProfessor(e.getProfessor());
	// 			wednesday[time].setBackground(e.getBackground());
	// 			return;

	// 		case 3: // Thursday
	// 			thursday[time].setCourse(e.getDepartment(), e.getCourseNumber());
	// 			thursday[time].setCourseName(e.getCourseName());
	// 			thursday[time].setProfessor(e.getProfessor());
	// 			thursday[time].setBackground(e.getBackground());
	// 			return;

	// 		case 4: // Friday
	// 			friday[time].setCourse(e.getDepartment(), e.getCourseNumber());
	// 			friday[time].setCourseName(e.getCourseName());
	// 			friday[time].setProfessor(e.getProfessor());
	// 			friday[time].setBackground(e.getBackground());
	// 			return;

	// 		default:
	// 			return; // Set an error message
	// 		}
	// }

	// Add ActionListener to AddButton
	public void addAddButtonListener(ActionListener listenForAddButton)
	{
		addButton.addActionListener(listenForAddButton);
	}

	// Add ActionListener to RemoveButton
	public void addRemoveButtonListener(ActionListener listenForRemoveButton)
	{
		removeButton.addActionListener(listenForRemoveButton);
	}

	// // Not the most effective means
	// public void clearPanel(String toRemove)
	// {
	// 	for(int i = 0; i <= 8; i++)
	// 	{
	// 		if(toRemove.equals(monday[i].getCourse))
	// 		{
	// 			monday[i].clear();
	// 		}

	// 		if(toRemove.equals(wednesday[i].getCourse))
	// 		{
	// 			wednesday[i].clear();
	// 		}

	// 		if(toRemove.equals(friday[i].getCourse))
	// 		{
	// 			friday[i].clear();
	// 		}
	// 	}
	// }
}







