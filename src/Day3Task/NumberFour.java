package Day3Task;

import java.io.*;

public class NumberFour {
    public static void main(String[] args) {
        readData();
    }

    private static void readData(){
//        JSONParser jsonParser = new JSONParser();
        try {
            Object data = new FileReader("data.json");
            System.out.println(data);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

}
