import java.io.IOException;
import java.util.NoSuchElementException;

public class LinkedList <E> {
	
	
	private Nodo<E> inicio,
					fin;
	
	private int size;
	
	public LinkedList() {
		this.size=0;
		this.inicio=this.fin=null;
				
	}
	
	public LinkedList(E[] datos) {
		for(int i=0; i<datos.length; i++) {
			this.insertarFin(datos[i]);
			
		}
	}
	
	
	
	
	
	
	

	public E Inicio() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("lista vacia");
		}
		return this.inicio.getDato();
		
	}
	
	public E Fin() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("lista vacia");
		}		
		return this.fin.getDato();
		
	}
	
	
	public int size() {
		
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size==0;
		
	}
	
	public void insertarInicio(E dato) {
		
		
		Nodo<E> a= new Nodo<E>(dato, this.inicio);
		this.inicio=a;
		
		if(this.size==0) {
			this.fin=a;
		}
		this.size++;
		
	}
	
	

	public void insertarFin(E dato) {
		
		if(this.size==0) {
			this.insertarInicio(dato);
		}else {
			Nodo<E> a= new Nodo<E>(dato);
			this.fin.setNext(a);
			this.fin=a;
			this.size++;
			
		}
		
		
	}
	

	public void insertarEn(int pos, E dato) {
		
		if(size < pos) {
			throw new IndexOutOfBoundsException("pocision no encontrada");
			
		}
		else if(size== 0) {
			this.insertarInicio(dato);
		}
		else if(size==pos) {
			this.insertarFin(dato);
		}
		else {
			
			
			Nodo<E> a= inicio;
			int tmp =0;
			a=this.inicio;
			while(tmp< pos-1) {
				tmp++;
				a=a.getNext();
				
				
			}
			Nodo<E> NewNodo= new Nodo(dato, a.getNext());
			a.setNext(NewNodo);
			this.size++;
			
		
			
			
		}
		
		
		
	}
	
	
	public E BorrarInicio() {
		try {
		E tmp = this.Inicio();
		this.inicio=this.inicio.getNext();
		this.size--;
		
		
		if(this.size==0) {
			this.fin=null;			
		}
		return tmp;
		}catch(NullPointerException e) {
			
			throw new NoSuchElementException(" no se puede borrar el inicio de una lista vacia xq esta vacia lol");
		}
		
		}
			
	public E BorrarFin() throws NoSuchElementException{
		try {
			if(this.size==1) {
		
				return this.BorrarInicio();
		}else {
		E tmp= this.Fin();
		Nodo<E> current =this.inicio;
		for(int i=0; i<this.size-2;i++) {
			current = current.getNext();
		}
		current.setNext(null);
		this.fin=current;
		this.size--;
		return tmp;
		}
		}
		catch(NullPointerException e) {
			throw new NoSuchElementException("No se peude borrar el fin de una lista vacia");
		}
	
	}
	
	public void setAt(int pos, E dato) {
		
		if(pos >=0 && pos < this.size) {
			
			Nodo<E> current = this.inicio;
			
			for(int i=0; i<pos; i++) {
				current= current.getNext();
			}
			
			current.setDato(dato);
			
		}else {
			throw new IllegalArgumentException(" la pocision "+pos+" de una list ano existe");
		}
		
	}
	public String toString() {
		Nodo<E>  current= this.inicio;
		String resultado= "";
		for(int i=0; i<this.size;i++) {
			
			if(i==this.size-1) {
				resultado+= current;
				System.out.print("");
			
						
			}else {
				
				resultado+= current+ ", ";
				current=current.getNext();	
				
			}
			
		}
		return resultado;
	}
	

	public E BorrarEn(int pos) {
		try {
			
			E dato =null;
			Nodo<E> anterior = this.inicio;			
			if(pos ==0) {
				
				return this.BorrarInicio();
				
				
			}
			else if(pos==this.size-1) {
				return this.BorrarFin();				
			}
			else {
				for(int i=0; i<pos-1; i++) {
					
					anterior =anterior.getNext();
				}
				dato= anterior.getNext().getDato();
				anterior.setNext(anterior.getNext().getNext());
				this.size--;
				return dato;
			}
			
			
		}catch(NullPointerException e) {
			throw new IndexOutOfBoundsException("elemento  fuera de rango");
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
	
		LinkedList<String> lista = new LinkedList<>();
		lista.insertarInicio("hola");
		lista.insertarInicio("como");
		lista.insertarInicio("estas");
		lista.insertarFin("salu2");
		System.out.println(lista.toString());
		
		String[] elementos = {"1", "jeje", "esta es ", "la segunda ", "lista"};
		
		LinkedList<String> ListaDos = new LinkedList<>(elementos);
		System.out.println(ListaDos.toString());
		
	}
	
	


}



//Nodo Class
 class  Nodo<E>{
	
	private E Dato;
	
	private Nodo<E> next;
	//hace referencia al mismo tipo de dato que la clase
	
	public Nodo(E Dato, Nodo<E> next) {
		this.Dato=Dato;
		this.next=next;
	}
	public Nodo(E Dato) {
		this(Dato,null);
	}
	public E getDato() {
		return Dato;
	}
	public void setDato(E dato) {
		Dato = dato;
	}
	public Nodo<E> getNext() {
		return next;
	}
	public void setNext(Nodo<E> next) {
		this.next = next;
	}
	public String toString() {
		
		return this.Dato.toString();
	}
	
	

 }