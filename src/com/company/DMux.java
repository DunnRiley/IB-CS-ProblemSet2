package com.company;

public class DMux {
    private AndGate and = new AndGate();
    private NotGate not = new NotGate();
    private OrGate or = new OrGate();

    public boolean calculatOut(boolean a, boolean b) {
        boolean nota = not.calculatOut(a);
        boolean notb = not.calculatOut(b);
        boolean NotaAndb = and.calculatOut(nota, b);
        boolean aAndNotb = and.calculatOut(a, notb);
        return or.calculatOut(aAndNotb, NotaAndb);
    }
}
