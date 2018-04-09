public class NrTelefoniczny implements Comparable<NrTelefoniczny>{

    public String nrTelefonu;
    public String nrKierunkowy;


    public NrTelefoniczny(String nrTelefonu, String nrKierunkowy){
        this.nrTelefonu=nrTelefonu;
        this.nrKierunkowy=nrKierunkowy;
    }

    public String toString(){
        return nrKierunkowy + nrTelefonu;
    }




    public int compareTo(NrTelefoniczny other){
        if(this.nrTelefonu.equals(other.nrTelefonu)){
            return 0;
        }
        else{
            return 1;
        }
    }

}