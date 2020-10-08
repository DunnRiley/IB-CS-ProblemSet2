package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XorGateTest {

    @Test
    void calculatOut() {
        XorGate xor = new XorGate();
        boolean actialOut =  xor.calculatOut(false,false);
        boolean expectedOut = false;
        assertEquals(expectedOut,actialOut);

        boolean actialOut2 =  xor.calculatOut(false,true);
        boolean expectedOut2 = true;
        assertEquals(expectedOut2,actialOut2);

        boolean actialOut3 =  xor.calculatOut(true,false);
        boolean expectedOut3 = true;
        assertEquals(expectedOut3,actialOut3);

        boolean actialOut4 =  xor.calculatOut(true,true);
        boolean expectedOut4 = false;
        assertEquals(expectedOut4,actialOut4);
    }
}