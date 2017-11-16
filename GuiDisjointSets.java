package data;



import java.awt.Dimension;

import javax.swing.JFrame;

public class GuiDisjointSets extends JFrame{
	
	
	public GuiDisjointSets () {
		super("Disjoint_Set_Representation");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(720,480));
		
		PanelGuiDisjointSets PGDS= new PanelGuiDisjointSets();
		this.add(PGDS);
		
		this.pack();
		this.setVisible(true);			
	}

	public static void main(String[] args) {
	
	 GuiDisjointSets Test = new GuiDisjointSets();
	}
}
