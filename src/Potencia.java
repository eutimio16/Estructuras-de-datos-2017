import javax.swing.JOptionPane;
//Eutimio Machuca Parra A01630244
//Tarea Potencia recursiva
public class Potencia {

	public static double potencia(int base, int exponente) {
		if(exponente == 0){
			return 1;
		}else {
			
			return ( base * potencia(base, exponente-1));
		}
	}
	
	public static void main(String[] args) {
	
		boolean Bkey = true;

	
		while(Bkey == true) {
			
		int base = Integer.parseInt((JOptionPane.showInputDialog("dame la base ")));
		int exponente = Integer.parseInt((JOptionPane.showInputDialog("dame el exponente")));
		System.out.println(potencia(base,exponente));

		Bkey= Boolean.valueOf(JOptionPane.showInputDialog("desea hacer otra operacion?true/no"));

		 }
	 
	}

}