package ss16;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class BT6 {
    public static void main(String[] args) {
        ArrayList<Integer> danhSachSoNguyen = new ArrayList<>();

        // Thêm các phần tử vào danh sách
        danhSachSoNguyen.add(10);
        danhSachSoNguyen.add(20);
        danhSachSoNguyen.add(10);
        danhSachSoNguyen.add(30);
        danhSachSoNguyen.add(20);
        danhSachSoNguyen.add(40);
        danhSachSoNguyen.add(10);
        danhSachSoNguyen.add(50);
        danhSachSoNguyen.add(30);
        danhSachSoNguyen.add(20);

        System.out.println("Danh sách trước khi loại bỏ trùng lặp:");
        System.out.println(danhSachSoNguyen);

        ArrayList<Integer> danhSachKhongTrungLap = new ArrayList<>(new LinkedHashSet<>(danhSachSoNguyen));

        System.out.println("Danh sách sau khi loại bỏ trùng lặp:");
        System.out.println(danhSachKhongTrungLap);
    }
}
