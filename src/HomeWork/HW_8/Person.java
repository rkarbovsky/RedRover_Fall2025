package HomeWork.HW_8;

//Задача №1
//
//Необходимо создать класс Person с полями: имя, возраст, пол.
//Класс должен иметь метод - getName,
//метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и
//префикс “Mrs. ” если женский.

public class Person {


    public String name;
    public int age;
    char gender; //m or f


    public String getName(char gender) {
        String prefix = "";
        if (gender == 'm') {
            prefix = "Mr.";
        } else if (gender == 'f') {
            prefix = "Mrs.";
        } else {
            System.out.println("Неверно введён пол. Введите m для мужчины или f для женщины");
        }
        return prefix;
    }

    public static void main(String[] args) {
        Person man1 = new Person();
        man1.name = "Иванов";
        man1.age = 25;
        System.out.println(man1.getName('m') + man1.name);
        Person man2 = new Person();
        man2.name = "Петров";
        man2.age = 36;
        System.out.println(man2.getName('m') + man2.name);
        Person woman1 = new Person();
        woman1.name = "Сидорова";
        woman1.age = 29;
        System.out.println(woman1.getName('f') + woman1.name);
        Person woman2 = new Person();
        woman2.name = "Козлова";
        woman2.age = 49;
        System.out.println(woman2.getName('a') + woman2.name);
    }

}
