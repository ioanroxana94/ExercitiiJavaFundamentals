public class AutomatBilete {
    private int pretBilete;
    private int numarBilete;

    public AutomatBilete(){

    }
    public AutomatBilete(int pretBilete, int numarBilete){
        this.pretBilete= pretBilete;
        this.numarBilete= numarBilete;
    }

    public int getPretBilete(){
        return pretBilete;
    }
    public int getNumarBilete(){
        return numarBilete;
    }
    public int sellBilete(int numarBilete){
        numarBilete=0;

        if (this.numarBilete>0){
            System.out.println("Achizitionare bilet cu succes");
            numarBilete++;

        }else {
            if (this.numarBilete < 1) {
                System.out.println("Biletul nu a putut fi achizitionat.");
            }
        }
        return numarBilete;
    }
    public int pretBilet() {
        this.pretBilete = 4;
        int[] numarBileteArray = {100};
        for (int cursor = 0; cursor < numarBileteArray.length; cursor++) {
            while (numarBileteArray[cursor] >=2){
                count:pretBilete+= 4;
            }
        }
        return pretBilete;
    }
}
