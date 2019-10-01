public class no3 {
    public static void main(String[] args) {
        int a = 10, b = 2, c = 4, d;
        d = a & b + a++ * c;
        System.out.println("Nilai D = " + d);

        d = ++a % b | c;
        System.out.println("Nilai D = " + d);

        d = a++ % b-- * ++c;
        System.out.println("Nilai D = " + d);

        d = c & b / a;
        System.out.println("Nilai D = " + d);
    }
}
