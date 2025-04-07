class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        student1.displayDetails();
    }
}
