package codeSamples.Stacks.listStack;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedStack 
 * @author saurav
 *
 */
public class LinkedStack 
{
    private LinkedList<Employee> stack;

    public LinkedStack() 
    {
        stack = new LinkedList<Employee>();
    }

    /**
     * push
     * @param employee
     */
    public void push(Employee employee) 
    {
        stack.push(employee);
    }

    /**
     * pop
     * @return
     */
    public Employee pop() 
    {
        return stack.pop();
    }

    /**
     * peek
     * @return
     */
    public Employee peek() 
    {
        return stack.peek();
    }

    /**
     * isEmpty
     * @return
     */
    public boolean isEmpty() 
    {
        return stack.isEmpty();
    }

    /**
     * printStack
     */
    public void printStack() 
    {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
