
//import java.util.scanner;
public class Main {
public static class General{

    public static int RandomValue(int num){

        return  (int)(Math.random()*num);

    }
    public static int RandomValue(int min,int max){

        return  (int)(min+((max-min)*Math.random()));

    }

    public static char RandomChar(){

        return  (char)((int)(65+((91-65)*Math.random())));

    }

    public static <T> void PrintArray(T [] array) {

        for (int i = 0; i <= 4; i++) {

            System.out.println(array[i]);

        }

    }
    public static int ReverseNum(int num) {
        int reversednum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversednum =  digit + (reversednum * 10) ;
            num /= 10;
        }

        return reversednum;
    }


}


    public static void main(String[] args) {

        Integer   [] array1 = {1,2,3,4,5};

        Character [] array2 ={'a','b','b','c','d'};

        General x = new General();

        System.out.println(x.RandomValue(15));

        System.out.println(x.RandomValue(8,20));

        System.out.println(x.RandomChar());

        x.PrintArray(array1);

        x.PrintArray(array2);
        System.out.println(x.ReverseNum(123));
}


}