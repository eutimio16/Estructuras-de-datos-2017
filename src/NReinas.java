
public class NReinas {
	

	private boolean valido(int[] reinas, int f, int c) {
		//revisar que la columna no este ocupada por otra reina
		
		for(int i=0; i<f; i++) {
			if(reinas[i]==c) {
				return false;
			}
			else if(Math.abs(f-i)== Math.abs(c-reinas[i]) ) {
					return false;
					}
						
		}
		
		return true;
		//caso 2: revisar que no haya otra reina en esa diagonal
		//es una pocision valida;
		
	}
	
	private void imprimeTablero(int[] reinas) {
		for(int i=0; i<reinas.length; i++) {
			
			System.out.print(reinas[i]);
			System.out.print(reinas[i]+ ",");
		}
		System.out.println();
	}
	
	
	//n= tamaño del arreglo, del tablero de ajedrez
	// reinas arreglo de reinas
	public void nReinas(int n, int [] reinas) {
		for(int i=0; i<reinas.length;i++) {
			if(this.valido(reinas, n, i)) {
				reinas[n]=i;
				
				if(n==reinas.length-1) {
					
					imprimeTablero(reinas);
				}
				else {
					this.nReinas(n+1, reinas);
				}
			}
			
			
		}
	}
	
	
	public static void main(String[] args) {
		
	NReinas nr= new NReinas();
	int[] reinas= {-1,-1,-1,-1};
	nr.nReinas(0, reinas);
	
	}

}
