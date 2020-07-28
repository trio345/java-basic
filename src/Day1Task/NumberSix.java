package Day1Task;

import java.util.stream.IntStream;

public class NumberSix {
    
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 1000)
                    .forEach(i -> System.out.println(i + " " + NumberSix.getTitle(i)));
        // System.out.println(num);
    }

    private static String getTitle(int input){
        if (input % 2 == 0){
            if (input % 100 == 0){
                return "Kelipatan Seratus";
            }else if (input % 8 == 0){
                return "Genap kelipatan delapan";
            }
            return "Genap";
        }else {
            if (input % 7 == 0){
                return "Ganjil kelipatan tujuh";
            }
            return "Ganjil";
        }
    }

}