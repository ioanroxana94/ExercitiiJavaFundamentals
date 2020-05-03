public class Main {
    //se da un array de 7 cuvinte
    //sa se concateneze si sa se afiseze cuvintele de pe pozitiile divizibile cu 3 si mai mari decat 0
    public static void main(String[] args) {
        String[] cuvinteArray= {"Eu", "ma", "numesc", "Roxana", "si", "iubesc", "animalele"};
        concatenare(cuvinteArray);
    }

    public static void concatenare(String[] cuvinteArray){
        String cuvinte="";
        for (int cursor=1; cursor< cuvinteArray.length; cursor++){
            if(cursor % 3 == 0){
                cuvinte= cuvinte.concat(cuvinteArray[cursor]);
            }
        }
        System.out.println("Rezultatul este:" + cuvinte);
    }

}
