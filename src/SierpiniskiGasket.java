import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SierpiniskiGasket extends JFrame {
	private int level;
	
	public SierpiniskiGasket() {
	super("FRactal SierpinskiGasket");
	this.setSize(640,480);
	this.level=Integer.parseInt(JOptionPane.showInputDialog("Introduce el nivel del fractal"));
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setVisible(true);
	
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Point a=new Point(20, 380);
		Point b=new Point(620, 380);
		Point c=new Point(320, 50);
	
			this.pintaTriangulos(g, level, a,b,c);
	}
	
	private void pintaTriangulos(Graphics g, int n, Point a, Point b, Point c) {
		
		if(n==0) {
			this.pintaLineas(g, a, b);
			this.pintaLineas(g, b, c);
			this.pintaLineas(g, c, a);
			
		}
		else {
			Point pmAB=this.PuntoMedio(a, b),
				   pmBC=this.PuntoMedio(b, c),
				   pmCA= this.PuntoMedio(c, a);
			this.pintaTriangulos(g, n-1, a, pmAB, pmCA);
			this.pintaTriangulos(g, n-1, pmAB, b, pmBC);
			this.pintaTriangulos(g, n-1, pmCA, pmBC, c);
			
		}
		
	}
	
	private void pintaLineas(Graphics g, Point a, Point b) {
		
		g.drawLine(a.x, a.y, b.x, b.y);
	}
	
	private Point PuntoMedio(Point a, Point b) {
		return new Point((a.x+b.x)/2,(a.y+b.y)/2);
	}
	
	public static void main(String[] args) {
		SierpiniskiGasket demo = new SierpiniskiGasket();
		
	}
}
