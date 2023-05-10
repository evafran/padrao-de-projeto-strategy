/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PadroesProjeto;

/**
 *
 * @author eva
 */
public class Infinite implements Juros{
    
    private double fatura;
    
    public Infinite(double fatura){
        this.fatura = fatura;
    }
    
    

    @Override
    public double calcularTaxa() {
        
        return this.fatura*0.1;

    }
    
}
