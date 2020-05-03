public class Main {
    //Sa se afiseze toate cuvintele care incep cu litera "s" sau "d"
    // apoi sa se afiseze litera de la pozitia 3 din fiecare cuvant
    public static void main(String[] args) {
        String text= "Procedeul prin care luam un Repository Central se numeste Clonare";
        afisareCuvinte(text);
        afisareLitera(text);
    }

    public static void afisareCuvinte(String text){
        int afisare= 0;
        String[] cuvinteArray= text.split(" ");
        for(int cursor=0; cursor< cuvinteArray.length; cursor++){
            if(cuvinteArray[cursor].startsWith("s") || cuvinteArray[cursor].startsWith("d")){
                afisare++;
                System.out.println(cuvinteArray[cursor]);

            }
        }
    }
    public static void afisareLitera(String text){
        int afisare=0;
        String[] cuvinteArray= text.split(" ");
        for(int cursor=0; cursor< cuvinteArray.length; cursor++) {
            if (cuvinteArray[cursor].length() >= 3) {
                System.out.println("Literele de la pozitia 3 a cuvantului " + cuvinteArray[cursor] + "este : " + cuvinteArray[cursor].charAt(3));
            }
        }
    }
}
