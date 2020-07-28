package Day1Task;
import java.util.*;
import java.util.stream.Collectors;


public class NumberTen {
    public static void main(String[] args) {
        var numbers = List.of(3, 1, 7, 4, 5, 6, 8, 2);
        var indices = List.of(8, 7, 2, 8, 2, 6);
        
        var new_list = numbers.stream().filter(indices::contains).collect(Collectors.toList());
        System.out.println(new_list);
    }
}