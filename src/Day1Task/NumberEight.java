package Day1Task;
import java.util.*;

public class NumberEight {
    public static void main(String[] args){
        var numbers = List.of(3, 1, 7, 4, 5, 6, 8, 2);
        System.out.println(NumberEight.CountList(numbers));
    }

    public static Integer CountList(List<Integer> numbers){
        int sum = numbers.stream().reduce(0, Integer::sum) - Collections.max(numbers);
        return sum;
    }
}

