public class Main {
    //Sa se numere toate cuvintele care au lungimea mai mare decat 2, contin caracterul i si caracterul i este pe o pozitie para
    public static void main(String[] args) {
        String text= "Un festival, concurs de calitate , din punctul meu de vedere ar trebui sa aibe in primul rând un juriu de calitate( sa aibe habar de muzica pentru a putea evalua),corect, care sa nu și prezinte copiii in concurs.";
        int rezultatCuvinte= rezultatCuvinte(text);
        System.out.println("Numarul cuvintelor este" + rezultatCuvinte);
    }
    public static int rezultatCuvinte(String text){
        int rezultatCuvinte= 0;
        String[] numarCuvinte= text.split(" ");
        for(int cursor= 0; cursor< numarCuvinte.length; cursor++){
            if(numarCuvinte[cursor].length() > 2 && numarCuvinte[cursor].contains("i") && numarCuvinte[cursor].indexOf("i") % 2 ==0 ){
                rezultatCuvinte++;
            }
        }
        return rezultatCuvinte;

    }
}
