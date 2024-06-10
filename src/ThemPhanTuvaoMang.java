import java.util.Scanner;

public class ThemPhanTuvaoMang {
    public static void main(String[] args) {
        int[] array = {3, 7, 9, 11, 7, 15, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào giá trị cần chèn: ");
        int soCanAddVaoMang = scanner.nextInt();
        System.out.print("Nhập vào vị trí để chèn giá trị: ");
        int index = scanner.nextInt();
        if (index < 0 || index > array.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng, lý do là Vị trí không hợp lệ");
        } else {
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = soCanAddVaoMang;

            for (int i = index; i < array.length; i++) {
                newArray[i + 1] = array[i];
            }
            System.out.println("Mảng sau khi chèn:");
            for (int value : newArray) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
