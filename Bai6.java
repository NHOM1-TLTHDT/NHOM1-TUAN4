package BT;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean dk = true;
        int n = 0, k = 0;
        do {
            try {
                System.out.println("Nhập vào một số nguyên");
                n = scanner.nextInt();
                k = n;
                dk = false;

            } catch (Exception e) {
                System.out.println("Lỗi nhập dữ liệu! Vui lòng nhập lại");
                scanner.next();
            }
        } while (dk);


        int nguoc = 0;
        while (n != 0) {
            int tg = n % 10;
            nguoc = nguoc * 10 + tg;
            n = n / 10;
        }
        if (k == nguoc) {
            System.out.println(k + " là số đối xứng");
        } else {
            System.out.println(k + " không phải là số đối xứng");
        }


    }
}
