import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams1 {

    public static void main(String[] args) {
//        Given a list of integers, write a Java Stream to find the sum of all even numbers in the list.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int num = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(num);


//        Group a list of strings by their length:
        List<String> strings = Arrays.asList("apple", "banana", "orange", "pear");
        Map<Integer, List<String>> groups = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groups);






    }
}

