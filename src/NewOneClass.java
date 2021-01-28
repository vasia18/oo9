public class NewOneClass extends ObstractClass {
    int a;
    int b;
    int c;


    @Override
    public void summ() {
        System.out.println("Ничего нет");
    }

    public static int summ(int a, int b) {
        return a + b;
    }

    public static int summ(int a, int b, int c) {
        return a + b + c;
    }

    public static float summ(float a, float b, float c, float d) {
        return a + b + c - d;
    }
}
