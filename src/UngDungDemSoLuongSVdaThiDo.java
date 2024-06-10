import java.util.Scanner;

public class UngDungDemSoLuongSVdaThiDo {
    public static void main(String[] args) {
        int[] array = {3, 7, 9, 9, 7, 6, 7};
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("So luong sinh vien do là: " + count);
    }
}