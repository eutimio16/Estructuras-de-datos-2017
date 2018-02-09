/***
	 * Eutimio Machuca Parra
	 * Binary Search
	 * A01630244 
	 * 
	 * */
public class BinarySearch {
	
    public static <T extends Comparable <T>> int BinarySearch(T valor, T[] valores){
        int min=0;
        int max=valores.length - 1;
        while (min <= max) {
            int avg = (min + max) / 2;
            
            T ValoresAvg = valores[avg];
            int comp=valor.compareTo(ValoresAvg);
            if(comp < 0) {
                max=avg - 1;
            }
            else if(comp > 0 ) {
                min=avg + 1;
            }
            else {
                return avg;
            }
        }
        return -1;
    }

    public static <T extends Comparable <T>> int BinarySearchRec(T valor, T[] valores){
        return BinarySearchRec(valor, valores, 0, valores.length-1);
    }

    private static <T extends Comparable <T>> int BinarySearchRec(T valor, T[] valores, int start, int end){
        if(valor==null) {
            return -1;
        }
        if(start > end) {
            return -1;
        }
        int avg=(start+end)/2;
        if(valor.compareTo(valores[avg]) > 0) {
            return BinarySearchRec(valor, valores, avg+1, end);
        }
        else if(valor.compareTo(valores[avg]) < 0) {
            return BinarySearchRec(valor, valores, start, avg-1);
        }
        else {
            return avg;
        }
    }

    public static void main(String[] args) {
      
    	String[] a= {"hamaca", "dulce", "playa", "tv", "gdl"};
        String b= "playa";
        
        
       System.out.println(BinarySearch(b,a));  //print position
        System.out.println(BinarySearchRec(b,a));
       System.out.println(BinarySearchRec(b, a, 1 ,4));

    }


}
