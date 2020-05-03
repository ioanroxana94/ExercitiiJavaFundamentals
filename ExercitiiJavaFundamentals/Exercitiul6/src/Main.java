public class Main {
    // se da un array de caractere
    //sa se afiseze in ordinea inversa
    public static void main(String[] args) {
        char[] caractereArray= {'a', 'b', 'c', 'd', 'e', 'f','g', 'h', 'i', 'j', 'k'};
        caractereInversate(caractereArray);
    }
     public static void caractereInversate(char[] caractereArray){
        for (int cursor= caractereArray.length -1; cursor>=0; cursor--){
            System.out.println(caractereArray[cursor]);
        }
     }
}
