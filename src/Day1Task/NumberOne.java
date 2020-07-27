package Day1Task;

public class NumberOne {
    public static void main(String[] args) {
        int x = 64, y = 2;
        System.out.println(Penjumlahan(x, y));
        System.out.println(Pengurangan(x, y));
        System.out.println(Perpangkatan(x, y));
        System.out.println(Pengakaran(x, y));
        System.out.println(Pembagian(x, y));
        System.out.println(Perkalian(x, y));

    }

    public static int Penjumlahan(int x, int y){
        int results = x + y;
        return results;
    }
    public static int Pengurangan(int x, int y){
        int results = x - y;
        return results;
    }
    public static String Perpangkatan(int x, int y){
        int pangkatX = (int) Math.pow(x, 2);
        int pangkatY = (int) Math.pow(y, 2);
        String results = "Hasil dari " + x + " dan "+ y +" pangkat 2 adalah "+ pangkatX + " dan " + pangkatY;
        return  results;
    }
    public static String Pengakaran(int x, int y){
        int pangkatX = (int) Math.sqrt(x);
        int pangkatY = (int) Math.sqrt(y);
        String results = "Hasil dari " + x + " dan "+ y +" diakarkan adalah "+ pangkatX + " dan " + pangkatY;
        return  results;
    }
    public static int Pembagian (int x, int y){
        int results = x / y;
        return results;
    }
    public static int Perkalian (int x, int y){
        int results = x * y;
        return results;
    }
}
