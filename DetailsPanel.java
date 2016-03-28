package Java_Swing_Practice;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DetailsPanel extends JPanel {
	public DetailsPanel(){
		//dimension of panel
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);
		
		setBorder(BorderFactory.createTitledBorder("Personal Detials"));
		
		JLabel nameLabel = new JLabel("Name: ");
		JLabel occupationLabel = new JLabel("Occupations");
		
		JTextField nameFiled = new JTextField(10);
		JTextField occupationField = new JTextField(10);
		
		JButton addBtn = new JButton("Add");
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
	}
}
