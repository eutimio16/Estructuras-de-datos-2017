
public class Node<T> {
		
		public Node next;
		public int[] data;
		public int x;
		public int y;
		
		
		public Node(int[] data, int x, int y){
			this.data = data;
			this.next = null;
			this.x = x;
			this.y = y;
		}
		
		public void displayNodeValue(){
			System.out.println(data[0] + ", " + data[1] + ", " + data[2]);
		}
		
		public int[] getData(){
			return this.data;
		}
		
		public int getX(){
			return this.x;
		}
		
		public int getY(){
			return this.y;
		}
		
		public Node getNext(){
			return this.next;
		}
		
		public void setNext(Node next){
			this.next = next;
		}
	}
