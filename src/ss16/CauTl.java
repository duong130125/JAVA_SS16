package ss16;

public class CauTl {
    /*
  1. Vòng lặp for truyền thống
  for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
  }
  ưu điểm
    + Nhanh nhất với ArrayList vì truy cập phần tử theo chỉ mục (O(1)).
    + Dễ kiểm soát chỉ mục (i), có thể bỏ qua phần tử, thay đổi dữ liệu dễ dàng.
  nhược điểm:
    + Không thể dùng với Set, Map
    + Nếu danh sách thay đổi trong khi lặp (list.remove(i)), có thể gặp lỗi ConcurrentModificationException.
    + Nếu list.size() quá lớn, vòng lặp có thể bị chậm do gọi lại list.size() mỗi vòng (dùng int size = list.size(); để tối ưu).

  2. Vòng lặp for-each
  for (String item : list) {
    System.out.println(item);
  }
  ưu điểm:
    + Cú pháp đơn giản, dễ đọc.
    + Tránh lỗi ngoài chỉ mục (IndexOutOfBoundsException).
    + Hoạt động với tất cả kiểu tập hợp (List, Set, Map.values()).

  nhược điểm:
    + Không thể xóa phần tử khi duyệt (list.remove(item) gây lỗi ConcurrentModificationException).
    + Hiệu suất thấp hơn vòng for truyền thống do sử dụng Iterator ẩn.

  3. Duyệt bằng Iterator
  Iterator<String> iterator = list.iterator();
  while (iterator.hasNext()) {
      System.out.println(iterator.next());
  }
  ưu điểm:
    + Cho phép xóa phần tử an toàn trong khi lặp (iterator.remove()).
    + Tương thích với mọi tập hợp (List, Set, Map.values()).
  nhược điểm:
    + Chậm hơn for truyền thống do phải gọi iterator.next().
    + Cú pháp dài dòng hơn for-each.

  4. Duyệt bằng Stream API (Java 8)
  list.stream().forEach(System.out::println);

  ưu điểm:
    + Code ngắn gọn, dễ đọc.
    + Hỗ trợ xử lý song song nếu dùng parallelStream().
    + Dễ dàng áp dụng lọc, ánh xạ dữ liệu (filter(), map()).
  nhược điểm:
    + Chậm hơn for truyền thống với danh sách nhỏ (do chi phí tạo Stream).
    + Không thể dừng (break) hoặc thay đổi dữ liệu trực tiếp.

 5. Duyệt bằng Parallel Stream
list.parallelStream().forEach(System.out::println);
  ưu điểm:
    + Nhanh hơn nhiều so với for khi danh sách lớn (≥10⁵ phần tử) do sử dụng đa luồng.
  nhược điểm:
    + Không đảm bảo thứ tự (dữ liệu có thể in lộn xộn).
    + Quản lý tài nguyên CPU phức tạp hơn.

  kết luận:
  1 For truyền thống là nhanh nhất với danh sách nhỏ và ArrayList.
  2 For-each tiện lợi nhưng chậm hơn một chút.
  3 Iterator hữu ích khi cần xóa phần tử khi lặp.
  4 Stream API phù hợp khi lập trình hàm nhưng chậm hơn vòng lặp.
  5 Parallel Stream tăng tốc đáng kể nhưng không đảm bảo thứ tự.
*/
}
