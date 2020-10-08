package com.company;
public class NotGate {

    private NandGate nand = new NandGate();
    public boolean calculatOut(boolean in){
        return nand.calculatOut(in,in);
    }
}
