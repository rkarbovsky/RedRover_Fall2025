package HomeWork;

public class PerformanceTest {
    public static void main(String[] args) {
        int iterations = 10_000_000;
        int testNumber = 12345;

        // Тест String.valueOf()
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            String s = String.valueOf(testNumber);
        }
        long time1 = System.currentTimeMillis() - start1;

        // Тест Integer.toString()
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            String s = Integer.toString(testNumber);
        }
        long time2 = System.currentTimeMillis() - start2;

        // Тест конкатенации
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            String s = testNumber + "";
        }
        long time3 = System.currentTimeMillis() - start3;

        // Тест String.format()
        long start4 = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            String s = String.format("%d", testNumber);
        }
        long time4 = System.currentTimeMillis() - start4;

        // Тест StringBuilder
        long start5 = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            String s = new StringBuilder().append(testNumber).toString();
        }
        long time5 = System.currentTimeMillis() - start5;

        System.out.println("String.valueOf(): " + time1 + " ms");
        System.out.println("Integer.toString(): " + time2 + " ms");
        System.out.println("Конкатенация (num + \"\"): " + time3 + " ms");
        System.out.println("String.format(): " + time4 + " ms");
        System.out.println("StringBuilder: " + time5 + " ms");
    }
}
