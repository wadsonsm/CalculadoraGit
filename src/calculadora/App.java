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
public class App {
     public static void main(String[] args) {
        
       
         Scanner scanner = new Scanner(System.in);
         
         Calculadora calc = new Calculadora();
         Calculadora calc2 = new Calculadora();

       System.out.println("Digite o valor de X");
       calc.x = scanner.nextInt();
       System.out.println("Digite o valor de Y");
       calc.y = scanner.nextInt();
        
        calc.soma();
        /*
        int somaApp = calc.soma(40,50);
         System.out.println("[método main] Soma= "+somaApp);
        */
        calc.subtracao();
        calc.multiplicacao();
        calc.divisao();
        System.out.println("+++++++++++++++++++++++++++");
        
    System.out.println("Digite o valor de X para calc2");
       calc2.x = scanner.nextInt();
       System.out.println("Digite o valor de Y para calc2");
       calc2.y = scanner.nextInt();
       
       calc2.subtracao();
        calc2.multiplicacao();
        calc2.divisao();
        System.out.println("+++++++++++++++++++++++++++");
        
    }
    
}
