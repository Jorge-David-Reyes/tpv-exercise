package oop.inheritance.verifone.vx520;
import oop.inheritance.core.TVPDisplay;
import oop.inheritance.verifone.vx520.VerifoneVx520Display;

public class VerifoneVx520Display implements TVPDisplay {

    private static VerifoneVx520Display uniqueInstance;
    private boolean lightTurnedOn;

    private VerifoneVx520Display(){

    }

    public static VerifoneVx520Display getInstance(){
        //synchronized (IngenicoDisplay.class){
        if(uniqueInstance == null){
            uniqueInstance= new VerifoneVx520Display();
        }
        //}
        return uniqueInstance;
    }

    public void showMessage(int x, int y, String message) {
    }

    public void clear() {

    }
}
