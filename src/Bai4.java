import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int math;
        int literature;
        int english;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem toan : ");
        math = sc.nextInt();
        System.out.println("Nhap diem van : ");
        literature = sc.nextInt();
        System.out.println("Nhap diem anh : ");
        english = sc.nextInt();

        System.out.println("Diem trung binh la : " + ((math + literature + english)/3));
    }
}
