package ss16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BT7 {
    public static void main(String[] args) {
        ArrayList<Integer> danhSachSoNguyen = new ArrayList<>();

        danhSachSoNguyen.add(10);
        danhSachSoNguyen.add(20);
        danhSachSoNguyen.add(10);
        danhSachSoNguyen.add(30);
        danhSachSoNguyen.add(20);
        danhSachSoNguyen.add(40);
        danhSachSoNguyen.add(10);
        danhSachSoNguyen.add(50);
        danhSachSoNguyen.add(30);
        danhSachSoNguyen.add(60);

        System.out.println("Danh sách số nguyên:");
        System.out.println(danhSachSoNguyen);

        Map<Integer, Integer> tanSuat = new HashMap<>();
        for (int so : danhSachSoNguyen) {
            tanSuat.put(so, tanSuat.getOrDefault(so, 0) + 1);
        }

        System.out.println("Các phần tử xuất hiện đúng một lần:");
        for (Map.Entry<Integer, Integer> entry : tanSuat.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("Các phần tử bị trùng lặp kèm số lần xuất hiện:");
        for (Map.Entry<Integer, Integer> entry : tanSuat.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Số " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần.");
            }
        }
    }
}
