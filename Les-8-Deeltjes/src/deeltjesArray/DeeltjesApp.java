package deeltjesArray;

import processing.core.PApplet;

import java.util.ArrayList;

public class DeeltjesApp extends PApplet {
    public static void main(String[] args) {
        PApplet.main("deeltjesArray.DeeltjesApp");
    }

    private final float G = 0.2f;
    ArrayList<Deeltje> deeltjesLijst = new ArrayList<>();
    Deeltje d1;

    public void settings() {
        size(400, 400);
    }

    public void setup() {

        background(0);
    }

    public void draw() {

        background(0);
        for(int i = 0; i< deeltjesLijst.size(); i++){
            Deeltje d = deeltjesLijst.get(i);
            d.zetStap();
            d.tekenDeeltje();
            if (isBenedenHetScherm(d)){
                deeltjesLijst.remove(i);
            }
        }
        //V8.2C
        /*background(0);
        for(int i = deeltjesLijst.size(); i == 0; i--){
            Deeltje d = deeltjesLijst.get(i);
            d.zetStap();
            d.tekenDeeltje();
            if (isBenedenHetScherm(d)){
                deeltjesLijst.remove(i);
            }
        }*/

    }

    public void mousePressed() {
        Deeltje d = new Deeltje(this, mouseX, mouseY, random(-2, 2), -5, 0, G);
        deeltjesLijst.add(d);
        System.out.println(deeltjesLijst.size());
    }

    private boolean isBenedenHetScherm(Deeltje d) {
        return (d.getY() - Deeltje.GROOTTE) > height;
    }

}


/* V8.1 Ik heb geprobeerd hem in de klasse Deeltje te zetten, hiervoor heb ik de private veranderd in een public omdat het programma er anders niet bij kon
* het probleem waar ik tegenaan liep was het feit dat het programma de functie "height" niet kon vinden omdat die niet meer in het hoofdprogramma stond. de enige oplossing hiervoor leek me om globale variabele aan te maken en die in de size() te zettem
* en vervolgens die variabelen gebruiken in de functie. Alleen omdat ik niet weet of dat volgens de conventionele afspraken is heb ik het niet uitgevoerd.
* V8.2A Ik weet helaas nog steeds niet hoe het geheugenmodel werkt. Ik heb die les gemist en heb nog geen tijd er in gestoken om het te begrijpen. aangezien we vandaag vrij hebben lijkt me dit een mooie kans om dit te doen.
* V8.2B de if statement checkt per deeltje of het deeltje onder het scherm is, als dat zo is wordt dat deeltje uit de array gehaald.
* V8.2C zie
*
* */
