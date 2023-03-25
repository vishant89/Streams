import java.util.Arrays;
import java.util.List;

public class Streams1 {

    public static void main(String[] args) {
//        Given a list of integers, write a Java Stream to find the sum of all even numbers in the list.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      int num =  numbers.stream().filter(n->n%2 == 0).mapToInt(Integer::intValue).sum();
      System.out.println(num);


    }

}
