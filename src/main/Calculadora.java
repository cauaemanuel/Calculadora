package main;

import java.util.Scanner;
import teste.operation;

public class Calculadora {
    static Scanner input = new Scanner(System.in); 
	static operation hello = new operation();
     public static void main(String[] args) {
    	 
    	int continuar;
    	 
    	 System.out.println("Se deseja usar a calculadora digite [1] caso não digite [0]: ");
    	 continuar = input.nextInt();
    	 while (continuar == 1) {
    		 System.out.println("----------------------------------------");
        	 System.out.println("----------------------------------------");
        	 System.out.println("--------------CALCULADORA---------------");
        	 System.out.println("----------------------------------------");
        	 System.out.println("-----------ESCOLHA-A-OPERAÇÃO-----------");
        	 System.out.println("----------------------------------------");
        	 System.out.println("------SOMA[1]-SUB[2]-MUL[3]-DIV[4]------");
        	 System.out.println("----------------------------------------");
        	 System.out.println("----------------------------------------");
        	 
        	
        	 int opcao = input.nextInt();
    		 
        	 if (opcao == 1) {
        		 System.out.println("Você escolheu a soma: ");
        		 System.out.println("Digite o primeiro valor: ");
        		 hello.setValor1(input.nextInt());
        		 System.out.println("Digite o segundo valor: ");
        		 hello.setValor2(input.nextInt());
        		 System.out.println("O resultado da operação " + hello.getValor1() + " + " + hello.getValor2() + " = " + hello.soma());
        		 
        		 
        		System.out.println("Se deseje continuar usando a calculadora digite [1] caso não digite [0]: ");
                continuar = input.nextInt();
        		 
        		 
        	 } else if (opcao == 2) {
        		 System.out.println("Você escolheu a subtrair: ");
        		 System.out.println("Digite o primeiro valor: ");
        		 hello.setValor1(input.nextInt());
        		 System.out.println("Digite o segundo valor: ");
        		 hello.setValor2(input.nextInt());
        		 System.out.println("O resultado da operação " + hello.getValor1() + " - " + hello.getValor2() + " = " + hello.subtrair());
        		
        		 System.out.println("Se deseje continuar usando a calculadora digite [1] caso não digite [0]: ");
                 continuar = input.nextInt();
        		 
        	 } else if(opcao == 3){
        		 System.out.println("Você escolheu a multiplicação: ");
        		 System.out.println("Digite o primeiro valor: ");
        		 hello.setValor1(input.nextInt());
        		 System.out.println("Digite o segundo valor: ");
        		 hello.setValor2(input.nextInt());
        		 System.out.println("O resultado da operação " + hello.getValor1() + " * " + hello.getValor2() + " = " + hello.mult());
        		 
        		 System.out.println("Se deseje continuar usando a calculadora digite [1] caso não digite [0]: ");
                 continuar = input.nextInt();
        		 
        	 } else if(opcao == 4){
        		 System.out.println("Você escolheu a divisão: ");
        		 System.out.println("Digite o primeiro valor: ");
        		 hello.setValor1(input.nextInt());
        		 System.out.println("Digite o segundo valor: ");
        		 hello.setValor2(input.nextInt());
        		 System.out.println("O resultado da operação " + hello.getValor1() + " / " + hello.getValor2() + " = " + hello.div());
        		 
        		 System.out.println("Se deseje continuar usando a calculadora digite [1] caso não digite [0]: ");
                 continuar = input.nextInt();
        		 
        	 }
        	 

    	 } 
    	 
    	    	 
    	
     }

}
