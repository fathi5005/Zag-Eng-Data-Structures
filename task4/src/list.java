import java.util.NoSuchElementException;

public class list {

    private class Node {

        int value;
        Node nextnode;

        public Node(int v) {

            value = v;


        }


    }

    private Node head;
    private Node tail;
    private int size = 0;


    private boolean isEmbty() {
        return head == null;
    }

    /* T(n) = o(1) */
    public void addFirst(int item) {
        Node node = new Node(item);
        size++;


        if (isEmbty()) {

            head = tail = node;

        } else {

            node.nextnode = head;
            head = node;


        }


    }

    /* T(n) = o(1) */
    public void addLast(int item) {

        Node node = new Node(item);
        size++;

        if (isEmbty()) {

            head = tail = node;

        } else {


            tail.nextnode = node;
            node.nextnode = null;
            tail = node;
        }


    }

    /* T(n) = o(1) */
    public void removeFirst() {

        if (isEmbty()) {

            throw new NoSuchElementException("empty list");

        }

        if (head == tail) {


            head = tail = null;
            size--;

        } else {


            Node temp = head.nextnode;
            head.nextnode = null;
            head = temp;
            size--;
        }

    }

    /* T(n) = o(n) */
    public void removeLast() {


        if (isEmbty()) {

            throw new NoSuchElementException("empty list");

        }
        if (head == tail) {


            head = tail = null;

            size--;
        } else {

            Node currentnode = head;
            Node previousnode = head;

            while (currentnode != null) {

                previousnode = currentnode;
                currentnode = currentnode.nextnode;


            }

            previousnode.nextnode = null;
            tail = previousnode;
            size--;

        }

    }

    /* T(n) = o(n) */
    public int indexOf(int item) {

        Node iterator = head;
        int index = 0;


        while (iterator != null) {


            if (iterator.value == item) {


                return index;
            }

            index++;

            iterator = iterator.nextnode;


        }

        return -1;


    }

    /* T(n) = o(n) */
    public boolean contains(int item) {


        if (indexOf(item) == (-1)) {

            return false;


        }

        return true;


    }

    /* T(n) = o(1) */
    public int getSize() {


        return size;
    }


    /* T(n) = o(n) */
    public void printItems() {

        Node node = head;


        for (int i = 0; i < size; i++) {

            System.out.print(node.value + "  ");

            node = node.nextnode;


        }
        System.out.println();

    }

    /* T(n) = o(n) */
    public int maxItem() {


        Node node = head;
        int max = 0;


        for (int i = 0; i < size; i++) {

            if (node.value > max) {


                max = node.value;

            }
            node = node.nextnode;


        }

        return max;
    }

    /* T(n) = o(n) */
    public int minItem() {


        Node node = head.nextnode;
        int min = node.value;


        for (int i = 0; i < size; i++) {

            if (node.value < min) {


                min = node.value;

            }
            node = node.nextnode;


        }

        return min;
    }


}
