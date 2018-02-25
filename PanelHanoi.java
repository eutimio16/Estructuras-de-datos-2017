import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelHanoi  extends JPanel implements MouseListener{

	public PanelHanoi() {
		super();
		this.setPreferredSize(new Dimension(1200,900));
		this.addMouseListener(this);
	}

	public void paintComponent(Graphics g) {
			super.paintComponent(g);
			DibujaTorresVacias(g);		
	}
	
	public void DibujaTorresVacias(Graphics g) {
			int x=getWidth()/2;
			int y=getHeight()/2;
			int ancho=100;
			int largo=200;
			g.setColor(Color.BLUE);
			g.fillRect(x-250, y, ancho, largo);
			g.setColor(Color.BLACK);
			g.drawString("A", x-200, y);
			g.setColor(Color.RED);
			g.fillRect(x+50, y, ancho, largo);
			g.setColor(Color.BLACK);
			g.drawString("B", x+100, y);
			g.setColor(Color.GREEN);
			g.fillRect(x+350, y, ancho, largo);
			g.setColor(Color.BLACK);
			g.drawString("C", x+400, y);
			g.setColor(Color.darkGray);
			Font myFont = new Font ("Courier New", 1, 37);
			g.setFont(myFont);	
			g.drawString("Towers of hanoi", x-200,y-300 );	
		}	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
	public static void main(String[] args) {
		JFrame ventana= new JFrame("Towers of hanoi");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanelHanoi ph= new PanelHanoi();
		ventana.add(ph);
		ventana.pack();
		ventana.setVisible(true);		
		ventana.setLocationRelativeTo(null);
		ImageIcon img= new ImageIcon("HanoiIcon.png");
		ventana.setIconImage(img.getImage());
	}
}
