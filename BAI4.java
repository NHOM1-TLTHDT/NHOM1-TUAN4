import java.util.Scanner;
public class BAI4 {
//    4.	Viết chương trình nhập vào một số nguyên
//    và kiểm tra xem số đó có phải là số nguyên tố hay không..
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so nguyen n");
        int n=sc.nextInt();
        boolean kt=true;
        if(n<2)
            System.out.println("n khong phai so nguyen to");
        else
            for(int i=2;i<=Math.sqrt(n);i++)
                if(n%i==0)
                {
                    kt = false;
                    break;
                }
        if(kt)
            System.out.println("la so nguyen to");
        else
            System.out.println("khong la so nguyen to");

    }
}
