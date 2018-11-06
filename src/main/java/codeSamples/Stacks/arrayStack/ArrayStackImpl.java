package codeSamples.Stacks.arrayStack;

public class ArrayStackImpl {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        System.out.println(stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());


    }
}
