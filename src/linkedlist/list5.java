//how to insert a new node at any value
package linkedlist;

public class list5 {
    private listnode head;

    public static void main(String[] args) {
        listnode head = new listnode(10);
        listnode second = new listnode(8);
        listnode third = new listnode(1);
        listnode fourth = new listnode(11);
        head.next = second;
        second.next = third;
        third.next = fourth;
        list5 l5 = new list5();
        l5.display(head);
        listnode thirdnode = l5.insert(second, 50);
        System.out.println("after inserting a node");
        l5.display(head);
    }

    //display method is used to print the linkedlist
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

    //this method is used to add a new node at any particular value
    public listnode insert(listnode previous, int data) {
        if (previous == null) {
            System.out.println("previous node cannot be null");
        }
        listnode midnode = new listnode(50);
        midnode.next = previous.next;
        previous.next = midnode;
        return midnode;
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
