KaartjesAutomaat kaartjesAutomaat;
Kaartje kaartje;
void setup(){
  kaartje = new Kaartje("The Matrix", 7.50);
  kaartjesAutomaat = new KaartjesAutomaat(0);
  kaartjeKopen();
  
}

 void kaartjeKopen(){
 println("Voor welke film wilt u een kaartje kopen?: ");
  for (int kaartjes = 1; kaartjes <= 1; kaartjes++){
   println("[" + kaartjes + "]" + kaartje.titel);
  }
}

void keyPressed(){
 if  
}
