package Day3Task;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberOne {
    public static void main(String[] args) {
        String test = "ibu ratna antar ubi";
        String test2 = "UFO tofu?";
        String test3 = "A nut for a jar of tuna.";
        String test4 = "Borrow or rob?";
        String test5 = "Was it a car or a cat I saw?";
        String test6 = "Yo, banana boy!";
        System.out.println(test + " adalah "+ isPalindrome(test));
        System.out.println(test2 + " adalah " + isPalindrome(test2));
        System.out.println(test3 + " adalah " + isPalindrome(test3));
        System.out.println(test4 + " adalah " + isPalindrome(test4));
        System.out.println(test5 + " adalah " + isPalindrome(test5));
        System.out.println(test6 + " adalah " + isPalindrome(test6));
    }

    public static boolean isPalindrome(String str){
        String newStr = str.replaceAll("[^a-zA-Z0-9\\\\s+]", "").toLowerCase();
        var intStream = IntStream.range(0, newStr.length() / 2)
                                            .noneMatch(item ->newStr.charAt(item) != newStr.charAt(newStr.length() - item - 1));

        return intStream;
    }

}
