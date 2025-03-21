package ss16;

import java.util.ArrayList;
import java.util.Collections;

public class BT3 {
    public static void main(String[] args) {
        ArrayList<Integer> danhSachSoNguyen = new ArrayList<>();

        danhSachSoNguyen.add(25);
        danhSachSoNguyen.add(10);
        danhSachSoNguyen.add(56);
        danhSachSoNguyen.add(33);
        danhSachSoNguyen.add(89);
        danhSachSoNguyen.add(2);
        danhSachSoNguyen.add(77);
        danhSachSoNguyen.add(19);

        System.out.println("Danh sách số nguyên:");
        System.out.println(danhSachSoNguyen);

        int max = Collections.max(danhSachSoNguyen);
        int min = Collections.min(danhSachSoNguyen);

        System.out.println("Phần tử lớn nhất: " + max);
        System.out.println("Phần tử nhỏ nhất: " + min);
    }
}
