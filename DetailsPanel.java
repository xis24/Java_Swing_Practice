package Java_Swing_Practice;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;

public class DetailsPanel extends JPanel {
	/*
	 * form you can fill up the personal details
	 */
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 645812774319721625L;
	private EventListenerList listenerList = new EventListenerList();
	
	public DetailsPanel(){
		//dimension of panel
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);
		
		setBorder(BorderFactory.createTitledBorder("Log In"));
		
		JLabel userNameLabel = new JLabel("User Name: ");
		JLabel passwdLabel = new JLabel("Password");
		
		final JTextField userNameField = new JTextField(10);
		final JTextField passwdField = new JTextField(10);
		
		JButton addBtn = new JButton("Add");
		
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String userName = userNameField.getText();
				String passwd = passwdField.getText();
				
				String text = userName +": " +  passwd + "\n";
				
				fireDetailEvent(new DetailEvent(this, text));
			}
		});
		
		
		setLayout(new GridBagLayout());
		
		//most flexible one 
		GridBagConstraints gc = new GridBagConstraints();
		
		//first column>>>>>>>
		
		gc.anchor = GridBagConstraints.LINE_END;// aligned to right
		
		gc.weightx = 0.5; // how much space to allocate to the cell
		gc.weighty = 0.5;
		
		gc.gridx = 0;
		gc.gridy = 0; 
		
		add(userNameLabel, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(passwdLabel, gc);
		
		//second column >>>>>>>
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0; 
		add(userNameField, gc);
		
		gc.gridx = 1;
		gc.gridy = 1; 
		add(passwdField, gc);
		
		//Final row
		gc.weighty = 10; //weight of button
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.gridx = 1;
		gc.gridy = 2;
		add(addBtn, gc);
	}//constructor
	
	public void fireDetailEvent(DetailEvent event){
		Object[] listeners = listenerList.getListenerList();
		for(int i = 0; i < listeners.length; i += 2){
			if(listeners[i] == DetailListener.class){
				((DetailListener)listeners[i+1]).detailEventOccurred(event);
			}
		}
	}
	
	public void addDetailListener(DetailListener listener) {
		listenerList.add(DetailListener.class, listener);
	}
	
	//good practice to have remove method
	public void removeDetailListener(DetailListener listener){
		listenerList.remove(DetailListener.class, listener);
	}
}
