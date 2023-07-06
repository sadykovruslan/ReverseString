import java.util.Stack;
public class StackChar {
    public static void main(String[] args) {
        Stack<Character> stackString = new Stack<>();
        char [] hi = {'h','e','l','l','o'};
        char [] ih = new char[hi.length];

        for (char s : hi) {
            stackString.add(s);
        }
        for (int i = 0; i < hi.length; i++) {
            ih[i] = stackString.pop();
        }
        System.out.println(ih);
    }
}
