import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streamsday2 {
    public static void main(String[] args) {

//
//        filters out any numbers that are less than 10, and then prints out the sum of the remaining numbers
        int[] numbers = {5, 12, 8, 17, 3, 21};
       int sum = Arrays.stream(numbers). filter(n->n<10).sum();
       System.out.println(sum);


//Problem: Given a list of words, count the total number of characters in all the words that have an even length.
        List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant", "frog");
         int count = words.stream().filter(s->s.length()%2 == 0).mapToInt(String::length).sum();
         System.out.println(count);

// Problem 2: Given a list of strings, find the longest string.
        String ans = words.stream().max((s1,s2)->s1.length() - s2.length()).orElse("");
        System.out.println(ans);
        //.max()returns optional if we dont write .orElsethrow it may throw null pointer exception


//    Problem 3: Given a list of integers, find the average of the squares of all the odd numbers.
        List<Integer> Numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Double avg = Numbers.stream().filter(n->n%2 !=0).mapToInt(n->n*n).average().orElse(0);
        System.out.println(avg);

//        Problem 4: Given a list of employees, find the top 5 highest paid employees.
        List<Employee> employees = Arrays.asList(
                new Employee("John", 100000),
                new Employee("Mary", 120000),
                new Employee("Bob", 90000),
                new Employee("Alice", 110000),
                new Employee("David", 130000),
                new Employee("Jane", 95000),
                new Employee("Mark", 115000),
                new Employee("Emily", 105000),
                new Employee("Mike", 125000),
                new Employee("Susan", 80000)
        );

        List<Employee> res = employees.stream().sorted((emp1, emp2)-> (int) (emp2.getSalary()-emp1.getSalary())).limit(5).collect(Collectors.toList());
        System.out.println(res);

//        Find the average salary of employees whose names start with 'M'.

        double avgsal = employees.stream().filter(emp->emp.getName().startsWith("M")).mapToDouble(Employee::getSalary).average().orElse(0);
        System.out.println(avgsal);

//     Problem 4   Find the top 3 highest paid employees and their names.
        List<Employee> resemp  = employees.stream().sorted((emp1, emp2)-> (int) (emp2.getSalary() - emp1.getSalary())).limit(3).collect(Collectors.toList());
        System.out.println(resemp);

//        Find the sum of salaries of all employees who earn more than the average salary.
       double avsal = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
       double totalempsum = employees.stream().filter(emp->emp.getSalary()>avgsal).mapToDouble(Employee::getSalary).sum();
       System.out.println(totalempsum);

//        Find the name of the employee with the highest salary.
        Optional<String> name = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).map(Employee::getName);
        if(name.isEmpty() == false){
            System.out.println(name);
        }else{
            System.out.println("no employee");
        }


    }
}
