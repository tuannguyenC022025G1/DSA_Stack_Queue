import java.util.*;

public class Demerging {
    public static void main(String[] args) {
        // Danh sách dữ liệu ban đầu (đã sắp theo ngày sinh)
        List<Person> people = Arrays.asList(
                new Person("Lan", "nữ", "1995-01-12"),
                new Person("Nam", "nam", "1995-02-10"),
                new Person("Hoa", "nữ", "1996-03-22"),
                new Person("Minh", "nam", "1997-04-15"),
                new Person("Hương", "nữ", "1998-05-30")
        );

        Queue<Person> nu = new LinkedList<>();
        Queue<Person> nam = new LinkedList<>();

        // Bước 1 & 2: Phân chia vào 2 queue
        for (Person p : people) {
            if (p.getGender().equals("nữ")) {
                nu.offer(p);
            } else if (p.getGender().equals("nam")) {
                nam.offer(p);
            }
        }

        // Bước 3 & 4: Xuất dữ liệu
        System.out.println("Danh sách phân loại:");
        while (!nu.isEmpty()) {
            System.out.println(nu.poll());
        }
        while (!nam.isEmpty()) {
            System.out.println(nam.poll());
        }
    }
}
