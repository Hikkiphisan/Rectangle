import java.util.Scanner;

public class timPhanTuLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kich thuoc khong vuot qua 20");
            }
        } while (size > 20) ;
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap phan tu vi tri " + (i + 1) + " la :" + i);
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("In ra toan bo nhung phan tu vua nhap vao: ");
        for (int j = 0; j < array.length ; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length ; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
    System.out.println("Phan tu lon nhat la : " + max);
    }
}