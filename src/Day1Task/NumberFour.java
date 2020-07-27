package Day1Task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class NumberFour {

    public static void main(String[] args) {
        var list = List.of("Aku", "bukanlah", "Superman", "Aku", "juga", "bisa", "nangis");
        HashSet h = new HashSet(list);
        List arrayList = new ArrayList(h);
        var new_list = arrayList.stream().collect(Collectors.joining(" "));
        System.out.println(new_list);
    }
}
