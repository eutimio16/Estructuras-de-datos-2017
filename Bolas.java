/*
 * 
 * EMP A01630244
 * Estructura de Datos
 * Tarea ya me hice bolas
 * 119/8/2018
 * */
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Bolas extends JFrame{
	
	
	private int nivel,
				x1=50,
				y1=50,
				largo=600;
	public Bolas() {
		super("Ya me hize bolas");
		this.setSize(720,700);
		this.nivel=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el nivel:","Ya me hice bolas",1));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void paint(Graphics g) {
		super.paint(g);
		this.pintaCirculos(g, x1, y1, largo, nivel);
	}
	public void pintaCirculos(Graphics g , int x1, int y1, int largo, int nivel) {
		if(nivel>=0) {
			int puntoMedio= largo/2;
			g.drawOval(x1, y1, largo, largo);	
			pintaCirculos(g, x1+(puntoMedio), y1+(puntoMedio/2), puntoMedio, nivel-1);
			pintaCirculos(g, x1, y1+(puntoMedio/2), puntoMedio, nivel-1);
		}
	}
	public static void main(String[] args) {
		Bolas test= new Bolas();
	}
}
