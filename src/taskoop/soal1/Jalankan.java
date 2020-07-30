package taskoop.soal1;

public class Jalankan {

    public static void main(String[] args) {
        var unggas = new Hewan("merpati", 1, "vertebrata");
        var reptil = new Hewan();
        reptil.setNama("buaya");
        reptil.setUmur(2);
        reptil.setJenis("vertebrata");

        System.out.println(unggas.profileHewan());
        System.out.println(reptil.profileHewan());


        var murai = new Unggas();
        murai.setNama("murai");
        murai.setUmur(6);
        murai.setJenis("vertebrata");
        System.out.println(murai.profileHewan());
        System.out.println(murai.statusHewan());

        var tengiri = new Ikan("tengiri laut", 3, "vertebrata");

        System.out.println(tengiri.profileHewan());
        System.out.println(tengiri.statusHewan());
        System.out.println(tengiri.hitungBerat(10));
        System.out.println(tengiri.hitungBerat(10, 5));


    }
}
