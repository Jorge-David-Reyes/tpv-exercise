package oop.inheritance.ingenico;
import oop.inheritance.core.TVPDisplay;

public class IngenicoDisplay implements TVPDisplay{
    //eager private static IngenicoDisplay uniqueInstance = new IngenicoDisplay();

    //Lazy initialization
    private static IngenicoDisplay uniqueInstance;
    private boolean lightTurnedOn;

    private IngenicoDisplay(){

    }

    public static IngenicoDisplay getInstance(){
        //synchronized (IngenicoDisplay.class){
            if(uniqueInstance == null){
                uniqueInstance= new IngenicoDisplay();
            }
        //}
        return uniqueInstance;
    }

    public void showMessage(int x, int y, String message) {

    }

    public void clear() {

    }
}
