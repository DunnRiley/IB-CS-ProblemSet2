package com.company;

public class OrGate {
    private NandGate nand = new NandGate();
    private NotGate not = new NotGate();


    public boolean calculatOut(boolean a, boolean b){
        boolean nota = not.calculatOut(a);
        boolean notb = not.calculatOut(b);
        return nand.calculatOut(nota,notb);
    }
}
