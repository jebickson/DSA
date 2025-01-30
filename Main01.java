//Array implementation of stacks 01
class Main{
    private static final int MAX_SIZE = 5; // Maximum size of the stack
    private int top; // Index of the top element
    private int[] stackArray; //Array to store stack elements

    // Constructor to initialise the stack

    public Main() {
        stackArray = new int[MAX_SIZE]; //Create an array of fixed size
        top = -1;//Initialize top to -1, indication the stack is empty
    }
    // Method to check if the stack is empty

    public boolean isEmpty() {
        return top == -1;

    }
    //Method to push an element onto the stack
    public void push(int value)
    {
        if(top == MAX_SIZE - 1)
        {
            System.out.println("Stack Overflow: Cannot push"+value+",Stack is full.");
        }
        else
        {
            stackArray[++top]=value; // Increment top and add the element
            System.out.println("Pushed:"+value);
        }
    }
    // Method to pop an element from the stack
    public void pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");

        } 
        else
        {
            System.out.println("Popped:"+ stackArray[top--]); // Retrieve and decrement top

        }
    }
    //Method to get the top element without removing it
    public int  peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty.");
            return -1;
        } 
        else
        {
            return stackArray[top]; // Return the top element
        }
    }
        public static void main(String[]args)
        {
            Main myStack = new Main(); // Create a stack object

            //Perform stack operations
            myStack.push(10);// push 10 onto the stack
            myStack.push(20);// push 20 onto the stack
            myStack.push(30);// push 30 onto the stack
            myStack.push(40);// push 40 onto the stack
            myStack.push(50);// push 50 onto the stack
            myStack.push(60);//Attempt to push 60 onto the full stack

            System.out.println("Top element:"+myStack.peek());//Display the top element
            myStack.pop();// pop the top element
            myStack.pop();// pop another element

            System.out.println("Top element after popping:"+myStack.peek());//Display the top element again
            
            myStack.pop();// Pop anothe element
            myStack.pop();// Pop anothe element
            myStack.pop();// Pop anothe element
            myStack.pop();// Attempt to pop from an empty statck

        }
    }
