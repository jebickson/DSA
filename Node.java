// LInked list implementation of stack using JAVA

class Node 
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class StackUsingLinkedList
{
    private Node top;

    //Constructor
    public StackUsingLinkedList()
    {
        this.top = null;       
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void push(int data)
    {
        Node newNode = new Node(data);

        if(top ==null)
        {
            top = newNode;
        }
        else
        {
            newNode.next = top;
            top = newNode;
        }
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            int popped = top.data;
            top = top.next;
            return popped;
        }
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return top.data;
        }
    }
    public void displayStack()
    {
        Node currentNode = top;
        System.out.println("Stack Elements:");
        while(currentNode != null)
        {
            System.out.println(currentNode.data + "");
            currentNode = currentNode.next;
            
        }
    }
}

// Example usage
public class Main{
    public static void main(String[]args)
    {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Displaying the stack
        stack.displayStack();

        // popping an element from the stack
    System.out.println("\n"+stack.pop()+"popped from stack");

    // Displaying the top element
    System.out.println("Top element is:"+stack.peek());
    }
}