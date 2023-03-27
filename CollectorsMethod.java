import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectorsMethod {
    public static void main(String[] args) {
        //Sure, let's say we have the following list of Transaction objects:

        List<Transaction> transactions = Arrays.asList(
                new Transaction(1001, "USD", 500.0),
                new Transaction(1002, "EUR", 1000.0),
                new Transaction(1003, "USD", 1000.0),
                new Transaction(1004, "GBP", 500.0),
                new Transaction(1005, "EUR", 1000.0)
        );

//        toList()
//        toSet()
//        toMap()
//        joining()
//        counting()
//        summingInt()
//        averagingInt()
//        groupingBy()
//        partitioningBy()
//        reducing()
//        summarizingInt()
//        mapping()




//   Collectors.collect method
//      1  Collecting into a List
        List<Transaction> usdTransactions = transactions.stream().filter(t ->t.getCurrency().equals("USD")).collect(Collectors.toList());
//        2.Collecting into set
        Set<String> currencies = transactions.stream().map(Transaction::getCurrency).collect(Collectors.toSet());
  //    3. Collecting into map
        Map<String , List<Transaction>> result2  = transactions.stream().collect(Collectors.groupingBy(Transaction::getCurrency));

//        Partitioning:
//       1. Suppose you have a list of numbers as follows:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> res = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(res);
//        The result of this operation is a Map containing two keys: true and false.
//        The value associated with the true key is a list of even numbers [2, 4, 6, 8, 10],
//        and the value associated with the false key is a list of odd numbers [1, 3, 5, 7, 9].

//        Joining
//        The joining() method in the Collectors class is used to concatenate the strings from the stream of objects.
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        String res1 =  fruits.stream().collect(Collectors.joining(","));
        System.out.println(res1);
//        apple,banana,cherry

//        counting()
//The counting() method in the Collectors class is used to count the number of elements in a stream.
        List<String> fruit = Arrays.asList("apple", "banana", "cherry");
        int count = Math.toIntExact(fruit.stream().collect(counting()));
        System.out.println(count); //3

//        SummingInt()The summingInt() method in the Collectors class is used to calculate the sum of integer values in a stream.
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        int sum = number.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum); //15

//        The averagingInt() method in the Collectors class is used to calculate the average of integer values in a stream.
        double avg = number.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(avg);
//        3.0

//        The reducing() method in the Collectors class is used to perform a reduction operation on the elements of a stream.
//        It can be used to perform a variety of reduction operations, such as finding the minimum or maximum value,
//        calculating the sum or average of the elements, and concatenating strings, among others.
        int sum2 = numbers.stream()
                .collect(Collectors.reducing(0, (x, y) -> x + y));

        System.out.println(sum2);
//        55

        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");

        String concatenated = words.stream()
                .collect(Collectors.reducing("", (x, y) -> x + y));

        System.out.println(concatenated);
//       helloworldhowareyou


//        The summarizingInt() method is a terminal operation in the Stream API that returns a
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

//        long count = stats.getCount();
//        int sum = stats.getSum();
//        int min = stats.getMin();
//        int max = stats.getMax();
//        double avg = stats.getAverage();

        List<String> word = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
//        The mapping() collector is used to transform the elements of a stream before they are collected
        Map<Integer, List<Integer>> lengthToOccurrences = words.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.mapping(String::length, Collectors.toList())));

        System.out.println(lengthToOccurrences);
//        {5=[5, 6, 6], 6=[6, 9]}

    }
}
