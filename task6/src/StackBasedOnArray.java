import java.util.NoSuchElementException;


public class StackBasedOnArray {

    private int[] var;
    private int size = 0;
    private int top = 0; // equal to num of elements in stack


    public StackBasedOnArray(int size) {
        this.size = size;
        var = new int[size];
    }

    public StackBasedOnArray() {
        size = 100;
        var = new int[size];
    }

    public void push(int item) {


        if (top == size) {
            createLargerArray();

        }
        var[top] = item;
        top++;

    }


    public void createLargerArray() {
        size *= 2;
        int[] newarray = new int[size];
        for (int i = 0; i < top; i++) {
            newarray[i] = var[i];
        }
        var = newarray;
    }


    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("stack is empyt");

        } else {
            top--;
            return (var[top]);

        }


    }

    public int peak() {
        if (isEmpty()) {
            throw new NoSuchElementException("stack is empyt");

        } else {

            return (var[top - 1]);

        }


    }

    public boolean isEmpty() {

        return (top == 0);

    }

    public int getNumOfItems() {

        return top;
    }

}
