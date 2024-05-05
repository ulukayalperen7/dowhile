import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        int number = scanner.nextInt();
        int sum = 0;
        do {
            if (number % 4 == 0) {
                sum += number;
            }
            System.out.print("sayi giriniz: ");
            number = scanner.nextInt();
        } while (number % 2 == 0);
        System.out.println(sum);
    }
}
