package Day1Task;

public class NumberNine {
    public static void main(String[] args) {
        String test1 = "testing";
        System.out.println(NumberNine.strLength(test1));
    }

    public static int strLength(String str){
        char[] char_array = str.toCharArray();
        int count = 0;
        for ( char c : char_array){
            count++;
        }

        return count;
    }
}