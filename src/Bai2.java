import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        final int GIA_YEN = 160;
        int money;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien : ");
        money = sc.nextInt();

        System.out.println("So tien la : " + (GIA_YEN * money));
    }
}
