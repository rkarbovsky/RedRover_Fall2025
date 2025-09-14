package HomeWork.HW_9_2;
//Задача №1
//
//Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
//метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.

public class Person {

    private String name;
    private int age;
    private char gender;

    public String getName() {
        if (gender == 'm') name = "Mr. " + name;
        if (gender == 'f') name = "Mrs. " + name;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Вячеслав");
        person1.gender = 'a';
        System.out.println(person1.getName());
    }
}
