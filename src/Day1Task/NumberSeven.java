package Day1Task;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NumberSeven {
    static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("dari tahun : ");
        int start = scan.nextInt();
        System.out.println("sampai tahun :");
        int end = scan.nextInt();

        IntStream.rangeClosed(start, end)
                .forEach(i -> System.out.println(isLeapYear(i)));
    }

    public static String isLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 || year % 100 == 0){
            return year + " adalah tahun kabisat";
        } else {
            return year + " bukan tahun kabisat";
        }
        
    }

}