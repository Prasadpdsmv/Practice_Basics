package practice.CollectionPrc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prcMainClass {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ravi", "IT", 60000, 28),
                new Employee(2, "Anita", "HR", 50000, 32),
                new Employee(3, "Kiran", "IT", 75000, 35),
                new Employee(4, "Meena", "Finance", 65000, 30),
                new Employee(5, "Arjun", "IT", 80000, 40)
        );

       // employees.forEach(System.out::println);
        employees.stream().filter(emp ->emp.getAge()>30).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(10, 20, 5, 15, 25, 30, 5);

        Stream<Integer> srm=numbers.stream().filter(n ->n%2==0);
        srm.forEach(System.out::println);
        //employees.stream().filter()
        employees.get(1).getAge();
        //employees.stream().filter(emp ->emp.getSalary()<70000).forEach(System.out::println);

        System.out.println("emplyees salary grater then");

        Stream<Employee>str=employees.stream().filter(emp ->emp.getSalary()<70000);
       // str.forEach(System.out::println);
        str.map(emp ->emp.getAge()).forEach(System.out::println);

    }
}
