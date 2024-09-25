import java.util.Scanner;

public class Tuan4bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            long giaiThua = 1; // Khởi tạo giai thừa
            for (int i = 1; i <= n; i++) {
                giaiThua *= i; // Tính giai thừa
            }
            System.out.println("Giai thừa của " + n + " là: " + giaiThua);
        }

        scanner.close();
    }
}
