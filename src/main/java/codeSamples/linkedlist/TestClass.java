package codeSamples.linkedlist;
/**
 * 
 * @author saurav
 *
 */
public class TestClass 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(221,"Steve");
		Student s2=new Student(222,"John");
		Student s3=new Student(223,"Mark");
		Student s4=new Student(224,"Elon");
		
		StudentLinkedList list=new StudentLinkedList();
		list.insert(s1);
		list.insert(s2);
		list.insert(s3);
		list.insert(s4);
		list.printList();
		
		System.out.println("Size of list : "+list.size());
		System.out.println(list.isEmpty());
		
		list.remove();
		System.out.println("After removing element");
		list.printList();
	}
}
