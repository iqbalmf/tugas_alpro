import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka ?");
        int angka = input.nextInt();
        String bilangan;
        bilangan = (angka % 2) == 0 ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println(angka + " adalah " + bilangan);
    }
}