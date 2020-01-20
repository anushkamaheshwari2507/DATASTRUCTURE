//how to insert a node in the starting of a linked list
package linkedlist;

public class list3 {
    private listnode head;

    public static void main(String[] args) {
        listnode head = new listnode(10);
        listnode second = new listnode(8);
        listnode third = new listnode(1);
        listnode fourth = new listnode(11);
        head.next = second;
        second.next = third;
        third.next = fourth;
        list3 l3 = new list3();
        l3.display(head);
        listnode firstnode = l3.insertAtBeg(head, 21);
        System.out.println("after inserting a new node");
        l3.display(firstnode);
    }

    //display method to represent the linkedlist
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

    //this method is udes to insert a node at the beggining of the linkedlist
    public listnode insertAtBeg(listnode head, int data) {
        listnode newnode = new listnode(21);
        if (head == null) {
            return newnode;
        }
        newnode.next = head;
        head = newnode;
        return newnode;
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
