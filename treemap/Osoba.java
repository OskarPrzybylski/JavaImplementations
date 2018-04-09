public class Osoba extends Wpis{
    private String imie;
    private String nazwisko;


    public Osoba(String numerk, String numer, String adres, String imie, String nazwisko){
        this.numer = new NrTelefoniczny(numer, numerk);
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.adres=adres;
    }

    public String opis(){
        return imie + " " + nazwisko + " " + adres + " tel: " + numer.toString();

    }   
    @Override
    public String toString() {
        return opis();
    }


}