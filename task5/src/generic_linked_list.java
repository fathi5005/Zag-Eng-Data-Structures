import java.util.NoSuchElementException;

public class generic_linked_list <T>{

        private class Node {

            T value;
            Node nextnode;

            public Node(T v) {

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
        public void addFirst(T item) {
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
        public void addLast(T item) {

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
        public int indexOf(T item) {

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
        public boolean contains(T item) {


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


        public void reveseList (){

            Node previous = head;
            Node current = head.nextnode;
            while (current != null){

                Node next = current.nextnode;
                current.nextnode= previous;
                previous=current;
                current=next;

            }

            head.nextnode=null;
            Node temp = head;
            head=tail;
            tail=temp;





        }



}
