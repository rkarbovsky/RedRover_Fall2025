package HomeWork;

public class HW2 {

    //Задача №1
    //
    //Необходимо создать целочисленные переменные a и b,
    // присвоить произвольные значения переменным на ваш выбор
    // и вывести результаты следующих операций с этими переменными:
    // сложение, умножение, вычитание, деление и остаток от деления.
    // Также сделать проверку на четность этих переменных и вывести результат.

    public static void main(String[] args) {

        int a = 8, b = 5;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " % " + 2 + " = " + (a % 2));
        System.out.println(b + " % " + 2 + " = " + (b % 2));

        //Задача №2
        //
        //Необходимо создать целочисленные переменные a и b,
        // присвоить им произвольные значения, а потом поменять значения местами
        // (значение переменной a должно оказаться в переменной b и наоборот).

        int c;
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);

        //Задача №3
        //
        //Создать программу дележа добычи на пиратском корабле.
        // По обычаю, половина добычи идет владельцу корабля,
        // половина оставшегося — капитану,
        // остальное делится поровну между всеми членами команды, включая капитана.
        //
        //Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
        //
        //Вывести на экран кому сколько пиастров полагается
        //Сколько получит капитан (Джек Воробей, естественно),
        // если он утверждает, что корабль принадлежит ему?

        int pirate = 68;
        int loot = 4860;
        int owner = loot / 2;
        System.out.println("Owner loot: " + owner);
        int captain = loot / 4;
        System.out.println("Captain loot: " + captain);
        int pirateShare = loot / 4 / pirate;
        System.out.println("Each pirate loot: " + pirateShare);
        System.out.println("Captain Jack Sparrow loot: " + (owner + captain + pirateShare));
    }
}
