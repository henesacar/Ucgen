import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("1. kenar uzunluğunu giriniz: ");
        int a = scn.nextInt();
        System.out.println("2. kenar uzunluğunu giriniz: ");
        int b = scn.nextInt();
        System.out.println("3. kenar uzunluğunu giriniz: ");
        int c = scn.nextInt();
        double u = (a+b+c)/2;
        double alanKare = u*(u-a)*(u-b)*(u-c);
 double alan = Math.sqrt(alanKare);
        System.out.println("Üçegenin alanı: " +alan);
    }
}
