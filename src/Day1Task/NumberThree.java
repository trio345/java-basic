package Day1Task;

import java.util.Scanner;

public class NumberThree {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Masukkan angka : ");
        int input = scanner.nextInt();
        if (input % 2 == 1) {
            if (input % 5 == 0) {
                System.out.println("Imperio Aberto");
            } else {
                System.out.println("Imperio");
            }
        } else {
            if ( input % 4 == 0) {
                System.out.println("Crucio Reducto");
            }else {
                System.out.println("Crucio");
            }
        }
    }
}
