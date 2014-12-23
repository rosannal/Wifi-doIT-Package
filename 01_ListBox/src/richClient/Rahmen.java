package richClient;

import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rahmen extends Frame {
	
	// Konstruktor
	public Rahmen(){
		List meineListe = new List();
		
		this.setTitle("Listen-Beispiel");
		this.addWindowListener(new WinListener());
		this.setSize(300, 300);
		this.setVisible(true);
		
		this.add(meineListe);
		meineListe.setMultipleMode(true);
		meineListe.add("A1");
		meineListe.add("A2");
		meineListe.add("A3");
		meineListe.add("A4");
				
	}
}


