class PingpongSpel {
 int aantalBallen;
 PingpongBal[] ballen;
 
 PingpongSpel(int aantalBallen){
  this.aantalBallen = aantalBallen;
  ballen = new PingpongBal[aantalBallen];
  initPingPongBallen();
 }
 
 void initPingPongBallen(){
  for (int balNummer = 0; balNummer < ballen.length; balNummer++){
    ballen[balNummer] = new PingpongBal(#FF0000, int(random(30, SCHERMBREEDTE - 30)), int(random(30, SCHERMHOOGTE - 30)), 30.0);
    // arraypositie vullen met een pingpongbal object
    
  }
   
 }
 
 int getNewIndex() {
   //bepaal random indexnummer
  return int(random(0, aantalBallen)); 
 }
}
