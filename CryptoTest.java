package com.alojea;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


public class CryptoTest {

    Crypto crypto;

    @Before
    public void setUp() throws Exception {
        crypto = new Crypto();
    }

    @Test
    public void stringToNumberTest(){
        crypto.stringToNumber("DONOTUSEPC");
    }
}