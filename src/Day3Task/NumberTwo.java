package Day3Task;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberTwo {
    public static void main(String[] args) {
        var lyric = "Aku ingin begini\n" +
                "Aku ingin begitu\n" +
                "Ingin ini itu banyak sekali\n\n" +
                "Semua semua semua\n" +
                "Dapat dikabulkan\n" +
                "Dapat dikabulkan\n" +
                "Dengan kantong ajaib\n\n" +
                "Aku ingin terbang bebas\n" +
                "Di angkasa\n" +
                "Hei… baling baling bambu\n\n" +
                "La... la... la...\n" +
                "Aku sayang sekali\n" +
                "Doraemon\n\n" +
                "La... la... la...\n" +
                "Aku sayang sekali";

        System.out.println(countWord(lyric, "aku"));
        System.out.println(countWord(lyric, "ingin"));
        System.out.println(countWord(lyric, "la..."));
    }

    private static Long countWord(String str, String word){
        String new_str = str.replace("\n", " ").toLowerCase();
        var data = Arrays.stream(new_str.split(" ")).filter(item -> item.equalsIgnoreCase(word)).count();

        return data;
    }

}
