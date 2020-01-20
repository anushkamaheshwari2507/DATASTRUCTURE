//how to insert a node at the last of the linkedlist
package linkedlist;

public class list4 {
    private listnode head;

    public static void main(String[] args) {
        listnode head = new listnode(10);
        listnode second = new listnode(8);
        listnode third = new listnode(1);
        listnode fourth = new listnode(11);
        head.next = second;
        second.next = third;
        third.next = fourth;
        list4 l4 = new list4();
        l4.display(head);
        listnode secondnode = l4.insertAtLast(head, 28);
        System.out.println("after inserting a node");
        l4.display(secondnode);
    }

    //display method to represent the liknkedlist
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

    //this method is used to insert a node at the last of the linkedlist
    public listnode insertAtLast(listnode head, int data) {
        listnode lastnode = new listnode(28);
        if (head == null) {
            return lastnode;
        }
        listnode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = lastnode;
        lastnode.next = null;
        return head;
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
