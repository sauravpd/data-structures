package codeSamples.linkedlist;

public class StudentLinkedList 
{
	Node head;
	
	
	public void insert(Student st)
	{
		Node node=new Node(st);
		node.setNext(head);
		head=node;
	}
	
	public void printList()
	{
		Node node=head;
		while(node!=null)
		{
			System.out.print(node+"-> ");
			node=node.getNext();
		}
		System.out.println("null");
	}
}
