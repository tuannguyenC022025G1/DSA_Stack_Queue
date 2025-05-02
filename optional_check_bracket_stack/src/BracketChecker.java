import java.util.Stack;

public class BracketChecker {

    public static boolean isBalanced(String expression) {
        Stack<Character> bStack = new Stack<>();

        for (char sym : expression.toCharArray()) {
            // Nếu là dấu ngoặc trái thì đưa vào stack
            if (sym == '(' || sym == '[' || sym == '{') {
                bStack.push(sym);
            }
            // Nếu là dấu ngoặc phải thì kiểm tra khớp
            else if (sym == ')' || sym == ']' || sym == '}') {
                if (bStack.isEmpty()) return false;

                char left = bStack.pop();

                if (!isMatchingPair(left, sym)) {
                    return false;
                }
            }
        }

        // Nếu stack rỗng sau khi xử lý, dấu ngoặc là hợp lệ
        return bStack.isEmpty();
    }

    private static boolean isMatchingPair(char left, char right) {
        return (left == '(' && right == ')') ||
                (left == '[' && right == ']') ||
                (left == '{' && right == '}');
    }

    public static void main(String[] args) {
        String[] testCases = {
                "s * (s – a) * (s – b) * (s – c)",      // Well
                "(- b + (b2 – 4*a*c)^0.5) / 2*a",      // Well
                "s * (s – a) * (s – b * (s – c)",      // Not well
                "s * (s – a) * s – b) * (s – c)",      // Not well
                "(- b + (b^2 – 4*a*c)^(0.5/ 2*a))"     // Not well
        };

        for (String test : testCases) {
            System.out.println("Biểu thức: " + test);
            System.out.println("=> Dấu ngoặc hợp lệ? " + isBalanced(test));
            System.out.println("----");
        }
    }
}
