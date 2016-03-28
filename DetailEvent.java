package Java_Swing_Practice;

import java.util.EventObject;;

public class DetailEvent extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -306607206622165784L;
	
	private String text;
	public DetailEvent(Object source, String text) {
		super(source);
		this.text = text;
	}
	 
	public String getText(){
		return text;
	}
}
