/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajapaita.simudock;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aldo_
 */
public class PatoTest {
    
    public PatoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void mostrar(){
        Pato pato = new Pato();
        pato.mostrar();
        
    }
    
    @Test
    public void mostrarPatoColorado(){
        PatoColorado patoColorado = new PatoColorado();
        patoColorado.mostrar();
    }
    
    @Test
    public void volarPatoGoma(){
        PatoGoma patoGoma = new PatoGoma();
        
    }
}
