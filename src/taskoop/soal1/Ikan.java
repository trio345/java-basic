package taskoop.soal1;

public class Ikan extends Hewan{

    public Ikan(String nama, int umur, String jenis) {
        super(nama, umur, jenis);
    }

    public Integer hitungBerat(int bobot){

        int berat = this.getUmur() * bobot;
        return berat;
    }

    public Integer hitungBerat(int bobot, int kandunganAir){
        int umur = this.getUmur();
        int berat = (umur * bobot) - kandunganAir;
        return berat;
    }
}
