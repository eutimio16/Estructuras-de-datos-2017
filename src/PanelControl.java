import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public  class PanelControl extends JPanel{
		private JSlider slider;
		private  ReglaRecursiva regla;
		
		public PanelControl(ReglaRecursiva obj) {
			super();
			this.regla=obj;
			
			slider=new JSlider(JSlider.VERTICAL, 1,10,1);
			
			slider.setMajorTickSpacing(2);
			slider.setMinorTickSpacing(1);
			
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			this.add(slider);
			try {
			slider.addChangeListener(
					new ChangeListener() {
						public void stateChanged(ChangeEvent e) {
							regla.setlevel(slider.getValue());
							repaint();
							
						}
					}
			);
			}catch(Exception e) {
				System.out.println(e + "error");
			}
		}
	}