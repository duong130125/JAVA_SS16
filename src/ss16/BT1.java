package ss16;

import java.util.ArrayList;
import java.util.Iterator;

public class BT1 {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Nguyen Van A");
        studentList.add("Tran Thi B");
        studentList.add("Le Van C");
        studentList.add("Pham Thi D");
        studentList.add("Hoang Van E");

        System.out.println("Duyệt bằng vòng lặp for:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        System.out.println("Duyệt bằng vòng lặp foreach:");
        for (String sinhVien : studentList) {
            System.out.println(sinhVien);
        }

        System.out.println("Duyệt bằng Iterator:");
        Iterator<String> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
