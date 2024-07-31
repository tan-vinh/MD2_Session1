import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        final double PI = 3.14;
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        r = sc.nextInt();

        System.out.println("Chu vi hinh tron la :" + (2 * PI * r));
        System.out.println("Dien tich hinh tron la :" + (r * PI * r));
    }
}
