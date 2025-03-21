package ss16;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String classify() {
        if (gpa >= 8.5) return "Xuất sắc";
        if (gpa >= 7.0) return "Giỏi";
        if (gpa >= 5.5) return "Khá";
        return "Trung bình/Yếu";
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa + " (" + classify() + ")";
    }
}

public class BT10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Nhập số lượng sinh viên:");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập ID, tên và GPA của sinh viên " + (i + 1) + ":");
            String id = scanner.nextLine();
            String name = scanner.nextLine();
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            students.add(new Student(id, name, gpa));
        }

        System.out.println("Danh sách sinh viên:");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\nNhập tên sinh viên cần tìm kiếm:");
        String searchName = scanner.nextLine();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Tìm thấy: " + s);
            }
        }

        scanner.close();
    }
}
