package codeSamples.linkedlist;

public class StudentLinkedList 
{
	Node head;
	private int size;
	
	public void insert(Student st)
	{
		Node node=new Node(st);
		node.setNext(head);
		head=node;
		size++;
	}
	
	public int size()
	{
		return size;
	}

	public boolean isEmpty()
	{
		return head==null;
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
