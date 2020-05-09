import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    //Sa se modeleze comportamentul unui calculator simplu (adunare, scadere, inmultire si impartire)
    //Calculatorul sa fie reprezentat folosind programare orientata obiect
    public static void main(String[] args) {

        Calculator calculator= new Calculator();

        System.out.println("Rezultatul adunarii este " + calculator.adunare(5,10));
        System.out.println("Rezultatul scaderii este " + calculator.scadere(10,5));
        int inmultire= calculator.inmultire(2,2);
        System.out.println("Rezultatul inmultirii este " + inmultire);
        int impartire= calculator.impartire(4,2);
        System.out.println("Rezultatul impartirii este " + impartire);

        // De aici citim valorile de la tastatura
        // Obiectul care ne ajuta sa facem asta se numeste "Scanner"

        Scanner scanner = new Scanner(System.in);

        //Citeste primul numar de la atstatura
        System.out.println("Va rugam introduceti primul numar: ");
        int primulNumar= scanner.nextInt();

        //Citeste al 2-lea numar de la tastatura
        System.out.println("Va rugam introduceti al 2-lea numar: ");
        int alDoileaNumar= scanner.nextInt();

        System.out.println("Numerele introduse de dumneavoastra sunt: " + primulNumar + "si " + alDoileaNumar);

        int adunare=calculator.adunare(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul adunarii este " + adunare);

        int scadere= calculator.scadere(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul scaderii este " + scadere);

        inmultire= calculator.inmultire(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul inmultirii este " + inmultire);

        impartire= calculator.impartire(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul impartirii este " + impartire);


        //Sa se modeleze un calculator stiintific care sa permita operatiile calculatorului simplu si urmatoarele operatii:
        //-- Un numar ridicat la puterea altui numar
        //-- Radical dintr-un nr
        //-- Logaritm in baza 10 dintr-un numar
        //-- Logaritm dintr-un numar

        CalculatorStiintific calculatorStiintific= new CalculatorStiintific();
        System.out.println("Rezultatul adunarii este: " + calculatorStiintific.adunare(10,50));
        System.out.println("Rezultatul scaderii este: " + calculatorStiintific.scadere(30,10));
        System.out.println("Rezultatul inmultirii este: " + calculatorStiintific.inmultire(5,10));
        System.out.println("Rezultatul impartirii este: " + calculatorStiintific.impartire(20,5));
        double ridicareLaPutere= calculatorStiintific.ridicareLaPutere(4,5);
        System.out.println("Rezultatul ridicarii la putere este: " + ridicareLaPutere);
        double radical= calculatorStiintific.radical(4);
        System.out.println("Rezultatul radicalului este: " + radical);
        double logaritmBaza= calculatorStiintific.logaritmBaza(8);
        System.out.println("Rezultatul logaritmului in baza 10 este: " + logaritmBaza);
        double logaritmNumar= calculatorStiintific.logaritmNumar(10);
        System.out.println("Rezultatul logaritmului dintr-un numar este: " + logaritmNumar);


        //Citim valorile de la tastatura
        Scanner scanner1= new Scanner(System.in);

        //Ridicacre la putere
        System.out.println("Va rugam introduceti primul numar pentru ridicare la putere");
        primulNumar= scanner1.nextInt();

        System.out.println("Va rugam introduceti al doilea numar pentru ridicare la putere");
        alDoileaNumar= scanner1.nextInt();

        ridicareLaPutere= calculatorStiintific.ridicareLaPutere(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul ridicarii la putere al numerelor " + primulNumar + "si " + alDoileaNumar+ "este " + ridicareLaPutere);

        //Sa se afiseze meniul
        //1. Adunare
        //2. Inmultire
        //3. Radical
        //4.Scadere
        //Afisam mesajul "Va rugam alegeti o optiune"
        //In functie de optiunea aleasa se realizeaza operatia respectiva, daca operatia presupune folosirea unui singur numar
        //Facem operatia si pentru al 2-lea numar
        //Afisam rezultatul


        int optiune= 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Va rugam introduceti cele doua numere");

        primulNumar= sc.nextInt();
        alDoileaNumar= sc.nextInt();

        System.out.println("Numerele introduse sunt: " + primulNumar + "si" + alDoileaNumar);
        System.out.println("Meniu");
        System.out.println("1.Adunare");
        System.out.println("2.Inmultire");
        System.out.println("3.Radical");
        System.out.println("4.Scadere");
        System.out.println("Va rugam alegeti o optiune");
        optiune= sc.nextInt(); //Scaneaza tastatura  //Utilizatorul introduce un numar de la tastatura


        while (optiune != 9) { //Daca utilizatorul introduce orice alt numar inafara de 9 programul ruleaza urmatoarele instructiuni (optiunile)
            if (optiune == 1) {
                System.out.println("Ai ales optiunea adunare");
                System.out.println("Rezultatul adunarii este: " + calculatorStiintific.adunare(primulNumar, alDoileaNumar));
            } else if (optiune == 2) {
                System.out.println("S-a ales optiunea 2");
                System.out.println("Rezultatul immultirii este:" + calculatorStiintific.inmultire(primulNumar, alDoileaNumar));
            } else if (optiune == 3) {
                System.out.println("S-a ales optiunea 3");
                System.out.println("Rezultatul radicalului este: " + calculatorStiintific.radical(primulNumar));
            } else if (optiune == 4) {
                System.out.println("S-a ales optiunea 4");
                System.out.println("Rezultatul scaderii este: " + calculatorStiintific.scadere(primulNumar, alDoileaNumar));
            } else {
                System.out.println("Nu gasim optiunea dumneavoastra");
            }
            optiune = sc.nextInt(); //Scaneaza inca odata si verifica daca ce a introdus utilizatorul este diferit de 9   //Daca a apasat tasta 9 iese din bucla
        }
        System.out.println("Ne pare rau. Ati apasat tasta 9. Am iesit din program, o zi buna!");
    }
}
