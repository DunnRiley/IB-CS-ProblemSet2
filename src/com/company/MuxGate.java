package com.company;

public class MuxGate {
    private AndGate and = new AndGate();
    private NotGate not = new NotGate();
    private OrGate or = new OrGate();
    private XorGate xor = new XorGate();

    public boolean calculatOut(boolean a, boolean b, boolean sel){
        boolean notSel = not.calculatOut(sel);
        boolean NotSelAnda = and.calculatOut(notSel,a);
        boolean selAndb = and.calculatOut(sel,b);
        return or.calculatOut(NotSelAnda,selAndb);
    }
}
