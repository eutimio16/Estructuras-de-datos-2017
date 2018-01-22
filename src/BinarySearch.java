
public class BinarySearch {

	public static  int binarySearch(int valor, int valores[]) {
		int min=0,
		max=valores.length-1,
		avg;
		
		while(min<=max) {
			
			avg=(min + max)/2;
			if(valores[avg]==valor) {
				
				return avg;
			}
			else if(valor < valores[avg] ) {
				max=avg-1;
				
			}
			else {
				min=avg+1;
			}
			
		}
		return -1;
		
	}
	
	
	
	
	public static void main(String[] args) {
		int[] nums= {1,12,23,34,45,56,67,89,90,100,111,122,133,144,155};
		
		System.out.println(binarySearch(133, nums));

	}

}
