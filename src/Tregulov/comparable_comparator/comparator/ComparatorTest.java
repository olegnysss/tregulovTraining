package Tregulov.comparable_comparator.comparator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparatorTest {

    @Test
    public void testComparable() {
        // create an ArrayList of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 50000));
        employees.add(new Employee("Bob", 40, 60000));
        employees.add(new Employee("Charlie", 25, 40000));

        // sort the ArrayList using the List.sort() method
        System.out.println(employees);
        employees.sort(new EmployeeSalaryComparator());
        System.out.println(employees);

        // assert that the employees are sorted by salary in descending order
        assertEquals("Bob", employees.get(0).getName());
        assertEquals("Alice", employees.get(1).getName());
        assertEquals("Charlie", employees.get(2).getName());
    }
}

class EmployeeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee2.getSalary() - employee1.getSalary();
    }
}

class Employee {
    private final String name;
    private final int age;
    private final int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", salary=" + salary +
            '}';
    }
}
