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

	import java.awt.Button;
	import java.awt.Dimension;
	import java.awt.Toolkit;
	import javax.swing.*;
	
	import java.awt.event.*;
	
	import java.util.Scanner;

	//Extends JFrame so it can create frames
	
public class AddClass extends JFrame{
	
	JButton button1;
	JTextField textField1;
	JTextArea textArea1;
	String newClass= " ";
	
	public static void main (String[] args){
		
		new AddClass(); //Calls constructor file that creates user interface for us
	}
	
	public AddClass(){ //AddClass is the constructor file itself
		
		this.setSize(600,600); //sets the size for the window/frame that appears on the screen (in Java it's a frame, in everything else it's called a window)
		
		Toolkit tk = Toolkit.getDefaultToolkit(); //Tool Kit object that lets you get width and height of the screen
		
		Dimension dim = tk.getScreenSize(); //allows you to store that height and width
		
		int xPos = (dim.width/2) - (this.getWidth()/2); 
		//Allows you to figure out the x position; 
		//upper left hand corner for the frame 
		//(done by taking the dimensions of the frame, 
		//which is the width of the screen divided by two, 
		//and then taking the width of the actual frame or window and dividing it by two)
		//we do the same thing for the y position
		int yPos = (dim.height/2) - (this.getHeight()/2);
		
		this.setLocation(xPos,yPos); //defines what x and y position we are creating for our frame
		
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //everything should close down when the user hits the close button
		
		this.setTitle("Class Addition"); //Title for the frame 
		
		JPanel thePanel = new JPanel(); //Creates a Panel that will be inside the frame... holds all our components
		
		/*Panel
		 * 
		 * The Panel is where we will want to keep all our buttons for class details, including
		 * day (M-F check buttons)
		 * time (Start and end)
		 * place (LSC only for now, but want to expand to include campus options later)... Building options, followed by a manual classroom # input
		 * 
		 */
		
		button1 = new JButton("Add Class"); //creating the button... defining what the button text will be
		
		//Make sure to write an exception that the class cannot be added if there is no title for it and if there is no Day/time picked
		
		ListenForButton addClassButton = new ListenForButton();
		
		button1.addActionListener(addClassButton);
		
		thePanel.add(button1);
		
		//The area where the New Class will be typed
		JTextField textField1 = new JTextField("Type Class Here", 35);
		
		ListenForKeys lForKeys = new ListenForKeys();
		
		textField1.addKeyListener(lForKeys);
		
		thePanel.add(textField1);
		
		//Text Area: Where the classes added will be displayed
		JTextArea textArea1 = new JTextArea(15,20);
		
		textArea1.setText("Classes to Be Added:\n");
		
		textArea1.setLineWrap(true); //Whenever we get to text area end we want it to wrap down to the next line
		
		textArea1.setWrapStyleWord(true); //Don't split words
		
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); //defines scrollbars as needed
		
		thePanel.add(scrollbar1);
		
		this.add(thePanel);
		
		ListenForWindow lForWindow = new ListenForWindow();
		
		this.addWindowListener(lForWindow);
		
		this.setVisible(true);
		
		ListenForMouse lForMouse = new ListenForMouse();
		thePanel.addMouseListener(lForMouse);
		
	}
	
	//Implement Listeners
	
	private class ListenForButton implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			if (e.getSource() == button1){
				
				textField1
				
				textArea1.append("Class Added: " + newClass);
				
				
			}
		}
	}
	
	private class ListenForKeys implements KeyListener{

		
		public void keyPressed(KeyEvent e) {
			textArea1.append("Key Hit: " + e.getKeyChar() + "\n");
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
			
	}
	
	private class ListenForWindow implements WindowListener{

		@Override
		public void windowActivated(WindowEvent e) { //called whenever the window is an active window
			textArea1.append("Window is active");
			
		}

		//this.dispose is called (this.dispose();)
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {//called if window is no longer the active window... maybe clicking on some other window
			textArea1.append("Window is Not active");
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			textArea1.append("Window is in Normal State");
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			textArea1.append("Window is minimized");
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			textArea1.append("Window is Created");
			
		}
		
	}
	
	private class ListenForMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			textArea1.append("Mouse Panel pos: " + e.getX() + " " + e.getY()+"\n");
			textArea1.append("Mouse Screen pos: " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n");
			textArea1.append("Mouse Button: " + e.getButton() + "\n");
			textArea1.append("Mouse Clicks: " + e.getClickCount() + "\n");
		
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
