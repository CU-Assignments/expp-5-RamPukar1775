import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - Age: " + age + ", Salary: " + salary;
    }
}

public class exp5a {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Alice", 30, 50000),
                new Employee("Bob", 25, 60000),
                new Employee("Charlie", 35, 55000)));

        // Sorting by name
        employees.sort(Comparator.comparing(emp -> emp.name));

        // Sorting by age
        employees.sort(Comparator.comparingInt(emp -> emp.age));

        // Sorting by salary
        employees.sort(Comparator.comparingDouble(emp -> emp.salary));

        // Printing sorted list
        employees.forEach(System.out::println);
    }
}
