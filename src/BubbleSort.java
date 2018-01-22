
public class BubbleSort {

	
	public static void bubbleSort(int[] valores) {
		
		for(int i=0; i < valores.length-1 ; i++) {
			
			for(int j=0; j < valores.length-1-i ;j++) {
				if(valores[j]> valores[j+1]) {
					swap(valores, j, j+1);
				}
			}
			
		}
		
	}
	
	
	
	public static void swap(int [] valores, int i, int j) {
		
		int tmp=valores[i];
		valores[i]=valores[j];
		valores[j]= tmp;
	}
	
	
	public static void imprimeArreglo(int[] arreglo) {
		
		for(int a: arreglo) {
			System.out.println(a + ", ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		int[] nums = {9,8,7,6,5,4,3,2,1};
		bubbleSort(nums);
		imprimeArreglo(nums);
		
	}

}
