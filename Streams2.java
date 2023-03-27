import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
//        The groupingBy() method groups the transactions by their currency using the Transaction::getCurrency method reference. This results in the following intermediate map:

        Map<String, List<Transaction>> result = transactions.stream().collect(Collectors.groupingBy(Transaction :: getCurrency));
        System.out.println(result);
        // group currency by sum



    }
}
