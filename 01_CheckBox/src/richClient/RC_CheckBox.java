package richClient;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;

public class RC_CheckBox extends Frame implements MouseListener{
	private Checkbox check1 = new Checkbox("1");
	private Checkbox check2 = new Checkbox("2");
	private Checkbox check3 = new Checkbox("3");
	// Konstruktor
	public RC_CheckBox(){
		this.setLayout(new GridLayout(3, 1));
		this.setSize(150, 150);
		this.add(check1);
		this.add(check2);
		this.add(check3);
		check1.addMouseListener(this);
		this.setVisible(true);

	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		RC_CheckBox.this.setTitle("1");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
