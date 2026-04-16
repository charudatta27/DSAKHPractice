

public class StackLinkedList {
    
  
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public StackLinkedList() {
        this.top = null;
    }

    // push
    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    // pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty!!");
            return -1;
        } else {
            int value = top.data;
            top = top.next;
            return value;
        }
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty!!");
            return -1;
        } else {
            return top.data;
        }
    }

    // isEmpty
    public boolean isEmpty() {
        return this.top == null;
    }

    // display
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty !!");
            return;
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " \t ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.display();
        stackLinkedList.push(20);
        stackLinkedList.push(10);
        stackLinkedList.push(30);
        stackLinkedList.push(40);
        stackLinkedList.pop();
        stackLinkedList.push(50);

        stackLinkedList.display();

        System.out.println(stackLinkedList.pop());
        stackLinkedList.display();

        System.out.println(stackLinkedList.peek());
        stackLinkedList.display();


    }
}