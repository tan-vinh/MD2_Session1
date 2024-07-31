import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int edge;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh hinh vuong: ");
        edge = sc.nextInt();

        System.out.println("Chu vi hinh vuong la : " + (edge * 4));
        System.out.println("Dien tich hinh vuong la : " + (edge * edge));
    }
}
