package com.company;

import static org.junit.jupiter.api.Assertions.*;

class NotGateTest {

    @org.junit.jupiter.api.Test
    void calculatOut() {
        NotGate not = new NotGate();
        boolean actialOut =  not.calculatOut(false);
        boolean expectedOut = true;
        assertEquals(expectedOut,actialOut);

        boolean actialOut2 =  not.calculatOut(true);
        boolean expectedOut2 = false;
        assertEquals(expectedOut2,actialOut2);
    }
}