import java.util.Scanner;

public class Forum5_repetition {
    public static void main(String[] args) {
        System.out.println("1. Repetition ");
        System.out.println("2. Jump Operation ");
        System.out.print("Pilih Nomor : ");
        Scanner input = new Scanner(System.in);
        int diskusi = input.nextInt();
        System.out.print("Masukan bilangan = ");
        input = new Scanner(System.in);
        int bil = input.nextInt();
        switch(diskusi){
            case 1:
                repetition(bil);
                break;
            case 2:
                jumpOperation(bil);
                break;
            default:
                System.out.println("Nomor tidak ada");
        }
    }

    private static void repetition(int bil){
        for (int i = 1; i <= bil; i++) {
            System.out.println("Hallo saya Iqbal ke - "+i);
        }
    }

    private static void jumpOperation(int num) {
        for (int i = 1; i <= num; i++) {
            if (i == 5)
                continue;
            System.out.println("Angka ke- "+i);
        }
    }
}
