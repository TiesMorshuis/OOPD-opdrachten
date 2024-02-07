final int SCHERMBREEDTE = 800;
final int SCHERMHOOGTE = 800;
PingpongSpel spel;

void settings(){
 size(SCHERMBREEDTE, SCHERMHOOGTE); 
}

void setup(){
  spel = new PingpongSpel(50);
  //spel.ballen[1].tekenPingpongBal();
}

void draw(){
  spel.ballen[spel.getNewIndex()].tekenPingpongBal();
  spel.ballen[spel.getNewIndex()].bepaalPositieEnDiameter();
}
