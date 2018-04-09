public class Firma extends Wpis{
    private String nazwa;


    public Firma(String numerk, String numer, String adres, String nazwa){
        this.numer = new NrTelefoniczny(numer, numerk);
        this.nazwa=nazwa;
        this.adres=adres;
    }



    public String opis(){
        return nazwa + " " + adres + " tel: " + numer.toString();
    }

    @Override
    public String toString() {
        return opis();
    }



}