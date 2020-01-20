//how to delete a first node from the linked list
package linkedlist;

public class list7 {
    private listnode head;

    public static void main(String[] args) {
        listnode head = new listnode(10);
        listnode second = new listnode(8);
        listnode third = new listnode(1);
        listnode fourth = new listnode(11);
        head.next = second;
        second.next = third;
        third.next = fourth;
        list7 l7 = new list7();
        l7.display(head);
        listnode fivenode = l7.deletefirst(head);
        System.out.println("after deleting a node from starting");
        l7.display(fivenode);
    }

    //how to print a linked list
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

    //this method is used to delete a first node of the linkedlist
    public listnode deletefirst(listnode head) {
        listnode current = head.next;
        head.next = null;
        head = current;
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
