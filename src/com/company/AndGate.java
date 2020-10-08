package com.company;

public class AndGate {
    private NandGate nand = new NandGate();
    private NotGate not = new NotGate();
    public boolean calculatOut(boolean a,boolean b){
        boolean nandAB = nand.calculatOut(a,b);
        return not.calculatOut(nandAB);
    }
}
