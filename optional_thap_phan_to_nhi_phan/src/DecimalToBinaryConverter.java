import java.util.Stack;

public class DecimalToBinaryConverter {

    public static String convertToBinary(int decimalNumber) {
        if (decimalNumber == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber /= 2;
        }

        StringBuilder binaryString = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryString.append(stack.pop());
        }

        return binaryString.toString();
    }

    public static void main(String[] args) {
        int decimal = 30;
        String binary = convertToBinary(decimal);
        System.out.println("Số thập phân: " + decimal);
        System.out.println("Số nhị phân: " + binary);
    }
}
