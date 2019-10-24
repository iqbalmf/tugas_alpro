public class array_multidimens {
    public static void main(String[] args) {
        String[][] data = {
                {"Iqbal Fauzan", "Introduce Programming", "A"},
                {"Iqbal Fauzan", "Bisnis Proses", "A"},
                {"Iqbal Fauzan", "Indonesia", "A"}
        };

        int i, j;

        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; ) {
                System.out.println("");
                System.out.println("Nama : " + data[i][j++]);
                System.out.println("MataKuliah : " + data[i][j++]);
                System.out.println("Index Nilai : " + data[i][j++]);
            }
        }

    }

}