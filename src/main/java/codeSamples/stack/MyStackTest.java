package codeSamples.stack;

public class MyStackTest 
{
	public static void main(String[] args) {
		MyStack stack = new MyStack(5);
		try 
		{
			stack.push(10);
			stack.push(15);
			stack.push(20);
			stack.push(25);
			stack.push(30);
			stack.push(35);
			stack.push(40);
			stack.pop();
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
