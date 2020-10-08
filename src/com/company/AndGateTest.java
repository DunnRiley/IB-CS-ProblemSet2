package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndGateTest {

    @Test
    void calculatOut() {
        AndGate and = new AndGate();
        boolean actialOut =  and.calculatOut(false,false);
        boolean expectedOut = false;
        assertEquals(expectedOut,actialOut);

        boolean actialOut2 =  and.calculatOut(false,true);
        boolean expectedOut2 = false;
        assertEquals(expectedOut2,actialOut2);

        boolean actialOut3 =  and.calculatOut(true,false);
        boolean expectedOut3 = false;
        assertEquals(expectedOut3,actialOut3);

        boolean actialOut4 =  and.calculatOut(true,true);
        boolean expectedOut4 = true;
        assertEquals(expectedOut4,actialOut4);
    }
}