import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Streams2 {
    public static void main(String[] args) {
        //Sure, let's say we have the following list of Transaction objects:

        List<Transaction> transactions = Arrays.asList(
                new Transaction(1001, "USD", 500.0),
                new Transaction(1002, "EUR", 1000.0),
                new Transaction(1003, "USD", 1000.0),
                new Transaction(1004, "GBP", 500.0),
                new Transaction(1005, "EUR", 1000.0)
        );
//   Collectors.collect method
//      1  Collecting into a List
        List<Transaction> usdTransactions = transactions.stream().filter(t ->t.getCurrency().equals("USD")).collect(Collectors.toList());
//        2.Collecting into set
        Set<String> currencies = transactions.stream().map(Transaction::getCurrency).collect(Collectors.toSet());
  //    3. Collecting into map
        Map<String , List<Transaction>> result2  = transactions.stream().collect(Collectors.groupingBy(Transaction::getCurrency));

    }
}
