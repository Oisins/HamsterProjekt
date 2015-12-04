import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class HamV2 extends Hamster {
    public void vorUm(int n){
    	while(n != 0 && this.vornFrei()){
    		n--;
    		this.vor();
    	}
    }
    public void dreheUm(int n){
    	while(n > 0){
    		this.linksUm();
    		n--;
    	}
    }
    int random(int min, int max){
		return (int)(Math.random() * max) + min;
	}
}