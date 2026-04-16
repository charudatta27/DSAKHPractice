import java.util.Scanner;

class Singlyll {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Add First
    void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted at beginning");
    }

    // Delete Last
    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            System.out.println("Last node deleted");
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        System.out.println("Last node deleted");
    }

    // Delete At Position
    void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (pos == 1) {
            head = head.next;
            System.out.println("Deleted at position " + pos);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            if (temp.next == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid position");
            return;
        }

        temp.next = temp.next.next;
        System.out.println("Deleted at position " + pos);
    }

    // Display
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");

        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method with switch case
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add First");
            System.out.println("2. Delete Last");
            System.out.println("3. Delete At Position");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    list.addFirst(val);
                    list.display();   // show updated list
                    break;

                case 2:
                    list.deleteLast();
                    list.display();
                    break;

                case 3:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    list.deleteAtPosition(pos);
                    list.display();
                    break;

                case 4:
                    list.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}