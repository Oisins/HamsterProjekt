import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class HamsterRenderer implements de.hamster.model.HamsterProgram {public void main() {
   HamV2 ham = new HamV2();
   ham.init(0,0,1,1);
   while (ham.vornFrei()){
   ham.vorUm(-1);
   ham.dreheUm(3);
   if(ham.vornFrei()){
   ham.vor();
   ham.dreheUm(3);}
   ham.vorUm(-1);
   ham.dreheUm(1);
   if(ham.vornFrei()){
   ham.vor();
   ham.dreheUm(1);} 
   }
   
}







}