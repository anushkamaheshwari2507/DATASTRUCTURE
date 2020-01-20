//how to add a new node at any particular value of a linkedlist
package linkedlist;

public class list6 {
    private listnode head;

    public static void main(String[] args) {
        listnode head = new listnode(10);
        listnode second = new listnode(8);
        listnode third = new listnode(1);
        listnode fourth = new listnode(11);
        head.next = second;
        second.next = third;
        third.next = fourth;
        list6 l6 = new list6();
        l6.display(head);
        listnode forthnode = l6.insertAnywhere(head, 32, 4);
        System.out.println("after inserting a node");
        l6.display(head);
    }

    //display method is used to print a linkedlist
    public void display(listnode head) {
        if (head == null) {
            return;
        }
        listnode current = head;
        while (current != null) {
            System.out.print(current.data + "----->");
            current = current.next;
        }
        System.out.println(current);
    }

    //this method is udes to add a new node at any partcular position of the liknedlist
    public listnode insertAnywhere(listnode head, int data, int pos) {
        listnode node = new listnode(32);
        listnode previous = head;
        int count = 1;
        while (count < pos - 1) {
            previous = previous.next;
            count++;
        }
        listnode current = previous.next;
        node.next = current;
        previous.next = node;
        return node;
    }

    //node class
    private static class listnode {
        private int data;
        private listnode next;

        public listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
