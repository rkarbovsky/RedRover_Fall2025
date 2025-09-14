package HomeWork.HW_8;
//Задача №3
//
//Необходимо создать класс Salary с единственным статическим методом - getSum(Employee[] employeeArray),
//метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
public class Salary {

    public static double getSum(Employee[] employeeArray) {
        double sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum = sum + employeeArray[i].monthlySalary;
        }
        return sum;
    }
}
