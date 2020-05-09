public class CalculatorStiintific extends Calculator {

    public CalculatorStiintific(){

    }
    //Un nr ridicat la o putere
    public double ridicareLaPutere(int a, int b){
        return Math.pow(a,b); // am ridicat un numar la o putere
    }

    //radical dintr-un nr
    public double radical(int a){
        return Math.sqrt(a);
    }

    //Logaritm in baza 10 dintr-un nr
    public double logaritmBaza(int a){
        return Math.log10(a);
    }

    //Logaritm dintr-un numar
    public double logaritmNumar(int a){
        return Math.log(a);
    }
}
