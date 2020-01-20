//how to delete a node from the end of the linkedlist
package linkedlist;

public class list8 {
    private listnode head;

    public static void main(String[] args) {
        listnode head = new listnode(10);
        listnode second = new listnode(8);
        listnode third = new listnode(1);
        listnode fourth = new listnode(11);
        head.next = second;
        second.next = third;
        third.next = fourth;
        list8 l8 = new list8();
        l8.display(head);
        listnode fivenode = l8.delLast(head);
        System.out.println("after deleting the last node from the linkedlist");
        l8.display(fivenode);
    }

    //this method is used to print the linkedlist
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

    //this method is used to delete a node from the end of the linkedlist
    public listnode delLast(listnode head) {
        listnode last = head;
        listnode preLast = head.next;
        while (preLast.next != null) {
            preLast = preLast.next;
            last = last.next;
        }
        last.next = null;
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
