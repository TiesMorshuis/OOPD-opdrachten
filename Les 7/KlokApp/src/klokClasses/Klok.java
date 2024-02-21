package klokClasses;

import processing.core.PApplet;

public class Klok {
    private Teller minutenTeller;
    private Teller urenTeller;
    private float x, y, hoogte, breedte;

    public Klok(float x, float y, float breedte, PApplet app){
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = breedte * 0.4f;
        urenTeller = new Teller(24, x, y, breedte / 2, hoogte, app);
        minutenTeller = new Teller(60, x + breedte / 2, y, breedte / 2, hoogte, app);
    }

    public void setTijd(int uren, int minuten){
        minutenTeller.setWaarde(minuten);
        urenTeller.setWaarde(uren);
    }

    public void tik(){
        minutenTeller.tik();
        if (minutenTeller.getWaarde() == 0){
            urenTeller.tik();
        }
    }

    public void tekenKlok(){
        urenTeller.tekenTeller();
        minutenTeller.tekenTeller();
    }

    @Override
    public String toString() {
        return "Klok{" +
                "minutenTeller=" + minutenTeller +
                ", urenTeller=" + urenTeller +
                ", x=" + x +
                ", y=" + y +
                ", hoogte=" + hoogte +
                ", breedte=" + breedte +
                '}';
    }
}
