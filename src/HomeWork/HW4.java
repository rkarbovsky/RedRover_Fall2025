package HomeWork;

import java.util.Arrays;

public class HW4 {

    public static void main(String[] args) {

        //Задача №1
        //
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести все нечетные числа из массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }

        }

        //Задача №2
        //
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести все значения массива больше 5.

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                System.out.println(array[i]);
            }
        }

        //Задача №3
        //
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо увеличить все значения массива на 15.

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + 15);
        }

        //Задача №4
        //
        //Дана строка:
        //String s = “Перестановочный алгоритм быстрого действия”;
        //необходимо вывести все буквы “о” из этой строки.
        //Для указанной строки ответ будет “ооооо” (или в столбик)

        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            char targetO = 'о';
            if (s.charAt(i) == targetO) {
                System.out.print(targetO);
            }
        }
        System.out.println();

        //Задача №5
        //
        //Дана строка:
        //String s = “Перевыборы выбранного президента”;
        //необходимо подсчитать количество букв “е” в строке.
        //Для указанной строки ответ будет 4.

        String str = "Перевыборы выбранного президента";
        int count = 0;
        char targetE = 'е';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetE) {
                count++;
            }
        }
        System.out.println(count);

        //Задача №6
        //
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести сумму всех значений массива

        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int k : arr) {
            sum += k;
        }
        System.out.println(sum);

        //Задача №7
        //(немного подумать придется)
        //
        //Возвращаясь к маньяку со спичками с лекции.
        //
        //Имеется 20 коробок спичек. Найти все коробки, количество спичек в которых
        //отличается от среднего количества больше, чем на 3.
        //Например, если есть следующие данные:
        //60, 59, 58, 59, 64, 60,
        //то среднее количество будет чуть меньше 60. Соответственно,
        // коробка с 64 спичками будет сильно отличаться от среднего.

        int[] box = {60, 59, 58, 59, 64, 60, 61, 68, 62, 55, 59, 59, 61, 54, 62, 58, 57, 66, 62, 60};
        int summa = 0;
        double averageSum;
        for (int j : box) {
            summa += j;
        }
        averageSum = summa * 1.0 / box.length;
        System.out.println("Среднее количество спичек " + "в " + box.length + " коробках: " + averageSum);

        for (int i = 0; i < box.length; i++) {
            if (box[i] > averageSum + 3) {
                System.out.println(box[i]);
            }

        }
    }
}
