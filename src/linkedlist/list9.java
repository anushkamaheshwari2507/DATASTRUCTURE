//how to delete a node from any particular position
package linkedlist;

public class list9 {
    private listnode head;

    public static void main(String[] args) {
        listnode head = new listnode(10);
        listnode second = new listnode(8);
        listnode third = new listnode(1);
        listnode fourth = new listnode(11);
        head.next = second;
        second.next = third;
        third.next = fourth;
        list9 l9 = new list9();
        l9.display(head);
        listnode fivenode = l9.delAt(head, 3);
        System.out.println("after deleting a node");
        l9.display(fivenode);
    }

    //display method used to print the linkedlist
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

    //this method is used to delete a node from any particular postion
    public listnode delAt(listnode head, int pos) {
        listnode pre = head;
        int c = 1;
        while (c < pos - 1) {
            pre = pre.next;
            c++;
        }
        listnode temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
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
