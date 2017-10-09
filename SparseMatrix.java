


public class SparseMatrix<T> {

	private Node firstNode;
	private int numberOfEntries;
	
	public SparseMatrix(){
		//this.firstNode = new Node(null, 0, 0);
		this.numberOfEntries = 0;
	}
	
	public Node getFirsNode(){
		return this.firstNode;
	}
	
	
	public void add(int[] data, int x, int y){
		Node newNode = new Node(data, x, y);
		newNode.setNext(firstNode);
		firstNode = newNode;
		numberOfEntries++;
	}
	
	
	public void display(){
		Node theNode = firstNode;
		while(theNode != null){
			theNode.displayNodeValue();
			theNode = theNode.getNext();
		}
	}
	
	public void removeSparseData(int val1, int val2, int val3){
		Node theNode = firstNode;
		while((int)theNode.getNext().getData()[0] == val1 && (int)theNode.getNext().getData()[0] == val2 && (int)theNode.getNext().getData()[0] == val3){
			theNode.setNext(theNode.getNext().getNext());
			this.numberOfEntries--;
		}
	}
	
	public void removeSparseData2(int val1, int val2, int val3){
		Node theNode = firstNode;
		int tmp = this.numberOfEntries;
		for(int i = 0; i < tmp; i++){
			if((int)theNode.getNext().getData()[0] + (int)theNode.getNext().getData()[0] + (int)theNode.getNext().getData()[0] == 0){
				theNode.setNext(theNode.getNext().getNext());
				this.numberOfEntries--;
			}
		}
	}
	
	public int getLenght(){
		return numberOfEntries;
	}
	
	public boolean isEmpty(){
		return numberOfEntries == 0;
	}
	
	
	public static void main(String[] args){
		SparseMatrix matrix = new SparseMatrix();
		
		int[] Data = {0,0,0};
		matrix.add(Data, 1, 1);
		matrix.add(Data, 1, 1);
		matrix.add(Data, 1, 1);
		
		int[] Data2 = {1,0,0};
		matrix.add(Data2, 1, 1);
		matrix.add(Data2, 1, 1);
		matrix.add(Data2, 1, 1);
		matrix.add(Data2, 1, 1);
		
		matrix.add(Data, 1, 1);
		matrix.add(Data, 1, 1);
		matrix.add(Data, 1, 1);
		
		matrix.add(Data2, 1, 1);
		matrix.add(Data2, 1, 1);
		matrix.add(Data2, 1, 1);
		
		matrix.display();
		
		System.out.println("Is empty: " + matrix.isEmpty());
		System.out.println("Length: " + matrix.getLenght());
		
		System.out.println("–––––––––––––Sparse Matrix––––––––––––");
		
		matrix.removeSparseData2(0,0,0);
		matrix.display();
		
		System.out.println("Is empty: " + matrix.isEmpty());
		System.out.println("Length: " + matrix.getLenght());
	}
	
}
