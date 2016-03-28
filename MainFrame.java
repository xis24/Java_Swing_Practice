package Java_Swing_Practice;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6958914781276334827L;
	private JTextArea textArea;
	private DetailsPanel detailsPanel;
	
	public MainFrame(String tile){
		super(tile);
		
		
		//set layout manager
		setLayout(new BorderLayout());
		
		//create swing component
		textArea = new JTextArea();
		
		detailsPanel = new DetailsPanel();
		detailsPanel.addDetailListener(new DetailListener(){
			public void detailEventOccurred(DetailEvent event){
				String text = event.getText();
				textArea.append(text);
			}
		});
		
		//add your swing component to content pane
		Container container = getContentPane();
		
		container.add(textArea, BorderLayout.CENTER);
		container.add(detailsPanel, BorderLayout.WEST);
		

	}
}
