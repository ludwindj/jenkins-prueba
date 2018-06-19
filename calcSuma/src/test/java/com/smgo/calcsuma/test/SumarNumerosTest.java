/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smgo.calcsuma.test;

import org.junit.Test;
import com.smgo.calcsuma.SumarNumeros;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

/**
 *
 * @author ludwin.ayala
 */
public class SumarNumerosTest {

    SumarNumeros calc;

    @Before
    public void setUp() {
        calc = new SumarNumeros();
    }

    @Test
    public void SumarNumerosTest() {
        int expected = 10;
        assertEquals(expected, calc.calSuma(4, 6));

    }

}
