import java.util.NoSuchElementException;

public class Queue <E> {
	
	private LinkedList<E> lista;
	
	public Queue() {
		
		lista = new LinkedList<>();
		
	}
	
	public int size() {
		return this.lista.size();
	}
	public boolean isEmpty() {
		
		return this.lista.isEmpty();
	}
	
	public void enqueue(E dato) {
		this.lista.insertarInicio(dato);//1
		
		//this.lista.insertarFin(dato);//2
	}
	
	public E dequeue() {
		
		try {
		 return this.lista.BorrarFin();//1
		//return this.lista.BorrarInicio();//2
		}catch(NoSuchElementException e) {
			throw new NoSuchElementException("No se peude  hacer dequeue de una lista vacia");
		}
	}
	
	public void flush() {
		
		this.lista= new LinkedList<>();
		
		System.gc(); //llamada al garbage collector	
		
		
	}
	
	
	//metodo peak
	public E next() throws NoSuchElementException {
		try {
		return this.lista.Inicio();
		}catch(NoSuchElementException e) {
			throw new NoSuchElementException("No se puede hacer un next de una Queue vacia");
			
		}
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		Queue<String> queue=new Queue<>();
		
		String[] nombres = {"hector", "elias", "kevin", "Eutimio","Quirino", "Donovan", "LaFarga" };
		for(String nombre:nombres) {
			queue.enqueue(nombre);
		}
		while(!queue.isEmpty()) {
			
			System.out.println(queue.dequeue());
	
			
		}

	}

}
