/*
 * Eutimio Machuca Parra
 * A01630244
 * Regla recursiva 
 * */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ReglaRecursiva extends JPanel{
	private int level;
	
	public ReglaRecursiva() {
		super(); 
		this.setlevel(1);
		this.setPreferredSize(new Dimension(720,480));
		
	}
	
	public  void setlevel(int level) {
		this.level=level;
	}

	
	
	private Point m(Point a, Point b) {
		return new Point((a.x+b.x)/2, (a.y+b.y)/2);
	}
	

	
	public void DibujaRegla(Graphics g, int level, Point min, Point max) {
		int y = 200;
		if(level>0) {
			Point pm =m(min,max);
			g.drawLine(pm.x,y,pm.x, y=y-(10*level));
			DibujaRegla(g, level-1, min, pm);
			DibujaRegla(g, level-1, pm, max);
			repaint();
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(150,200, getWidth()-150, 200); 
		DibujaRegla(g, this.level, new Point(150,200), new Point(getWidth()-150,200));	
	}
	
	public static void main(String[] args) {
		JFrame ventana=new JFrame("Regla recursiva- Eutimio Machuca Parra - A01630244- gpo 1");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ReglaRecursiva obj=new ReglaRecursiva();
		ventana.add(obj);
		ventana.add(new PanelControl(obj),BorderLayout.WEST);
		ventana.pack();
		ventana.setVisible(true);		
	}
} 
