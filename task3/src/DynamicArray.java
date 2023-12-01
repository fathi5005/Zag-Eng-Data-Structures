public class DynamicArray {

    int var[];
    int size = 0;
    int counter = 0;

    public DynamicArray(int arraysize) {
        size = arraysize;
        var = new int[size];

    }

    public DynamicArray() {
        size = 20;
        var = new int[size];

    }

    public void printArray() {

        for (int i = 0; i < counter; i++) {


            System.out.print(var[i] + " ");
        }
        System.out.println();

    }

    public void addItem(int newitem) {

        if (counter < size) {
            var[counter] = newitem;
            counter++;
        } else {
            // create a new array with a larger size that has the same content of the previous array
            newArray();
        }


    }

    private void newArray() {
        size *= 2;
        int[] newarray = new int[size];

        for (int i = 0; i < counter; i++) {

            newarray[i] = var[i];

        }
        var = newarray;
    }

    public void removeAt(int removedindex) {


        if ((removedindex < 0) || (removedindex >= counter)) {


            throw new IllegalStateException("invaild index");
        } else {

            for (int i = removedindex; i < (counter - 1); i++) {

                var[i] = var[i + 1];

            }
            counter--;


        }


    }

    public void removeItem(int item) {


        int index = returnIndexOfItem(item);
        if (index != -1) {
            removeAt(index);


        }

    }

    public int returnIndexOfItem(int item) {

        int errorstate = -1;

        for (int i = 0; i < counter; i++) {

            if (var[i] == item) {

                return i;


            }

        }

        return errorstate;


    }

    public int returnItemOfIndex(int index) {


        if ((index < 0) || (index >= counter)) {


            throw new IllegalStateException("invaild index");
        } else {


            return var[index];


        }


    }

    public int maxItem() {

        int max = var[0];
        for (int i = 1; i < counter; i++) {

            if (var[i] > max) {

                max = var[i];


            }

        }
        return max;

    }


    public int minItem() {

        int min = var[0];
        for (int i = 1; i < counter; i++) {

            if (var[i] < min) {

                min = var[i];


            }
        }

        return min;

    }


}

