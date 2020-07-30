package taskoop.soal1;

public class Unggas extends Hewan{
    public int umur;

    @Override
    public String statusHewan(){
        if ( umur < 1){
            return "belum siap diternakan";
        } else {
            return "siap diternakan";
        }
    }


}
