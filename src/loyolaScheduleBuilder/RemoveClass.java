/* Remove Class
	Similar to Add class
	
		BASIC_STRUCTURE
			- Combo box that displays current classes
			- Returns location of box selected
			- The main class will then clear the time slot label
			
*/
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
public class removeClass extends JFrame{

	JButton button1;
	JTextField textField1;
	JTextArea textArea1;
	
	public static void main(String[] args){
		
		new removeClass();
	}
	
	public removeClass(){
		
		this.setSize(500,500);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		this.setVisible(true);
		
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		
		this.setLocation(xPos, yPos);
		
		
		this.setResizable(false); 
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("Remove Class");
		
		JPanel thePanel = new JPanel();
		
		JLabel label1 = new JLabel("Remove Class"); //Labels
		
		thePanel.add(label1);
		
		button1 = new JButton("Remove"); //Buttons
		
		thePanel.add(button1);
		
		textField1 = new JTextField("Type Here", 15);
		
		thePanel.add(textField1);
		
		textArea1 = new JTextArea(15,20);
		
		textArea1.setText("");
		
		thePanel.add(textArea1);
		
		ListenForKeys lisForK = new ListenForKeys(); 
		
		ListenForButton lisForB = new ListenForButton(); 
		
		button1.addActionListener(lisForB);
		
		this.add(thePanel);

		this.setVisible(true);
		

	}
	private class ListenForButton implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == button1){
				
				textArea1.append("Classes Removed");
			}
				
				
		}
		
	}
	  private class ListenForKeys implements KeyListener{

		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		  
	  }
	
