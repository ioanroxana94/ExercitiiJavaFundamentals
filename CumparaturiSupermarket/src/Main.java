import java.util.Date;
import java.util.Scanner;

public class Main {

    //Sa se modeleze cosul de cumparaturi dintr-un supermarket
    //Fiecare produs sa fie reprezentat de un obiect care sa contine nume si pret, exe. mere (5 lei), pere (7 lei), etc
    // Cosul de cumparaturi va fi reprezentat de un Array de produse
    //Sa se afiseze un meniu cu produsele pe care vrem sa le cumparam
    //Bazat pe ce se introduce la tastatura adaugam in cosul de cumparaturi
    //Sa calculam costul total al cusului de cumparaturi
    //Simulam plata pentru cosul de cumparaturi

    public static void main(String[] args) {

        Produs[] cosDeCumparaturi = new Produs[10];
        System.out.println("Meniu cumparaturi");
        System.out.println("1. Mere");
        System.out.println("2. Matura");
        System.out.println("3. Set de farfurii");
        System.out.println("4. Mustar");
        System.out.println("5. Apa");
        System.out.println("6. Bere");
        System.out.println("7. Suc");
        System.out.println("Va rugam sa alegeti cumparaturi din meniul nostru");

        Scanner scanner = new Scanner(System.in);
        int optiune = scanner.nextInt();

        while (optiune != 0) {
            if (optiune == 1) {
                System.out.println("Ati ales optiunea de comparaturi mere");
                Produs mere = new Produs("mere", 5); //Scriem care este opritunea
                cosDeCumparaturi[0] = mere; //punem indexul
                System.out.println("Afisam adaugarea produsului " + cosDeCumparaturi[0].getNume() + " " + cosDeCumparaturi[0].getPret());    //Afisam pentru a confirma adaugarea produsul in cosul de cumparaturi de [0]. Putem sa facem acest lucru pentru restul produselor.
            } else if (optiune == 2) {
                System.out.println("Ati ales optiunea de cumparaturi Matura");
                Produs matura = new Produs("matura", 10);
                cosDeCumparaturi[1] = matura;
            } else if (optiune == 3) {
                System.out.println("Ati ales optiunea de cumparaturi Set de farfurii");
                Produs setDeFarfurii = new Produs("Set de farfurii", 20);
                cosDeCumparaturi[2] = setDeFarfurii;
            } else if (optiune == 4) {
                System.out.println("Ati ales optiunea de cumparaturi Mustar");
                Produs mustar = new Produs("mustar", 6);
                cosDeCumparaturi[3] = mustar;
            } else if (optiune == 5) {
                System.out.println("Ati ales optiunea de cumparaturi Apa");
                Produs apa = new Produs("apa", 3);
                cosDeCumparaturi[4] = apa;
            } else if (optiune == 6) {
                System.out.println("Ati ales optiunea de cumparaturi Bere");
                Produs bere = new Produs("bere", 6);
                cosDeCumparaturi[5] = bere;
            } else if (optiune == 7) {
                System.out.println("Ati ales optiunea de cumparaturi Suc");
                Produs suc = new Produs("suc", 6);
                cosDeCumparaturi[6] = suc;
            } else {
                System.out.println("Optiunea nu exista");

            }

            optiune = scanner.nextInt();
        }
        System.out.println("Ati apasat tasta 0, programul de inchide. O zi buna!");
        System.out.println("Lungimea cosului de cumparaturi este " + cosDeCumparaturi.length); // e optional, doar daca vrem sa verificam noi lungimea cosului
        System.out.println("Ati cumparat:");

        for (int cursor = 0; cursor < cosDeCumparaturi.length; cursor++) {
            if (cosDeCumparaturi[cursor] != null) {
                System.out.println("Produsul ales este: " + cosDeCumparaturi[cursor].getNume() + " la pretul de " + cosDeCumparaturi[cursor].getPret() + " lei"); // s-a luat produsul cu ajutorul cursorului si afisam numele si pretul fiecarui produs din array cu ajutorul metodei "Getter".
            }
        }


        //acum adunam pretul produselor
        //declaram variabila "int pretTotal=0" pentru stocarea pretului in afara buclei "for" deoarece nu dorim
        int pretTotal = 0;
        for (int cursor = 0; cursor < cosDeCumparaturi.length; cursor++) {
            if (cosDeCumparaturi[cursor] != null) {
                pretTotal += cosDeCumparaturi[cursor].getPret(); //punem += si nu ++ pentru a se adauga tot pretul si nu doar nr. 1
            }
        }
        System.out.println("Pretul total este: " + pretTotal);
        System.out.println("S-au platit toate cumparaturile");


        //sa se reprezinte produse perisabile
        //acestea vor avea in plus data expirarii
        //sa se simuleze din nou un cos de cumparaturi
        //daca utilizatorul utilizeaza un produs perisabil si data de expirare este depasita vom afisa un mesaj "produs expirat" si nu il vom adauga in cos.
        //Sa adaugam alergeni si cand afisam cosul de cumparaturi, sa afisam si alergenii
        //Un cos de cumparaturi pentru produse non-alimentare si un cos pentru produse alimentare
        Date dataAstazi = new Date(2020, 5, 9);
        int pretTotalAlimente = 0;
        int pretTotalNonAlimente = 0;
        ProduseAlimentare[] cosAlimentare = new ProduseAlimentare[10];
        Produs[] cosNonAlimentare = new Produs[10];

        System.out.println("Meniu produse");
        System.out.println("1. Mere");
        System.out.println("2. Carne");
        System.out.println("3. Lapte");
        System.out.println("4. Matura");
        System.out.println("5. Bec");
        System.out.println("6. Pronto");

        optiune = scanner.nextInt();

        while (optiune != 0) {
            if (optiune == 1) {
                System.out.println("Ati ales mere");
                ProduseAlimentare mere = new ProduseAlimentare("mere", 10, "zaharoza", null);
                cosAlimentare[0] = mere;

            } else if (optiune == 2) {
                System.out.println("Ati ales carne");
                ProduseAlimentare carne = new ProduseAlimentare("carne", 15, "condimente", new Date(2020, 3, 1));
                cosAlimentare[1] = carne;
            } else if (optiune == 3) {
                System.out.println("Ati ales lapte");
                ProduseAlimentare lapte = new ProduseAlimentare("lapte", 8, "lactoza", new Date(2020, 6, 1));
                cosAlimentare[2] = lapte;
            } else if (optiune == 4) {
                System.out.println("Ati ales matura");
                Produs matura = new Produs("matura", 13);
                cosNonAlimentare[3] = matura;
            } else if (optiune == 5) {
                System.out.println("Ati ales bec");
                Produs bec = new Produs("bec", 5);
                cosNonAlimentare[4] = bec;
            } else if (optiune == 6) {
                System.out.println("Ati ales bec");
                Produs pronto = new Produs("pronto", 15);
                cosNonAlimentare[6] = pronto;
            } else {
                System.out.println("Numarul introdus nu exista");
            }
            optiune = scanner.nextInt();
        }
        System.out.println("Acestea sunt produsele non-alimentare din cos");
        for (int cursor = 0; cursor < cosNonAlimentare.length; cursor++) {
            if (cosNonAlimentare[cursor] != null) {  //Rezultatul nu trebuie sa fie null, daca e null o sa primim eroare
                System.out.println("Produsul este " + cosNonAlimentare[cursor].getNume() + " iar pretul este " + cosNonAlimentare[cursor].getPret());
            }
        }
        System.out.println("Acestea sunt produsele alimentare");
        for (int cursor = 0; cursor < cosAlimentare.length; cursor++) {
            if (cosAlimentare[cursor] != null) {
                System.out.println("Produsul este " + cosAlimentare[cursor].getNume() + " pretul este " + cosAlimentare[cursor].getPret() + " alergenii sunt " + cosAlimentare[cursor].getAlergeni() + " iar data de expirare este " + cosAlimentare[cursor].getDateExpirare());
                if (cosAlimentare[cursor].getDateExpirare() != null && cosAlimentare[cursor].getDateExpirare().before(dataAstazi)) {
                    System.out.println("Produsul este expirat si va fi scos din cos");
                    cosAlimentare[cursor] = null;
                }
            }
        }
        for (int cursor = 0; cursor < cosAlimentare.length; cursor++) { //aici vedem pretul total la produsele alimentare
            if (cosAlimentare[cursor] != null) {
                pretTotalAlimente += cosAlimentare[cursor].getPret();
            }
        }
        System.out.println("Pret total alimente este: " + pretTotalAlimente);
        for (int cursor = 0; cursor < cosNonAlimentare.length; cursor++) {  // aici vedem pretul total la produsele non-alimentare
            if (cosNonAlimentare[cursor] != null) {
                pretTotalNonAlimente += cosNonAlimentare[cursor].getPret();
            }
        }
        System.out.println("Pret total non-alimente este: " + pretTotalNonAlimente);
        System.out.println("Pretul total este: " + (pretTotalAlimente + pretTotalNonAlimente));  // aici vedem pretul total al alimentelor
    }
}

