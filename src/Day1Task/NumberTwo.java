package Day1Task;


public class NumberTwo {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++){
            int num = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    num = num + 1;
                }
            }

            if (num == 2){
                System.out.println(i + " ");
            }
        }
        
    }
}
