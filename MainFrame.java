package Java_Swing_Practice;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	JTextArea textArea;
	public MainFrame(String tile){
		super(tile);
		
		
		//set layout manager
		setLayout(new BorderLayout());
		
		//create swing component
		textArea = new JTextArea();
		JButton button = new JButton("Click me");
		
		//add your swing component to content pane
		Container container = getContentPane();
		
		container.add(textArea, BorderLayout.CENTER);
		container.add(button, BorderLayout.SOUTH);
		
		
		//add behavios 
		button.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.append("Hello World\n");
			}
			
		});
	}
}
