package model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class EmployeeBook {
    private Map<String, Employee> employees;
    Employee employee = new Employee();

    public EmployeeBook() {
        this.employees = new HashMap<>(Map.of(
                "Архипов Гордий Павлович", new Employee("Архипов Гордий Павлович", 1, 64900),
                "Соловьёв Федор Игоревич", new Employee("Соловьёв Федор Игоревич", 2, 80903),
                "Копылов Аполлон Авксентьевич", new Employee("Копылов Аполлон Авксентьевич", 3, 81128),
                "Королёв Ефим Тимофеевич", new Employee("Королёв Ефим Тимофеевич", 4, 90535),
                "Авдеев Руслан Витальевич", new Employee("Авдеев Руслан Витальевич", 5, 90725),
                "Иванова Наталия Сергеевна", new Employee("Иванова Наталия Сергеевна", 1, 75586),
                "Кондратьева Неонила Вячеславовна", new Employee("Кондратьева Неонила Вячеславовна", 2, 65770),
                "Доронина Ульяна Дмитриевна", new Employee("Доронина Ульяна Дмитриевна", 3, 85385),
                "Горбунова Женевьева Васильевна", new Employee("Горбунова Женевьева Васильевна", 4, 82519),
                "Казакова Грета Дамировна", new Employee("Казакова Грета Дамировна", 5, 91960)));
    }

    public void printAll() {
        System.out.println(employees.entrySet());
    }

    public void addEmployee(String id, String fullname, int department, int salary) {
        Employee employee = new Employee(fullname, department, salary);
        if (employees.containsKey(id)) {
            System.out.println("Employee already exists");
        } else {
            employees.put(id, employee);
            System.out.println(employees.get(id));
        }
    }

    public void removeEmployee(String id) {
        for (Map.Entry<String, Employee> pair : employees.entrySet()) {
            if (pair.getKey().equals(id)) {
                employees.remove(pair.getKey(), pair.getValue());
                System.out.println(pair.getValue());
            }
        }

    }

    public void findEmployee(String id) {
        if (employees.containsKey(id)) {
            System.out.println(employees.get(id));
        }
    }

    public void findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = employees.get(0);
        for (Employee element : employees.values()) {
            if (maxSalaryEmployee.getSalary() < element.getSalary()) {
                maxSalaryEmployee = element;
            }
        }
        System.out.println("Самая большая зарплата у " + maxSalaryEmployee.getFullname() + ". Она составляет " + maxSalaryEmployee.getSalary() + " рублей.");
    }

    public void employeeWithSalaryLessThanGiven(int number) {
        for (Employee employee : employees.values()) {
            if (employee.getSalary() < number) {
                System.out.println("ID: " + employee.getId() + ". ФИО: " + employee.getFullname() + ". Зарплата: " + employee.getSalary());
            }
        }
    }

    public void employeeWithSalaryMoreThanGiven(int number) {
        for (Employee employee : employees.values()) {
            if (employee.getSalary() > number) {
                System.out.println("ID: " + employee.getId() + ". ФИО: " + employee.getFullname() + ". Зарплата: " + employee.getSalary());
            }
        }
    }
    public Employee findEmployeeWithMaxSalaryInDepartment(int department) {
        Employee maxSalaryEmployee = null;
        for (Employee element : employees.values()) {
            if (department != element.getDepartment()) {
                continue;
            }
            if (maxSalaryEmployee == null || maxSalaryEmployee.getSalary() < element.getSalary()) {
                maxSalaryEmployee = element;
            }
        }
        System.out.println(maxSalaryEmployee);
        return maxSalaryEmployee;
    }
}

