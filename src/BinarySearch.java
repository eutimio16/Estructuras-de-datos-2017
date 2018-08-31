/***
	 * Eutimio Machuca Parra
	 * Binary Search
	 * A01630244 
	 * 
	 * */
public class BinarySearchRec{
    public static <E extends Comparable <E>> int BinarySearchRec(E valor, E[] valores){
        return BinarySearchRec(valor, valores, 0, valores.length-1);
    }
    private static <E extends Comparable <E>> int BinarySearchRec(E valor, E[] valores, int min, int max){
    	
    	if(min > max) {
     	   
            return -1;
        }
    	
    	else if(valores[min]==valor) {
    			return 1;
    	}
    	
    	else if(valores[max]==valor) {
    		return valores.length-1;
    	}
       
        int avg=(min+max)/2;
        
        if(valor.compareTo(valores[avg])==0) {
			return avg;
		}
        
        if(valor.compareTo(valores[avg]) > 0) {
            return BinarySearchRec(valor, valores, avg+1, max);
        }
        
        else if(valor.compareTo(valores[avg]) < 0) {
            return BinarySearchRec(valor, valores, min, avg-1);
        }
        else {
            return avg;
        }
    }
    
    public static void main(String[] args) {
    	String[] Arreglo= {"uno", "dos", "tres", "cero", "cuatro"};
        String n="cuatro";
        System.out.println(BinarySearchRec(n, Arreglo));
    }
}
