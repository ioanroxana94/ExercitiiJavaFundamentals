public class Main {
    //Se da un text
    //Sa se numere cuvintele care au lungimea inpara si se termina cu litera E
    public static void main(String[] args) {
        String text1= "Imi place foarte mult programarea";
        int rezultatString= rezultatString(text1);
        System.out.println(rezultatString);

    }
    public static int rezultatString(String text1){
        int sumaString = 0;
        String[] cuvinte = text1.split(" ");
        for (int cursor = 0; cursor < cuvinte.length; cursor++) {
                if (cuvinte[cursor].length()% 2 != 0 && cuvinte[cursor].endsWith("e")) {
                    sumaString++;
            }
        }
        return sumaString;
    }

}
