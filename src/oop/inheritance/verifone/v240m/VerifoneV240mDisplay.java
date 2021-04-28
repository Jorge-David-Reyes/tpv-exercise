package oop.inheritance.verifone.v240m;
import oop.inheritance.core.TVPDisplay;
import oop.inheritance.verifone.v240m.VerifoneV240mDisplay;

public class VerifoneV240mDisplay implements TVPDisplay {

    private static VerifoneV240mDisplay uniqueInstance;
    private boolean lightTurnedOn;

    private VerifoneV240mDisplay(){

    }

    public static VerifoneV240mDisplay getInstance(){
        //synchronized (IngenicoDisplay.class){
        if(uniqueInstance == null){
            uniqueInstance= new VerifoneV240mDisplay();
        }
        //}
        return uniqueInstance;
    }

    public void showMessage(int x, int y, String message) {
    }

    public void clear() {

    }
}
