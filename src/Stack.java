import java.util.NoSuchElementException;

public class Stack <E>{

	
private LinkedList<E> lista;
	
	public Stack() {
		
		lista = new LinkedList<>();
		
	}
	
	public int size() {
		return this.lista.size();
	}
	public boolean isEmpty() {
		
		return this.lista.isEmpty();
	}
	
	public void push(E dato) {
		this.lista.insertarInicio(dato);
	}
	
	public E pop() {
		
		try {
		
		return this.lista.BorrarInicio();
		}catch(NoSuchElementException e) {
			throw new NoSuchElementException("No se peude  hacer POP de una lista vacia");
		}
	}
	
	public void flush() {
		
		this.lista= new LinkedList<>();
		
		System.gc(); //llamada al garbage collector	
		
		
	}
	
	
	//metodo top
	public E Top() throws NoSuchElementException {
		try {
		return this.lista.Inicio();
		}catch(NoSuchElementException e) {
			throw new NoSuchElementException("No se puede hacer un top de una Queue vacia");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Stack <String> pila1=new Stack<>();
		
		String[] nombres = {"hector", "elias", "kevin", "Eutimio","Quirino", "Donovan", "LaFarga" };
		for(String nombre:nombres) {
			pila1.push(nombre);
		}
		while(!pila1.isEmpty()) {
			
			System.out.println(pila1.pop());
	
			
		}

	}



}
