/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PadroesProjeto;

/**
 *
 * @author eva
 */
public class Cartao implements Juros{
    
    public double calcular(Juros j){
        return j.calcularTaxa();
        
    }
    

    @Override
    public double calcularTaxa() {
        return 0;
    }
    
}
