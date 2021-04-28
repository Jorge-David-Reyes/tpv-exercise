package oop.inheritance.core;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.ingenico.IngenicoDisplay;
import oop.inheritance.verifone.v240m.VerifoneV240mDisplay;
import oop.inheritance.verifone.vx520.VerifoneVx520Display;
import oop.inheritance.verifone.vx690.VerifoneVx690Display;

public class TPVFactory {

    private SupportedTerminal supportedTerminal;

    public TPVFactory(SupportedTerminal supportedTerminal) {
        this.supportedTerminal = supportedTerminal;
    }

    public TVPDisplay getDisplayInstance(){
        if(supportedTerminal == SupportedTerminal.INGENICO) {
            return IngenicoDisplay.getInstance();
        }else if (supportedTerminal == SupportedTerminal.VERIFONE_240) {
            return VerifoneV240mDisplay.getInstance();
        }else if (supportedTerminal == SupportedTerminal.VERIFONE_520) {
            return VerifoneVx520Display.getInstance();
        }else if (supportedTerminal == SupportedTerminal.VERIFONE_690) {
            return VerifoneVx690Display.getInstance();
        }
        return null;
    }
}
