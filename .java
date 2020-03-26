package com.comissao;

import java.util.Scanner;
public class Comissão {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		double valorConta, valorComissao, valorTotal;
		System.out.print("Insira o valor da conta para calcular a comissão do garçom: ");
		valorConta = valor.nextDouble();
		valorComissao = valorConta/10;
		System.out.printf ("Comissão de: R$ %.2f" , valorComissao);
		valorTotal = valorComissao + valorConta;
		System.out.printf ("\nValor total a ser pago é de: R$ %.2f", valorTotal);
	}

}
