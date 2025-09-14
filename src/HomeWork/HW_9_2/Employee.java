package HomeWork.HW_9_2;

//Задача №2
//
//Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
//Класс должен иметь метод isSameName(Employee employee) который возвращает true,
//если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.

import java.util.Objects;

public class Employee extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isSameName(Employee employee) {
        return (this.getName().equals(employee.getName()));
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Людмила");
        employee1.setSalary(100);
        Employee employee2 = new Employee();
        employee2.setName("Валентина");
        employee2.setSalary(150);
        Salary salary = new Salary();
        Employee[] employees = new Employee[]{
                employee1,
                employee2
        };

        System.out.println(employee1.isSameName(employee2));
        System.out.println(salary.getSum(employees));
    }

}
