package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NandGateTest {

    @Test
    void calculatOut() {
        NandGate nand = new NandGate();
        boolean actialOut =  nand.calculatOut(false,false);
        boolean expectedOut = true;
        assertEquals(expectedOut,actialOut);

        boolean actialOut2 =  nand.calculatOut(false,true);
        boolean expectedOut2 = true;
        assertEquals(expectedOut2,actialOut2);

        boolean actialOut3 =  nand.calculatOut(true,false);
        boolean expectedOut3 = true;
        assertEquals(expectedOut3,actialOut3);

        boolean actialOut4 =  nand.calculatOut(true,true);
        boolean expectedOut4 = false;
        assertEquals(expectedOut4,actialOut4);
    }
}