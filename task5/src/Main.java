import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        generic_linked_list<Integer> list = new generic_linked_list<>();

        list.addLast(10);
        list.addLast(15);
        list.addLast(20);
        list.printItems();
        list.reveseList();
        list.printItems();


    }
}