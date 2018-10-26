package codeSamples.Stacks;

public class MyStack 
{
	private int stackSize;
	private int[] stackArr;
	private int top;

	public MyStack(int size) 
	{
		this.stackSize = size;
		this.stackArr = new int[stackSize];
		this.top = -1;
	}

	public void push(int entry) throws Exception 
	{
		if(this.isStackFull()){
			throw new Exception("Stack is already full. Can not add element.");
		}
		System.out.println("Adding: "+entry);
		this.stackArr[++top] = entry;
	}

	public int pop() throws Exception 
	{
		if(this.isStackEmpty())
		{
			throw new Exception("Stack is empty. Can not remove element.");
		}
		int entry = this.stackArr[top--];
		System.out.println("Removed entry: "+entry);
		return entry;
	}

	public boolean isStackEmpty() {
		return (top == -1);
	}

	public boolean isStackFull() {
		return (top == stackSize - 1);
	}
}
