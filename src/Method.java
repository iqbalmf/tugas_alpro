import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai(1-10) = ");
        input = new Scanner(System.in);
        int nilai = input.nextInt();
        index(nilai);
    }

    //methode dengan return
    private static String penghitungan(int nilai){
        String index = "";
        if (nilai <= 5 && nilai > 0){
            index = "TIdak Naik Kelas!";
        }else if (nilai >5 && nilai <= 10){
            index = "Naik Kelas";
        }else {
            index = "system tidak dapat membaca";
        }
        return index;
    }

    //method tanpa return
    private static void index(int nilai){
        System.out.println(penghitungan(nilai));
    }
}
