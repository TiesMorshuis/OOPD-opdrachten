package Taxonomie;

public class Dier{
    protected static int aantalDieren = 0;
    protected String naam;
 public Dier(String naam) {
     aantalDieren++;
     this.naam = naam;
    }
}
