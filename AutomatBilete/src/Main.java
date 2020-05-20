import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
   // Să se simuleze un automat de bilete de autobuz: furnizează biletul într-un fișier text,
    //permite alegerea numărului de bilete,
    // primește bani virtuali prin care se achită suma aferentă biletelor alese..
   public static void main(String[] args) {
      AutomatBilete automatBilete= new AutomatBilete(4,1);
      System.out.println("Pretul biletelor este " + automatBilete.getPretBilete() + " lei");
      System.out.println("Numarul de bilete ales este: " + automatBilete.getNumarBilete());
      automatBilete.sellBilete(4);

      CumparatorBilet cumparatorBilet= new CumparatorBilet("Roxana",4);
      System.out.println("Numele cumparatorului este: " + cumparatorBilet.getNume());
      System.out.println("Suma introdusa este: " + cumparatorBilet.getBani() + " lei");



      Scanner automat= new Scanner(System.in);
      System.out.println("Va rugam introduceti numarul de bilete dorit");
      int bilet= automat.nextInt();
         System.out.println("Ati ales " + bilet + " bilete. Pretul este de " + automatBilete.pretBilet());


   }
}
