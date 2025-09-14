package HomeWork.HW_8;

public class TaxPayment {
    String name;
    int incomeTaxAmount;

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов", 5750, 1),
                new Employee("Петров", 28000, 3),
                new Employee("Сидоров", 2000, 0),
                new Employee("Алексеев", 12000, 2),
        };
        TaxPayment.calculateTax(employees);
        System.out.println();
        System.out.println(Salary.getSum(employees));
    }

    public static void calculateTax(Employee[] employees) {
        double tax = 0.0;
        for (Employee emp : employees) {
            if (emp.monthlySalary > 10000) {
                tax = emp.monthlySalary * 0.28 - emp.numberOfChildren * 1000;
                System.out.println("Сотрудник " + emp.name + " должен оплатить налога на сумму " + tax + " рублей.");
            } else if (emp.monthlySalary >= 5000 && emp.monthlySalary <= 10000) {
                tax = emp.monthlySalary * 0.18 - emp.numberOfChildren * 1000;
                System.out.println("Сотрудник " + emp.name + " должен оплатить налога на сумму " + tax + " рублей.");
            } else {
                tax = emp.monthlySalary * 0.13 - emp.numberOfChildren * 1000;
                System.out.println("Сотрудник " + emp.name + " должен оплатить налога на сумму " + tax + " рублей.");
            }
        }
    }
}
