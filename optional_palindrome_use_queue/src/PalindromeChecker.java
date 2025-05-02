import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        // Chuẩn hóa chuỗi: loại bỏ khoảng trắng, chuyển về chữ thường
        String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        // So sánh từng ký tự của stack và queue
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "Able was I ere I saw Elba";
        boolean result = isPalindrome(test);

        System.out.println("Chuỗi: \"" + test + "\"");
        System.out.println("Có phải Palindrome không? " + result);
    }
}
