/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajapaita.simudock;

/**
 *
 * @author aldo_
 */
public class PatoColorado extends Pato implements IVolar{
    @Override
    public void mostrar(){
        System.out.println("Soy un pato colorado");
    };
    
    @Override
    public void volar(){
        System.out.println("Volar bajo!");
    }
}
