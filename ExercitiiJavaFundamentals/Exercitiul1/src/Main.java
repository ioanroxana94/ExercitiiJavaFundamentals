public class Main {

    public static void main(String[] args) {
        // O functie care primeste doua string-uri ca parametru si verifica daca al 2-lea string exista in primul string.

        String text= "Aud cum latra un caine. Imi doresc si eu foarte mult un caine";
        String text2= "Aud cum latra un caine";
        verificamTextInclus(text, text2);
    }

    public static void verificamTextInclus(String text, String text2){
        if(text.contains(text2)){
            System.out.println("Primul string il contine pe al 2-lea");
        }else{
            System.out.println("Primul string nu il contine pe al 2-lea");
        }
    }



}
