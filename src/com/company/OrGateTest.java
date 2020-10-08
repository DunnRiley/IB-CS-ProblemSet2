package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrGateTest {

    @Test
    void calculatOut() {
        OrGate or = new OrGate();
        boolean actialOut =  or.calculatOut(false,false);
        boolean expectedOut = false;
        assertEquals(expectedOut,actialOut);

        boolean actialOut2 =  or.calculatOut(false,true);
        boolean expectedOut2 = true;
        assertEquals(expectedOut2,actialOut2);

        boolean actialOut3 =  or.calculatOut(true,false);
        boolean expectedOut3 = true;
        assertEquals(expectedOut3,actialOut3);

        boolean actialOut4 =  or.calculatOut(true,true);
        boolean expectedOut4 = true;
        assertEquals(expectedOut4,actialOut4);
    }
}