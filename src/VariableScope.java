public class VariableScope {
    private int x = 11; // Global Variable
    private int y = 33;

    public void method1(int x) {
        VariableScope t = new VariableScope();
        x = 22;
        y = 44;
        int z = 20; // Local Variable
        System.out.println("Global variable");
        System.out.println("variablescope.x: " + t.x);
        System.out.println("x: " + x);
        System.out.println("t.y: " + t.y);
        System.out.println("Local Variable");
        System.out.println("y: " + y);
        System.out.println("z: " + z);

    }

    public static void main(String args[]) {
        VariableScope t = new VariableScope();
        t.method1(5);

        System.out.println("Loop Variable");
        for (int x = 0; x < 4; x++) // x is a Loop Variable
        {
            System.out.println(x);
        }
    }
}
