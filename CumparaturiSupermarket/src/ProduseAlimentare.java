import java.util.Date;

public class ProduseAlimentare extends Produs {

    private String alergeni;
    private Date dateExpirare;

    public ProduseAlimentare(){

    }
    public ProduseAlimentare(String nume, int pret, String alergeni, Date dateExpirare){
       this.alergeni= alergeni;
       this.dateExpirare= dateExpirare;
       this.nume= nume;
       this.pret= pret;
    }

    public String getAlergeni() {
        return alergeni;
    }

    public Date getDateExpirare() {
        return dateExpirare;
    }
}
