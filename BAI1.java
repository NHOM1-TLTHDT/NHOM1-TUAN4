import java.util.Scanner;
//1.	Viết chương trình tính tổng các số từ 1 đến n.
public class BAI1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n");
        int n=sc.nextInt();

        int s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println("s= "+s);
    }
}
