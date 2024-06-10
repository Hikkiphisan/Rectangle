import java.util.Scanner;

public class reverse_array {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap vap size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kich thuoc không duọc vuọt qua 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("\n%-20s%s", "Phan tu cua mang: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");  // \t là khoảng trắng
        }

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }


        System.out.printf("\n%-20s%s", "Dao nguoc mang: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }


    }
}