package codeSamples.stack;

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

	public boolean isStackEmpty() {
		return (top == -1);
	}

	public boolean isStackFull() {
		return (top == stackSize - 1);
	}
}
