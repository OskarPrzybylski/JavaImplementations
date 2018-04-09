import java.util.Set;
import java.util.TreeMap;
import java.util.*;

public class ObjectList{

    public static void main(String[] args){

     Osoba osoba1 = new Osoba("0047", "733839177", "Kwiatowa 1", "Oskar", "Przybylski");
     Osoba osoba2 = new Osoba("0048", "733839542", "Kwiatowa 10", "Mateusz", "Przybylski");
     Osoba osoba3 = new Osoba("0047", "733842131", "Kwiatowa 25", "Oskar", "Kemokał");
     Firma firma1 = new Firma("0045", "123214123", "Rybna 21", "Oskars");
     Firma firma2 = new Firma("0041", "123457745", "Rybna 77", "Renhold");
     Firma firma3 = new Firma("0032", "123285432", "Rybna 12", "Service");

     TreeMap<NrTelefoniczny,Wpis> tm = new TreeMap();
     tm.put(osoba1.numer, osoba1);
     tm.put(osoba2.numer, osoba2);
     tm.put(osoba3.numer, osoba3);
     tm.put(firma1.numer,firma1);
     tm.put(firma2.numer,firma2);
     tm.put(firma3.numer,firma3);

     Set set = tm.entrySet();

     Iterator i = set.iterator();
     System.out.println("ELEMENTS LIST: ");
     while(i.hasNext()) {
        Map.Entry me = (Map.Entry)i.next();
        System.out.print(me.getKey() + ": ");
        System.out.println(me.getValue());


     }
     

    }


}