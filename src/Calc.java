public abstract class Calc {


    public static int Sum(int x1, int x2) {
        System.out.println(x1 + x2);
        return x1 + x2;
    }

    public static int difference(int x1, int x2) {
        System.out.println(x1 - x2);
        return x1 - x2;
    }

    public static int product(int x1, int x2) {
        System.out.println(x1 * x2);
        return x1 * x2;
    }

    public static int divergence(int x1, int x2) {
        System.out.println(x1 / x2);
        return x1 / x2;
    }

    public static int power(int x1) {
        System.out.println(x1 * x1);
        return x1 * x1;
    }

    public static int root(int x1) {
        for (int i = 1; i < x1; i++) {
            if (i * i == x1) {
                System.out.println(i);
                return i;
            } else {
                return 1;
            }
        }
        return 1;
    }
}
