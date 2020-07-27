package Day1Task;
import java.util.Scanner;

public class NumberFive {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Masukkan usia : ");
        int usia = scanner.nextInt();

        if (usia >= 21){
            System.out.println("DEWASA");
        } else if (usia >= 13){
            System.out.println("REMAJA");
        } else if (usia >= 9){
            System.out.println("BIMBINGAN ORANG TUA");
        } else {
            System.out.println("KURANG DARI 9");
        }
    }
}
