package Day3Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberFive {



    public static void main(String[] args) throws IOException {
        String path = "products.csv";

        String[] headers = headers(path);

        List<Map<String, String>> result = null;

        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            result = stream
                    .skip(1) // skip headers
                    .map(line -> line.split(","))
                    .map(data -> {
                        Map<String, String> map = new HashMap<>();
                        for (int i = 0; i < data.length; i++) {
                            map.put(headers[i], data[i]);
                        }
                        return map;
                    })
                    .collect(Collectors.toList());
            System.out.println(result);
        }
    }
    static String[] headers(String path) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine().split(",");
        }

    }

//    private  static



}
