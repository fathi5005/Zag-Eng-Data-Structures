import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        StackBasedOnArray stack1 = new StackBasedOnArray(3);
        StackBasedOnLinkedList stack2 = new StackBasedOnLinkedList();
        stack1.push(5);
        stack1.push(6);
        stack1.push(7);
        stack1.push(8);
        System.out.println(stack1.pop());
        System.out.println( "size of stack based on array  = " +stack1.getNumOfItems());
        stack2.push(20);
        stack2.push(30);
        stack2.push(40);
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println( "size of stack based on array  = " +stack2.getSize());


        System.out.println(reverse("ahmed mohamed fathi"));
        System.out.println(balancedBrackets("{<4512>})"));
        System.out.println(balancedBrackets("{<4512>}"));

    }


    public static String reverse(String keyword) {
        Stack<Character> stack = new Stack<>();
        String revrse = "";
        for (int i = 0; i < keyword.length(); i++) {

            stack.push(keyword.charAt(i));

        }

        for (int i = 0; i < keyword.length(); i++) {

            revrse += stack.pop();

        }

        return revrse;
    }

    public static boolean balancedBrackets(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (isOpenBracket(ch))
                stack.push(s.charAt(i));

            else if (isClosedBracket(ch)) {

                if (stack.isEmpty()) {

                    return false;
                }
                char openbracket = stack.pop();
                if (!isMtached(openbracket, ch)) {

                    return false;

                }


            }


        }
        return stack.isEmpty();


    }

    public static boolean isOpenBracket(char c) {

        return (c == '{' || c == '<' || c == '[' || c == '(');


    }

    public static boolean isClosedBracket(char c) {


        return (c == '}' || c == '>' || c == ']' || c == ')');


    }

    public static boolean isMtached(char right, char left) {


        return (right == '(' && left == ')') ||
                (right == '{' && left == '}') ||
                (right == '<' && left == '>') ||
                (right == '[' && left == ']');


    }

}