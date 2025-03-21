package ss16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BT8 {
    public static void main(String[] args) {
        ArrayList<String> danhSachChuoi = new ArrayList<>();

        danhSachChuoi.add("banana");
        danhSachChuoi.add("apple");
        danhSachChuoi.add("kiwi");
        danhSachChuoi.add("orange");
        danhSachChuoi.add("grape");
        danhSachChuoi.add("blueberry");
        danhSachChuoi.add("pear");

        System.out.println("Danh sách trước khi sắp xếp:");
        System.out.println(danhSachChuoi);

        Collections.sort(danhSachChuoi, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                return Integer.compare(s1.length(), s2.length());
            }
        });

        System.out.println("Danh sách sau khi sắp xếp:");
        System.out.println(danhSachChuoi);
    }
}