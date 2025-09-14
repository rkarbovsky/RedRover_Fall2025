package HomeWork;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        //Задача № 1
        //
        //Вы ведете записи наивысшей дневной температуры. Найдите самый жаркий день. Найдите второй самый жаркий.
        int[] array1 = {32, 33, 34, 31, 29, 29, 26, 33, 34};
        int min = Integer.MAX_VALUE;
        int lastMin = Integer.MAX_VALUE;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < min) {
                lastMin = min;
                min = array1[i];
            }
            if (lastMin < min) {
                lastMin = array1[i];
            }
        }

        System.out.println("Минимальная температура - " + min);
        System.out.println("Предыдущая минимальная температура - " + lastMin);

        //Задача № 2
        //
        //У вас есть список адресов электронной почты.
        //Найдите все адреса с доменом gmail.com. Адреса поддельных сайтов типа myrealgmail.com не учитывать.
        //Найти самый короткий и самый длинный адреса.
        //Проверить, нет ли адресов с юзернеймом admin

        String[] emails = {"hetavo_foco44@gmail.com",
                "zuzu_gafeba85@gmail.com",
                "zinu_gulaxu3@gmail.com",
                "suyulas_agu92@gmail.com",
                "wufaga-cijo46@gmail.com",
                "fapudub_ono62@gmail.com",
                "nav-emabika31@yand.com",
                "admin@gmail.com",
                "wop_iralegu22@gmail.com",
                "pipufe_zamo82@gmail.com"};
        int max = Integer.MIN_VALUE;
        String minAdress = null;
        String maxAdress = null;
        for (int i = 0; i < emails.length; i++) {
            if (emails[i].contains("@gmail.com")) {
                System.out.println("Адрес с доменом @gmail.com - " + emails[i]);
            }
            if (emails[i].contains("admin")) {
                System.out.println("Адрес с юзернеймом admin - " + emails[i]);
            }
            if (emails[i].length() < min) {
                min = emails[i].length();
                minAdress = emails[i];
            }
            if (emails[i].length() > max) {
                max = emails[i].length();
                maxAdress = emails[i];
            }

        }
        System.out.println("Самый короткий адрес " + minAdress + " длиной  " + min + " символа");
        System.out.println("Самый длинный адрес " + maxAdress + " длиной " + max + " символа");
        System.out.println();
        System.out.println("-------------------------");

        //Задача № 3
        //
        //Создайте двумерный массив 5х5, заполните его какими-нибудь числами.
        //
        //Напечатайте его таким образом, чтобы он сохранял форматирование (колонки были выровнены),
        //если числа в нем будут любыми от -99 до 999.

        int[][] array = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int) (Math.random() * 1099) - 99;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(String.format("%5d", array[i][j]));
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        //Задача № 4
        //
        //Возьмите массив из предыдущей задачи, и выведите в одну строку все числа,
        //лежащие на его диагонали от верхнего левого угла до нижнего правого.
        //В другой строке — числа на другой диагонали, от верхнего правого до нижнего левого углов.

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("-------------------------");

        //Задача № 5
        //
        //Возьмите массив из предыдущей задачи, или любой другой квадратный массив (матрицу).
        //Зеркально преобразуйте его вокруг диагонали от верхнего левого до нижнего правого угла.
        // Например, если был массив
        //3 5 7
        //1 4 6
        //9 2 8
        //
        //то после преобразования он должен выглядеть так:
        //3 1 9
        //5 4 2
        //7 6 8

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        //Задача № 6
        //Дана строка:
        //I’m just 16,
        //going on	17!
        //
        //(перед 17 стоит Tab, а не пробел). В принципе это может быть ЛЮБАЯ строка,
        //содержащая латинские буквы в верхнем и нижнем регистре, цифры, знаки препинания.
        //
        //Найти, сколько в этой строке заглавных букв, сколько прописных, сколько гласных, сколько согласных,
        // сколько цифр, сколько знаков препинания, сколько “пробельных” символов
        // (в них входят пробелы, символы табуляции, перевод строки и пр. Поищите “whitespace characters”).
        //
        //Имейте в виду, что некоторые проверки можно делать легче, чем другие. Поэкспериментируйте.

        String str = "I’m just 16,\ngoing on\t17!";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        int countOfConsonants = 0;
        String vowels = "aeiouAEIOU";
        int countOfVowels = 0;
        String numbers = "1234567890";
        int countOfNumbers = 0;
        String punctuations = ".,!?;:'\"-()[]{}<>/\\|@#$%^&*_~`";
        int countOfPunctuations = 0;
        int countOfWhiteSpaces = 0;
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (consonants.indexOf(s) != -1) {
                System.out.println("Согласная - " + s);
                countOfConsonants++;
            }
            if (vowels.indexOf(s) != -1) {
                System.out.println("Гласная - " + s);
                countOfVowels++;
            }
            if (numbers.indexOf(s) != -1) {
                System.out.println("Цифра - " + s);
                countOfNumbers++;
            }
            if (punctuations.indexOf(s) != -1) {
                System.out.println("Знак препинания - " + s);
                countOfPunctuations++;
            }
            if (Character.isWhitespace(s)) {
                countOfWhiteSpaces++;
            }
        }
        System.out.println("Количество согласных: " + countOfConsonants);
        System.out.println("Количество гласных: " + countOfVowels);
        System.out.println("Количество цифр: " + countOfNumbers);
        System.out.println("Количество знаков препинания: " + countOfPunctuations);
        System.out.println("Количество “пробельных” символов: " + countOfWhiteSpaces);

        //Задача № 7
        //Напишите код, который будет проверять, насколько трудно подобрать пароль.
        //Чтобы пройти проверку, пароль должен быть не менее 8 символов, содержать как минимум:
        //заглавную латинскую букву
        //строчную латинскую букву
        //цифру
        //знак препинания из списка: ~@#$%^&*()_-+=
        //и не иметь пробелов и символов НЕ упомянутых в этом перечислении.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        // Все разрешенные символы
        String allowedPunctuation = "~@#$%^&*()_-+=";
        String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "0123456789" +
                allowedPunctuation;
        boolean foundChar = false;
        boolean foundDigit = false;
        boolean foundPunctuation = false;

        if (password.length() < 8) {//проверка на длину пароля
            System.out.println("Пароль должен содержать не менее 8 символов. Повторите ввод");
            return;
        }

        if (password.contains(" ")) {//проверка на пробелы
            System.out.println("Пароль не должен содержать пробелы. Повторите ввод");
            return;
        }
        // Перебираем все символы в password
        for (int i = 0; i < password.length(); i++) {
            char p = password.charAt(i);

            if (allowedChars.indexOf(p) == -1) {


            }
        }
    }
}
