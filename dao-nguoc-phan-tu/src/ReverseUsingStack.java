import java.util.Stack;

public class ReverseUsingStack {
    // Hàm đảo ngược mảng số nguyên sử dụng Stack
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Đẩy các phần tử của mảng vào stack
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        // Lấy các phần tử từ stack và gán lại vào mảng
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    // Hàm đảo ngược chuỗi sử dụng Stack
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();

        // Đẩy các ký tự của chuỗi vào stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Lấy các ký tự từ stack để tạo chuỗi mới
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        // Test đảo ngược mảng số nguyên
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Mảng ban đầu:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        reverseArray(arr);
        System.out.println("Mảng sau khi đảo ngược:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Test đảo ngược chuỗi
        String str = "Hello, World!";
        System.out.println("Chuỗi ban đầu: " + str);
        String reversedStr = reverseString(str);
        System.out.println("Chuỗi sau khi đảo ngược: " + reversedStr);
    }
}