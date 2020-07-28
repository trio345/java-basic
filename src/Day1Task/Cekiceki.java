package Day1Task;
import java.util.*;
import java.util.stream.*;

public class Cekiceki {
    public static void main(String[] args) {
        List<Integer> range = IntStream.rangeClosed(1, 1000)
                                    .boxed().collect(Collectors.toList());
        
        numberFour();
    }


    public static void numberFour() {
        var list = List.of("Aku", "bukanlah", "Superman", "Aku", "juga", "bisa", "nangis");
        var message = list.stream().distinct().collect(Collectors.joining(", "));
        System.out.println(message);
    }
    // public static boolean isPrime(Integer s){
    //     if (s < 2) return false;
    //     for ()
    // }
}