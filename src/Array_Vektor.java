import java.util.Vector;

public class Array_Vektor {
    public static void main(String[] args) {
        contohArray();
        contohVector();
    }

    private static Vector vector = new Vector();
    private static int[] arraydata = new int[5];//inisialisasi jumlah index array

    private static void contohArray() {
        System.out.println("Contoh penggunaan dari Array : ");
        int val = 0;
        for (int i = 0; i < arraydata.length; i++) {
            val = val + 10;
            arraydata[i] = val;
            System.out.println("Data ke " + i + " adalah :" + arraydata[i]);
        }
    }

    private static void contohVector() {
        vector.addElement("Iqbal");
        vector.addElement("Fauzan");
        System.out.println("Contoh penggunaan dari Vector");
        System.out.println("Jumlah Vector : "+vector.size());
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Data ke- "+i+" adalah "+vector.get(i).toString());
        }
    }

}
