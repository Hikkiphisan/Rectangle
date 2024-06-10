import java.util.Scanner;

public class find_student {
    public static void main(String[] args) {
        String[] sinhVien = {"Huy", "Hien", "Nguyen", "Kien"};
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhâp vào tên sinh vien:");
            String nhap_ten_sinhVien = scanner.nextLine();

            boolean coTonTaiKhong = false;
            for (int i = 0; i < sinhVien.length; i++) {
                if (sinhVien[i].equals(nhap_ten_sinhVien)) {
                    System.out.println("Vi tri cua Sinh vien trong danh sach " + nhap_ten_sinhVien + " la: " + i);
                    coTonTaiKhong = true;
                    break;
                }
            }
            if (!coTonTaiKhong) {
                System.out.println("Loi, khong tim thay ten sinh vien trong danh sach");
            } else {
                break;
            }
        }
    }
}
