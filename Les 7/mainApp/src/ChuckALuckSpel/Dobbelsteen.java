package MainApp;
import  java.util.Random;

public class Dobbelsteen {
    private Random r;
    private int aantalZijden, aantalOgen;

    public Dobbelsteen(int aantalZijden) {
        this.aantalZijden = aantalZijden;
        this.r = new Random();
    }

    public void werpSteen(){
        aantalOgen = (int) (Math.random() * aantalZijden + 1);
    }

    public int getAantalOgen(){
        return aantalOgen;
    }


    public String toString(){
        return "random: " + r + " aantalZijden: " + aantalZijden + " aantalOgen: " + aantalOgen;
    }

}