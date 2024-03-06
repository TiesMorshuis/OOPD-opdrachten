import processing.core.PApplet;

public class FigurenApp extends PApplet {
    public static void main(String[] args) {
    }

    public void settings(){
        size(400, 400);
    }
    Rechthoek rechthoek = new Rechthoek(100, 100, 50, 50);
    Cirkel cirkel = new Cirkel(200, 200, 50);

    public void draw(){
        background(0);
        cirkel.doeStap();

    }
}