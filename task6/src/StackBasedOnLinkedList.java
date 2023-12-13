import java.util.NoSuchElementException;

public class StackBasedOnLinkedList {

    private class Node {

        int value;
        Node nextnode;

        public Node(int value) {
            this.value = value;
        }

    }

     private Node top;
     private  int size = 0;

    public boolean isEmpty() {

        return (top == null);

    }

    public void push(int item) {
        Node node = new Node(item);
        node.nextnode = top;
        top = node;
        node.value=item;
        size++;

    }

    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("stack is empyt");

        }
        else {
            size--;
            Node temp = top;
            top = temp.nextnode;
            temp.nextnode = null;


            return (temp.value);
        }


    }

    public int peak() {
        if (isEmpty()) {
            throw new NoSuchElementException("stack is empyt");

        } else {

            return (top.value);

        }


    }
    public int getSize(){

        return size;
    }


}
