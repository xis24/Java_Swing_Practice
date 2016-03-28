package Java_Swing_Practice;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingPractice {

	
	public static void main(String[] args){
		
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				JFrame test = new MainFrame("Login");
				test.setSize(500, 400);
				test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				test.setVisible(true);
			}
		});
	}

	
}
