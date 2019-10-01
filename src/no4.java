import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        int bilangan_satu = 0, bilangan_dua = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan pertama = ");
        bilangan_satu = scanner.nextInt();
        System.out.println("Masukkan bilangan kedua = ");
        bilangan_dua = scanner.nextInt();

        bilanganTerbesar(bilangan_satu, bilangan_dua);
        bilanganPangkat(bilangan_satu, bilangan_dua);
        bilanganKuadrat(bilangan_satu, bilangan_dua);

    }
    private static void bilanganTerbesar(int bil_satu, int bil_dua){
        if (bil_satu > bil_dua){
            System.out.println("bilangan terbesar = "+bil_satu);
            System.out.println("bilangan terkecil = "+bil_dua);
        }else {
            System.out.println("bilangan terbesar = "+bil_dua);
            System.out.println("bilangan terkecil = "+bil_satu);
        }
    }

    private static void bilanganPangkat(int bil_satu, int bil_dua){
        double hasilPangkat;
        hasilPangkat = Math.pow(bil_satu, bil_dua);
        System.out.println("Hasil Pangkat Bilangan "+bil_satu+" dengan Bilangan "+bil_dua+" adalah "+hasilPangkat);
    }

    private static void bilanganKuadrat(int bil_satu, int bil_dua){
        double hasilKuadratBilSatu, hasilKuadratBilDua;
        hasilKuadratBilSatu = bil_satu*bil_satu;
        hasilKuadratBilDua = bil_dua*bil_dua;
        System.out.println("Hasil Kuadrat bilangan satu = "+hasilKuadratBilSatu);

        System.out.println("Hasil Kuadrat bilangan dua = "+hasilKuadratBilDua);
    }
}
