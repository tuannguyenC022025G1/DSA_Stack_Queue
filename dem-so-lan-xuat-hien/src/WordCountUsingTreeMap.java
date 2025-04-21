import java.util.TreeMap;

public class WordCountUsingTreeMap {
    public static void countWords(String text) {
        // Tạo một TreeMap để lưu trữ từ và số lần xuất hiện
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();

        // Chuyển chuỗi thành chữ thường và tách thành các từ
        String[] words = text.toLowerCase().split("\\W+");

        // Đếm số lần xuất hiện của mỗi từ
        for (String word : words) {
            if (!word.isEmpty()) { // Bỏ qua các chuỗi rỗng
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        // Hiển thị kết quả
        System.out.println("Số lần xuất hiện của mỗi từ (theo thứ tự bảng chữ cái):");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }

    public static void main(String[] args) {
        // Chuỗi văn bản mẫu
        String text = "Java is a programming language. Java is widely used in programming.";

        // Gọi hàm đếm từ
        countWords(text);
    }
}