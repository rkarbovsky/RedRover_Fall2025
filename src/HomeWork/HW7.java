package HomeWork;

public class HW7 {
    public static void main(String[] args) {
        sum(2, 4);
        subtract(10, 5);
        multiply(4, 3);
        divide(12, 3);
        System.out.println(doubleInt(2));
        System.out.println(numberToString(100));
        System.out.println(findSmallestInt(new int[]{34, 15, 88, 2}));
        System.out.println(countingSheep(5));
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static int doubleInt(int i) {
        i = i * 2;
        return i;
    }


    public static boolean isLove(final int flower1, final int flower2) {
        boolean a = false;
        if (flower1 % 2 == 0 && flower2 % 2 == 1) {
            a = true;
        } else if (flower1 % 2 == 1 && flower2 % 2 == 1)
            a = false;
        return a;
    }

    public static String numberToString(int num) {
        return Integer.toString(num); // Return a string of the number here!
    }

    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

    public static String countingSheep(int num) {
            String s = "";
            if (num > 0) {
                for (int i = 1; i <= num; i++) {
                    s += i + " sheep...";
                }
            }
            return s;
    }
}
