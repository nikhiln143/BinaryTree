import java.util.*;
public class BinaryTreeInts {

	node head = null; 
	public node insertData(node current, int data) { 
		
		if (current == null ) { 
			// System.out.println("new tree!");
			current = new node (data);
		
		}
		
		//current = head; 
		
		if(data > current.data) { 
			System.out.println("going right!\n");
			 current.rightChild = insertData(current.rightChild, data); 
		}
	
		else if (data < current.data) { 
			System.out.println("going left!\n");
			current.leftChild = insertData(current.leftChild, data); 
		}
		
		else if (data == current.data) { // data already exists 
			return current; 
		}
		
		return current; 
		
	}
	
	public void printTree(node current) { 
		 if (current != null) { 
			 printTree(current.leftChild);
			 System.out.println(" " + current.data);
			 printTree(current.rightChild);
		 }
		
	}
	
	public void postOrder(node current) { 
		if(current!= null) { 
			printTree(current.leftChild); 
			printTree(current.rightChild);
			System.out.println(" " + current.data);
			
			
		}
	}
	
	public void preOrder(node current) { 
		if(current!= null) { 
			System.out.println(" " + current.data);
			printTree(current.leftChild); 
			printTree(current.rightChild);
			
			
			
		}
	}
	
	public boolean isEmpty() { 
		return (this.head == null); 
	}
	
	public void add(int d) { 
		head = insertData(head,d); 
	}
	
	
}

class node { 
	int data;
	//node parent;
	node leftChild; 
	node rightChild; 
	
	public node(int d) { // initialize a node that is not connected 
		this.data = d; 
		this.leftChild = null; 
		this.rightChild = null; 
		
	}
	
}