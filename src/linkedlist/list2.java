//how to calculate the length of the linkedlist
package linkedlist;

public class list2 {
    private listnode head;

    public static void main(String[] args) {
        listnode head = new listnode(10);
        listnode second = new listnode(8);
        listnode third = new listnode(1);
        listnode fourth = new listnode(11);
        head.next = second;
        second.next = third;
        third.next = fourth;
        list2 l1 = new list2();
        l1.display(head);
        int c = l1.length(head);
        System.out.println("length of linkedlist is" + "  " + c);
    }

    //display method to print linkedlist
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

    //length method to calculate the length of linkedlist
    public int length(listnode head) {
        int count = 0;
        if (head == null) {
            return count;
        }
        listnode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
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
