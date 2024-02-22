import klokClasses.Klok;
import processing.core.PApplet;

public class MainKlokApp extends PApplet {
    Klok klok;
    public static void main(String[] args) {PApplet.main(new String[] { "MainKlokApp"});} {
    }

    public void settings(){
        size(400,300);
    }
    public void setup(){

            background(255);

            klok = new Klok(150, 100, 100, this);
            klok.setTijd(22, 58);
            klok.tik();
            klok.tik();
            klok.tekenKlok();
            System.out.println(klok);
        }

    public void draw(){
            klok.tik();
            klok.tekenKlok();
        }

}