
public class Main {
    public static void main(String[] args) {

        DynamicArray array = new DynamicArray(5);

        array.addItem(10);
        array.addItem(20);
        array.addItem(30);
        array.addItem(40);
        array.addItem(50);
        array.addItem(60);
        array.addItem(70);

        array.printArray();

        array.removeAt(4);

        array.printArray();

        array.removeItem(20);

        array.printArray();

        System.out.println(array.returnIndexOfItem(70));
        System.out.println(array.returnIndexOfItem(80));

        array.addItem(50);
        array.addItem(500);
        array.addItem(100);

        array.printArray();

        System.out.println(array.maxItem());
        System.out.println(array.minItem());


    }
}