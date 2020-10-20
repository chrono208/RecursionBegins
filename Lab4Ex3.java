import support.LLNode;

public class Lab4Ex3 {
	
    //Declare a global list of LLNodes.
    public static LLNode<Integer> head = null;
    public static LLNode<Integer> node1 = new LLNode<>(3);
    public static LLNode<Integer> node2 = new LLNode<>(6);
    public static LLNode<Integer> node3 = new LLNode<>(6);
    public static LLNode<Integer> node4 = new LLNode<>(9);
    public static LLNode<Integer> node5 = new LLNode<>(12);
    public static LLNode<Integer> node6 = new LLNode<>(15);
    public static LLNode<Integer> node7 = new LLNode<>(18);
    public static LLNode<Integer> node8 = new LLNode<>(19);
    public static LLNode<Integer> node9 = new LLNode<>(19);
    public static LLNode<Integer> node10 = new LLNode<>(20);
    
	//Even Number Core.
	public static void numEvens(LLNode<Integer> list) 
	{	
		//Declare Control Variable.
		int num1 = 0;
	   
		//Base Case.
		if (list != null) 
		{
			num1 = list.getInfo();
			
			//Find evens and print to screen using modulus.
			if (num1 % 2 == 0) 
			{
				System.out.println(list.getInfo());
			}
	   
			//General Case.
			numEvens(list.getLink());
		}//If. 
	}//Evens Method.
	   
	public static void main(String[] args) 
	{
	      //Link all the nodes.
	      node1.setLink(node2);
	      node2.setLink(node3);
	      node3.setLink(node4);
	      node4.setLink(node5);
	      node5.setLink(node6);
	      node6.setLink(node7);
	      node7.setLink(node8);
	      node8.setLink(node9);
	      node9.setLink(node10);
	      head = node1;
	      
	      //Trash the useless nodes.
	      node1 = node2 = node3 = node4 = node5 = node6 = node7 = node8 = node9 = node10 = null;
	         
	      //Prepare iterative printing.
	      LLNode<Integer> currNode = head;
	      
	      //Print!
	      while(currNode != null) {
	         System.out.println("Node data is: " + currNode.getInfo() );
	         currNode = currNode.getLink();
	      }//While.
	      
	      System.out.println("The following are all the evens in the linked list.");
	      numEvens(head);
	}//Main.
}//Class.