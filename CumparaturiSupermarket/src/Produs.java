public class Produs {

    //Dam mereu un parametru atributelor
    // atribute si comportamente
   protected String nume;
   protected int pret;

    public Produs(){ //Facem mereu un parametru default

    }
    public Produs(String nume, int pret){
        this.nume= nume;
        this.pret= pret;
    }

    //metoda care te lasa sa le scoti in afara altor metode (getter si setter)
    public String getNume(){
        return nume;

    }
    public int getPret(){
        return pret;

    }

}
