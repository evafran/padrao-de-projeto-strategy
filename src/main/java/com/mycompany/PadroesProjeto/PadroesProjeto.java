/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.PadroesProjeto;

/**
 *
 * @author eva
 */
public class PadroesProjeto {
    
    

    public static void main(String[] args) {
        
        Cartao calculo = new Cartao();
        Black black = new Black(17000);
        Gold gold = new Gold(5000);
        Platinum platinum = new Platinum(9500);
        Infinite infinite = new Infinite(5600);
        
        System.out.println("O valor total dos juros serà de : ");
        System.out.println(calculo.calcular(black));
        System.out.println("O valor total dos juros será de :");
        System.out.println(calculo.calcular(gold));
        System.out.println("O valor total dos juros será de :");
        System.out.println(calculo.calcular(platinum));
        System.out.println("O valor total dos juros será de :");
        System.out.println(calculo.calcular(infinite));

       
  
   
      
    }

    
   
   
 
}
