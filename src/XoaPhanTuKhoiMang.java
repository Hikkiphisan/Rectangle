import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {3, 7, 9, 11, 7, 15, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào phần tử cần xoá: ");
        int nhapPhanTuCanXoa = scanner.nextInt();
        int viTriPhanTu = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == nhapPhanTuCanXoa) {
                viTriPhanTu = i;
                break;
            }
        }
        if (viTriPhanTu == -1) {
            System.out.println("Phần tử không tồn tại trong mảng!");
        } else {
            for (int i = viTriPhanTu; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            System.out.println("Mảng sau khi xoá:");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
        }
        scanner.close();
    }
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
