package learn.algorithm;


import java.util.LinkedList;

public class LinkedListDemo {
    private static class Node{
        int item;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }

    public static void circleLink(Node node, int count, Node headNode) {
        if(count == 1){
           node.next = headNode;
           return;
        }
        node.next = new Node(0);
        circleLink(node.next, --count, headNode);
    }

    public static void init(Node node) {
        node.item = 1;
        int count = 2;
        Node target = node;
        while (true){
            for (int i = 0; i < count; i++) {
                target = target.next;
                if(target.item != 0){
                    target = target.next;
                    i--;
                }
            }
            target.item = count;
            count++;
            System.out.println("================" + count);
            System.out.println(target + "'s item is: " + target.item);
            if(count == 13)
                break;
        }
    }




    public static void main(String[] args) {
        Node node = new Node(0);
        circleLink(node, 13, node);
        init(node);

    }

}
