import java.util.Scanner;

public class tugas_personal_2 {

    private static int jumlahMK = 1;
    private static int jumlahSKS = 0;
    private static int jumlahPoin = 0;
    private static int[] sksMK = new int[10];
    private static String[] kodeMK = new String[10],
            namaMK = new String[10],
            gradeMK = new String[10];
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int cursor = 0;
        while (cursor != 4) {
            System.out.print("=================================================="
                    + "\nPendataan dan Perhitungan IPS (Indeks Prestasi Semester)"
                    + "\n1. Pendataan Matakuliah"
                    + "\n2. Perhitungan IPS"
                    + "\n3. Update Grade"
                    + "\n4. Keluar"
                    + "\nMasukan Pilihan Anda : ");
            cursor = input.nextInt();
            switch (cursor) {
                case 1:
                    pendataanMatakuliah();
                    break;
                case 2:
                    perhitunganIPS();
                    break;
                case 3:
                    updateGrade();
                    break;
            }
        }
    }

    private static void pendataanMatakuliah() {
        System.out.print("Masukan jumlah Matakuliah : ");
        jumlahMK = input.nextInt();
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("\nMasukan Kode Matakuliah  : ");
            kodeMK[i] = input.next();
            System.out.print("Masukan Nama Matakuliah  : ");
            namaMK[i] = input.next();
            System.out.print("Masukan Grade Matakuliah : ");
            gradeMK[i] = input.next();
            System.out.print("Masukan Jumlah SKS : ");
            sksMK[i] = input.nextInt();
        }
    }

    private static void perhitunganIPS() {
        System.out.println("Matakuliah yang anda ambil adalah : ");
        for (int i = 0; i < jumlahMK; i++) {
            hitungPoinSKS(gradeMK[i], sksMK[i]);
            System.out.println(kodeMK[i] + " " + namaMK[i] + "\t" + gradeMK[i]
                    + "\t" + sksMK[i]);
        }
        System.out.println("Nilai IPS Anda adalah " + hitungIPS());
    }

    private static void updateGrade() {
        System.out.print("Masukan Kode Matakuliah : ");
        String cari = input.next();
        System.out.print("Masukan Grade Baru : ");
        String grade = input.next();

        for (int i = 0; i < jumlahMK; i++) {
            if (kodeMK[i].equals(cari)) {
                gradeMK[i] = grade;
            }
        }
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println(kodeMK[i] + " " + namaMK[i] + "\t" + gradeMK[i]
                    + "\t" + sksMK[i]);
        }
    }

    private static void hitungPoinSKS(String grade, int sks) {
        int poin = 0;
        switch (grade) {
            case "A":
                poin = 4;
                break;
            case "B":
                poin = 3;
                break;
            case "C":
                poin = 2;
                break;
            case "D":
                poin = 1;
                break;
            case "E":
                poin = 0;
                break;
        }
        jumlahPoin = jumlahPoin + (poin * sks);
        jumlahSKS = jumlahSKS + sks;
    }

    private static double hitungIPS() {
        return Double.valueOf(jumlahPoin) / Double.valueOf(jumlahSKS);
    }

}