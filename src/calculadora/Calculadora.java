/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Wadson
 */
public class Calculadora {

     int x, y;
     int soma;
     int subtracao;
     int multiplicacao;
     int divisao;
    
    
    /**
     * @param args the command line arguments
     */
   
    
    public  void soma()
    {
        
        soma = x + y;
        
        System.out.println("[método soma] Soma = "+soma);
        
    }
    public  int soma(int x, int y)
    {
        int soma = x + y;
        return soma;
    }
    
     public  void subtracao()
    {
      
        
        subtracao = x - y;
        
        System.out.println("[método subtracao] subtracao = "+subtracao);
        
    }
     
      public  void multiplicacao()
    {
       
        
        multiplicacao = x * y;
        
        System.out.println("[método multiplicacao] multiplicacao = "+multiplicacao);
        
    }
      
       public void divisao()
    {
       
        
        divisao = x / y;
        
        System.out.println("[método divisao] divisao = "+divisao);
        
    }
    
}
