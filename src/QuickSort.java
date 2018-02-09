
/*
 * Eutimio machuca parra
 * A01630244
 * QuickSort
 */
public class QuickSort {
	
		
	
		public static void quicksort(int[] arreglo) {
			quicksort(arreglo,0, arreglo.length-1);
			
		}
		
		public static void quicksort(int[] arreglo, int min, int max) {
			if(min < max ) {
				int posPivote=particionar(arreglo, min, max);
			
				quicksort(arreglo, min, posPivote-1);
				quicksort(arreglo, posPivote+1, max);
			}
			
		}
		
		public static   int particionar( int[] arreglo, int min, int max) {				
				
			int piv = arreglo[max];
			 int smallindex= min-1;
	
			 //swap(arreglo, min,(min+max)/2);
			 

			 
			 for(int index = min; index < max; index++) {
				 if(arreglo[index]<=piv) {
					 
					 smallindex++;
					 
					 int tmp=arreglo[smallindex];
					 arreglo[smallindex]=arreglo[index];					 
					 arreglo[index]= arreglo[smallindex];
					arreglo[index]=tmp;
					// swap(arreglo, smallindex, index);
					 
				 }
			 }
				 //swap(arreglo,smallindex+1,max);
				 int tmp= arreglo[smallindex+1];
				 arreglo[smallindex+1]=arreglo[max];
				 arreglo[max]=tmp;
			
			 return smallindex+1;
		
		}
		
		/*public static void swap(int[] arreglo, int origen, int destino) {
			int tmp=arreglo[origen];
			arreglo[origen]=arreglo[destino];
			arreglo[destino]=tmp;
			
		}*/
		
		
		
		
		
	public static void main(String[] args) {
		
		int[] a= {12,9,8,7,6,5,4,3,2,1};
		for(int i = 0 ; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		quicksort(a);
		
		System.out.println();
		System.out.println("sorted Array:");
		System.out.println();
		for(int i = 0 ; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("done.");
		
	}

}