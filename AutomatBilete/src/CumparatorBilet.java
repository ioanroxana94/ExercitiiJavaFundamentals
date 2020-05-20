public class CumparatorBilet {
    String nume;
    int bani;

    public CumparatorBilet(String nume, int bani ){
        this.nume=nume;
        this.bani= bani;

    }
    public String getNume(){
        return nume;
    }
    public int getBani(){
        return bani;
    }

    public int tranzactieBilet() {
        int baniDdePlatit=0;
        if (baniDdePlatit > bani) {
            System.out.println("Nu avem destui bani");
            baniDdePlatit++;

        } else {
            this.bani -= baniDdePlatit;  // banii pe care ii avem in portofel minus banii pe care trebuie sa ii dam.
            System.out.println("Mai avem atatia bani: " + bani + " lei");
        }
        return baniDdePlatit;
    }

}
