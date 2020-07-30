package taskoop.soal1;

public class Hewan {
    private String nama = "", jenis = "";
    private int umur;

    // 2
    public Hewan() {}

    // 4
    public Hewan(String nama,int umur, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // -- start 3 --
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    // -- end 3--

    // 5
    public String profileHewan() {
        return "Nama : " + nama + " Umur: "+ umur + " Jenis: "+ jenis;
    }

    // ---soal 2---

    public String statusHewan(){
        try {
            if ( umur < 1 ){
                return "belum siap diternakan";
            } else if (umur <= 4){
                return "siap diternakan";
            } else {
                return "hewan sudah tua";
            }
        } catch (Exception e){
            return e.getMessage();
        }
    }
}
