import java.util.Scanner;
public class TinhTongCacSoOMotCotduocXacDinh {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
//                double[][] mang2Chieu = {
//                        {1.5, 2, 3.8},
//                        {4.2, 5.5, 6.1},
//                        {7.0, 8.8, 9.9}
//                };
                System.out.println("Nhap so hang cua mang: ");
                int dong = scanner.nextInt();
                System.out.println("Nhap so cot cua mang: ");
                int cot = scanner.nextInt();
                double[][] mang2Chieu = new double[cot][dong];
                for (int i = 0; i < dong; i++) {
                    for (int j = 0; j < cot; j++) {
                        System.out.println("Nhap gia tri cho phan tu [" + i + "][" + j + "]: ");
                        mang2Chieu[i][j] = scanner.nextDouble();
                    }
        }

                System.out.print("Nhập thứ tự của cột muốn tính tổng: ");
                int column = scanner.nextInt();
                double tong = 0;
                for (int i = 0; i < mang2Chieu.length; i++) {
                    tong += mang2Chieu[i][column];
                }
                System.out.println("Tổng của cột " + column + " là: " + tong);
                scanner.close();
            }
        }
