public class Asiel {
    public static void main(String[] args) {
        Dier dier1 = new Dier("Canine");
        Dier dier2 = new Zoogdier("Canine", 2);
        Dier dier3 = new Hond("Canine", 2, "Fiffie");

        Zoogdier zoogdier2 = new Zoogdier("Canine", 3);
        Zoogdier zoogdier3 = new Hond("Canine", 3, "Brutus");

        Hond hond3 = new Hond("Canine", 4, "Pluto" );

        //casts:
        Dier d1 = (Dier)zoogdier2;
        d1.adem();

        Dier d2 = (Dier) zoogdier3;
        d2.adem();

        Dier d3 =  (Dier)hond3;
        d3.adem();


    }
}