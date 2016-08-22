package js.rnd.hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> temp = new Stack<Character>();
        int i, n;
        while (sc.hasNext()) {
            String input = sc.next();
            // Complete the code
            n = input.length();
            i = 0;
            temp = new Stack<Character>();
            while (i < n) {
                if (input.charAt(i) == '[' || input.charAt(i) == '('
                        || input.charAt(i) == '{') {
                    temp.add(input.charAt(i));
                } else if (input.charAt(i) == ']' || input.charAt(i) == ')'
                        || input.charAt(i) == '}') {
                    if (temp.size() > 0) {
                        if ((temp.peek() == '[' && input.charAt(i) == ']')
                                || (temp.peek() == '(' && input.charAt(i) == ')')
                                || (temp.peek() == '{' && input.charAt(i) == '}')) {
                            temp.pop();

                        }
                    } else {
                        temp.add(input.charAt(i));
                    }

                }
                i++;
            }
            System.out.println(temp.size() == 0);
        }

    }
}
