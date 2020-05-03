public class Main {
    //Care e numarul cel mai mare dintr-un vector
    //Avem un vector de 10 elemente intregi si returnam cel mai mare numar
    public static void main(String[] args) {
        int[] nunereArray= {20,50,40,65,89,32,56,73,100,243};
        int celMaiMareNumar= celMaiMareNumar(nunereArray);
        System.out.println(celMaiMareNumar);

    }

    public static int celMaiMareNumar(int[] numereArray){
        int celMaiMareNumar= numereArray[0];
        for(int cursor=0; cursor< numereArray.length; cursor++){
           if (numereArray[cursor] > celMaiMareNumar){
               celMaiMareNumar= numereArray[cursor];
           }

        }
        return celMaiMareNumar;
    }
}
