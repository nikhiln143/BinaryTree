
public class BinaryTree2 {
	
	// second implementation of binary tree 
	
	// head of the tree 
	node root; 
	
	public BinaryTree2() {
		this.root = null; 
	}
	
	private int addElement(node org, int data) { 
		if (org == null) { 
			org = new node(data); 
			return 1; 
		}
		else if(data < org.data) { 
			addElement(org.leftChild, data);
		}
		else if (data > org.data) {
			addElement(org.rightChild, data); 
		}
		return -1; 
		
	}
	
	public void add(int data) { 
		int x = this.addElement(this.root, data);
		if(x == 1) {
			System.out.println("The number " + data + " has been added succesfully!");
		}
		else {
			System.out.println("The number has not been added succesfully!");
		}
	}
	
	public void printTree(){ 
		
		
	}
	
	
	
	
	
class node{ 
	node rightChild;
	node leftChild; 
	int data;
	
	public node(int d) { 
		this.data= d; 
		rightChild = null;
		leftChild = null; 
	}
	
}
	
	
	

}