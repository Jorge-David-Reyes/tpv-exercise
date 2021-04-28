package oop.inheritance.verifone.vx690;
import oop.inheritance.core.TVPDisplay;
import oop.inheritance.verifone.vx690.VerifoneVx690Display;

public class VerifoneVx690Display implements TVPDisplay {

    private static VerifoneVx690Display uniqueInstance;
    private boolean lightTurnedOn;

    private VerifoneVx690Display(){

    }

    public static VerifoneVx690Display getInstance(){
        //synchronized (IngenicoDisplay.class){
        if(uniqueInstance == null){
            uniqueInstance= new VerifoneVx690Display();
        }
        //}
        return uniqueInstance;
    }

    public void showMessage(int x, int y, String message) {
    }

    public void clear() {

    }
}
