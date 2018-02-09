/***
	 * Eutimio Machuca Parra
	 * Binary Search
	 * A01630244 
	 * 
	 * */
public class BubbleSort{

    @SuppressWarnings("unused")
    
	private static <T extends Comparable <T>> void BubbleSort(T[] valores){
        for (int i =valores.length-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                if (valores[j].compareTo(valores[j + 1]) > 0) {
                    swap(valores, j, j+1);
                }
            }
        }
    }

    public static <T> void swap(T[] valores, int i, int j){
        T tmp = valores[j];
        valores[j] = valores[i];
        valores[i] = tmp;
    }
	public static <T> void imprimeArreglo(T[] arreglo) {
		
		for(T a: arreglo) {
			System.out.println(a + ", ");
		}
		System.out.println();
	}

    public static void main(String[] args) {
        
    }
}
