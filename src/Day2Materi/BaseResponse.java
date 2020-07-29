package Day2Materi;

public class BaseResponse<T> {

    

    public static <T extends Comparable<T>> T max(T a, T b) {
        T max = a;

        if (b.compareTo(a) > 0) {
            max = b;
        }

        return max;
    }

    public static void main(String[] args) {
        Integer max = max(1, 3);
        String large = max("s", "m");

        System.out.println(max + " " + " large");

    }
}