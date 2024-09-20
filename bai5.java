import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( " moi nhap so nguyen a");
        int a=sc.nextInt();
        System.out.println(" moi nhap so nguyen b");
        int b=sc.nextInt();
        // tinh ucln
        int s1 =a;
        int s2= b;

        while(s2!=0){
            int tg= s2;
            s2 = s1 %s2;
            s1 = tg;
        }
        int ucln = s1;

        System.out.println("UCLN cua " + a + " va " + b+ " la: " + ucln);
        // tinh bcnn
        int bcnn = (a * b) / ucln;
        System.out.println("BCNN cua " + a + " va " + b + " la: " + bcnn);
    }
}
