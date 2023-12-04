
public class Main {
    public static void main(String[] args) {


        list node = new list();

        node.addFirst(10);
        node.addFirst(20);
        node.addFirst(30);
        node.addFirst(40);
        node.addLast(50);
        node.addLast(60);
        node.addLast(70);
        node.printItems();
        node.removeFirst();
        node.removeLast();
        node.printItems();
        System.out.println("size = " + node.getSize());
        System.out.println("index = " + node.indexOf(50));
        System.out.println("index = " + node.indexOf(90));
        System.out.println("Is item in the list ?  " + node.contains(90));
        System.out.println("Is item in the list ?  " + node.contains(50));
        System.out.println("max item = " + node.maxItem());
        System.out.println("min item  = " + node.minItem());




    }
}