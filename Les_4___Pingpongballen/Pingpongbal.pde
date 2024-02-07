class PingpongBal {
  int kleur, xPositie, yPositie;
  float diameter;

  PingpongBal(int kleur, int xPositie, int yPositie, float diameter) {
    this.kleur = kleur;
    this.xPositie = xPositie;
    this.yPositie = yPositie;
    this.diameter = diameter;
  }

  void tekenPingpongBal() {
    //bepaalPositieEnDiameter();
    fill(kleur);
    circle(xPositie, yPositie, diameter);
    fill(#FFFFFF);
  }

  void bepaalPositieEnDiameter() {
    diameter = random(0, 80);
    xPositie = int(random(diameter / 2, width - (diameter / 2)));
    yPositie = int(random(diameter / 2, height - (diameter / 2)));
    
  }
  
}
