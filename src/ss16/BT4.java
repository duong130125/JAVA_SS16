package ss16;

import java.util.ArrayList;

public class BT4 {
    public static void main(String[] args) {
        ArrayList<Integer> danhSachSoNguyen = new ArrayList<>();

        danhSachSoNguyen.add(10);
        danhSachSoNguyen.add(20);
        danhSachSoNguyen.add(30);
        danhSachSoNguyen.add(40);
        danhSachSoNguyen.add(50);

        System.out.println("Danh sách số nguyên:");
        System.out.println(danhSachSoNguyen);

        int tong = 0;
        for (int so : danhSachSoNguyen) {
            tong += so;
        }
        System.out.println("Tổng của tất cả các phần tử: " + tong);
    }
}
