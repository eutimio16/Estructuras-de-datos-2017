package data;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelGuiDisjointSets extends JPanel{
	
	public PanelGuiDisjointSets() {
	super();
	setBackground(Color.BLACK); 
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d =(Graphics2D)g;
		 g2d.drawRect(300, 200, 120, 80);
		
	}

}
