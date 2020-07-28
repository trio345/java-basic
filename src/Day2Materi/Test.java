package Day2Materi;
import java.io.FileInputStream;
import java.util.*;
import java.util.stream.*;

public class Test {
    public static void main(String[] args) {
        try{
            // var inputStream = new FileInputStream("src/Day2Materi/app.log");
        } catch (Exception e){

        }
    }

    private static void numberFive(){
        var age = (int) (Math.random() * 29) + 1;
        // Tenarry
        // var tenn = 
        if (age >= 21) System.out.println("DEWASA");
        else if (age >= 13) System.out.println("REMAJA");
        else if (age >= 9) System.out.println("Bimbingan Orang Tua");
        else System.out.println("SEMUA USIA");
    }

    private static void switchCase(){
        var level = (int) (Math.random() * 4) + 1;
        switch(level){
            case 1 :
             System.out.println("High");
             break;
            case 2 :
             System.out.println("Medium");
             break;
            default :
            System.out.println("Low");
        }
    }

    // array immutable ga bisa diubah
    // arraylist mutable bisa ditambah dan dikurangi
    private static void arrayTest(){
        String[] stringArray = {"Satu", "Dua"};
        stringArray[0] = "One";

        for (String string : stringArray) {
            System.out.println(string);
        
        }
    }

    private static void arrayList(){
        var arrayList = new ArrayList<String>();
        var list = List.of("Hay", "Hola");
        arrayList.add("Hello");
        arrayList.addAll(List.of("Hay", "Hola", "Woy"));

        arrayList.remove(0);
        arrayList.remove("Woy");
        arrayList.removeAll(list);

        arrayList.clear();
    }

    // private static void hasMap(){
    //     var post = new HashMap<String, Object>();
    //     post.put("userId", 1);
    //     post.put("id", 1);
    //     post.put("title", "lorem ipsum");
    //     post.put("body", "dolor sit amet since 1990");

    //     System.out.println(post);
    // }

    private static class PostModel {
        String title, body;
        int userId, id;

        public PostModel(String title, String body, int userId, int id){
            this.title = title;
            this.body = body;
            this.userId = userId;
            this.id = id;
        }

        
    }
}