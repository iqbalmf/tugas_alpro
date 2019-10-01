import java.util.Random;
import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        int bilangan_satu = 0, bilangan_dua = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan pertama = ");
        bilangan_satu = scanner.nextInt();
        System.out.println("Masukkan bilangan kedua = ");
        bilangan_dua = scanner.nextInt();

        getRandomNumber(bilangan_satu, bilangan_dua);
    }

    private static void getRandomNumber(int bil_satu, int bil_dua) {
        Random ran = new Random();
        int bilRandom = ran.nextInt(bil_dua) + bil_satu;
        if (bilRandom % 2 == 1) {
            bilRandom = bilRandom + 1;
        }
        System.out.println(bilRandom);
    }
}
