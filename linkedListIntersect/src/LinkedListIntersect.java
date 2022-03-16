public class LinkedListIntersect {

    public static void main(String args[]){

        SingleLinked first = new SingleLinked();
        SingleLinked second = new SingleLinked();

        first.addNode(3);
        first.addNode(7);
        first.addNode(8);
        first.addNode(10);

        second.addNode(99);
        second.addNode(1);
        second.addNode(8);
        second.addNode(10);

        System.out.println("Intersection of 3->7->8->10 and 99->1->8->10: " + intersect(first,second));

    }

    public static int intersect(SingleLinked first, SingleLinked second) {

        Node currentFirst = first.head;
        Node currentSecond = second.head;

        while(currentFirst.data != currentSecond.data) {
            currentFirst = currentFirst.next;
            currentSecond = currentSecond.next;
        }

        return currentFirst.data;
    }

    public static class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static class SingleLinked {

        public Node head = null;
        public Node tail = null;

        public void addNode(int data) {

            Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }
}
