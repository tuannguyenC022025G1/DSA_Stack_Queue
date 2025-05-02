public class Person {
    private String name;
    private String gender;
    private String birthDate; // Giả định chuỗi ngày sinh đã được sắp sẵn

    public Person(String name, String gender, String birthDate) {
        this.name = name;
        this.gender = gender.toLowerCase();
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return name + " | " + gender + " | " + birthDate;
    }
}
