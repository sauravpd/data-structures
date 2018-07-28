package codeSamples.linkedlist;

public class Node 
{
	Node next;
	Student student;
	public Node(Student student) 
	{
		this.student=student;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String toString()
	{
		return "["+student.getRollNo()+"|"+student.getName()+"]";
	}

}
