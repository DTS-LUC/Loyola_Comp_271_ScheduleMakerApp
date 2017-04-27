import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;


// package loyolaScheduleBuilder;

public class AddCourse extends JFrame {
	
	JButton addCourseB;
	JTextField addCourseBTF;
	String newCourse;
	
	JCheckBox mCheck;
	JCheckBox tCheck;
	JCheckBox wCheck;
	JCheckBox thCheck;
	JCheckBox fCheck; 
	
	JComboBox hourOfCourse;
	JComboBox minOfCourse;
	
	public static void main(String[] args) {
		
		new AddCourse();
		
	}
		
	public AddCourse(){
		
		//FRAME
		
		this.setSize(700,300);
				
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width/2)-(this.getWidth()/2);
		int yPos = (dim.height/2)-(this.getHeight()/2);
		
		this.setLocation(xPos, yPos);
		
		this.setResizable(false);
				
		this.setTitle("Course Addition");
		
		//PANEL: newCourseP ... houses components of Course Addition
		
		JPanel newCourseP = new JPanel();
		//newCourseP.setLayout(new BorderLayout());
		
			//Add Course Button
			addCourseB = new JButton("Add Course");
			
				
			newCourseP.add(addCourseB); //adds it to the panel
			
				//Text Field for Add Course (addCourseBTF --> Add course button text field)
				JTextField addCourseBTF = new JTextField("",35);
				
				addCourseBTF.setColumns(10);
				
				addCourseBTF.setText("");
				
				newCourseP.add(addCourseBTF);
				
				//Button Listener
				 ListenForButton lForButton = new ListenForButton();
				
				 addCourseB.addActionListener(lForButton);
				 
				 //Text Area to test for classes added
				 JTextArea textArea1;
				 
				 textArea1 = new JTextArea(10,10);
				 
				 textArea1.setText("");
				 
				 newCourseP.add(textArea1);
				
			//M-T-W-TH-F Checkboxes
			JPanel checkBoxPanel = new JPanel();
				
			JCheckBox mCheck;
			JCheckBox tCheck;
			JCheckBox wCheck;
			JCheckBox thCheck;
			JCheckBox fCheck; 
				
					//Here we create each checkbox and add it to the check box panel
					mCheck = new JCheckBox("M");
					checkBoxPanel.add(mCheck);
					
					tCheck = new JCheckBox("T");
					checkBoxPanel.add(tCheck);
					
					wCheck = new JCheckBox("W");
					checkBoxPanel.add(wCheck);
					
					thCheck = new JCheckBox("TH");
					checkBoxPanel.add(thCheck);
					
					fCheck = new JCheckBox("F");
					checkBoxPanel.add(fCheck);
					
				//Now add the checkBoxPanel to the newCourseP
				newCourseP.add(checkBoxPanel,BorderLayout.CENTER);
				
				//Create the listeners
				//ListenForButton lAddDay = new ListenForButton();
				
				// mCheck.addActionListener(lAddDay);
				// tCheck.addActionListener(lAddDay);
				// wCheck.addActionListener(lAddDay);
				// thCheck.addActionListener(lAddDay);
				// fCheck.addActionListener(lAddDay);
			
				add(newCourseP,BorderLayout.LINE_START);
				// setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
				
			//Time Drop Down Box (JComboBox)
			JPanel comboBoxPanel = new JPanel();
			
			//String[] hours = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"};
			//JComboBox hourCB = new JComboBox(hours);
			//String[] minutes = {{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29",
			
			
			 int totalHours = 23;
			 Integer[] hourOfCourse = new Integer[totalHours];
			 int inc = 1;
			 for(int i=0; i < totalHours; i++){
			 	hourOfCourse[i]= inc;
			 	inc++;
			 }
			
			 JComboBox<Integer> hourBox = new JComboBox<>(hourOfCourse);
			 
			 newCourseP.add(hourBox);
			
			
			
			 int totalMin = 59;
			 Integer[] minOfCourse = new Integer[totalMin];
			 int incr = 1;
			 for(int i=0; i < totalMin; i++){
				minOfCourse[i]= incr;
			 	incr++;
			 }
			
			 JComboBox<Integer> minBox = new JComboBox<>(minOfCourse);
			 
			 newCourseP.add(minBox);
			
			//Add comboBoxPanel to the newCourseP
			// newCourseP.add(comboBoxPanel);
			
			
		this.add(newCourseP); //Adds Course Panel to Frame		
				
		this.setVisible(true);
				
	}
	//Add Course Button Listener
	 private class ListenForButton implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			//double.parseDouble(addCourseBTF.getText());
			
	 		if(e.getSource() == addCourseB){
				
	 			String courseName = addCourseBTF.getSelectedText();
	 			
	 			//textArea1.append(courseName + "\n");
	 			
	 			
	 			//int courseAdded = Courses.getSelectedIndex(addCourseBTF);
	 			//Courses.addItemAt(courseAdded);
	 		}
	 	}
	 }
	// //Course Day Listener
	// private class lAddDay implements ActionListener{
		
	// 	public void actionPerformed(ActionEvent e){
			
	// 		if(e.getSource == mCheck){
	// 			int dayOfCourse = Course.getSelectedIndex(addCourseBTF);
	// 			//Here is where I want to add the Monday class selected to our arrays... but idk how to do that
	// 		if(e.getSource == tCheck){
	// 			int dayOfCourse = Course.getSelectedIndex(addCourseBTF);
	// 			//Same for Tuesday
	// 		if(e.getSource == wCheck){
	// 			int dayOfCourse = Course.getSelectedIndex(addCourseBTF);
	// 			//Same for Wednesday
	// 		if(e.getSource == thCheck){
	// 			int dayOfCourse = Course.getSelectedIndex(addCourseBTF);
	// 			//Thursday
	// 		if(e.getSource == fCheck){
	// 			int dayOfCourse = Course.getSelectedIndex(addCourseBTF);
	// 			//Friday
	// 		}	
	// 		}
	// 		}
	// 		}
	// 		}
	// 	}
	// }
	// //Course Time Listener
	
	
	
}
