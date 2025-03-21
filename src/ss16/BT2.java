package ss16;

import java.util.ArrayList;
import java.util.Iterator;

public class BT2 {
    public static void main(String[] args) {
        ArrayList<Integer> danhSachSoNguyen = new ArrayList<>();

        danhSachSoNguyen.add(10);
        danhSachSoNguyen.add(15);
        danhSachSoNguyen.add(21);
        danhSachSoNguyen.add(33);
        danhSachSoNguyen.add(42);
        danhSachSoNguyen.add(50);
        danhSachSoNguyen.add(60);
        danhSachSoNguyen.add(71);
        danhSachSoNguyen.add(82);
        danhSachSoNguyen.add(90);

        System.out.println("Danh sách số nguyên ban đầu:");
        System.out.println(danhSachSoNguyen);

        Iterator<Integer> iterator = danhSachSoNguyen.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 3 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Danh sách sau khi xóa các số chia hết cho 3:");
        System.out.println(danhSachSoNguyen);
    }
}