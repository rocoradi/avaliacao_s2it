package br.com.s2.principal;

import br.com.s2.questao8.Questao_8;
import br.com.s2.questao9.BinaryTree;
import br.com.s2.questao9.Questao_9;

public class Principal {
	
	public static void main(String[] args) {
		
		//Testando Exercicio 8
		Questao_8 numero = new Questao_8();
		Integer valorC = 0;
		
		valorC = numero.InteiroC(1025,51);
		
		System.out.println("Inteiro C: "+valorC.toString());
		
		//Testando Exercicio 9
		Integer soma = 0;
		
		BinaryTree noArvore1 = new BinaryTree();
		noArvore1.setValor(1);
		
		BinaryTree noArvore2 = new BinaryTree();
		noArvore2.setValor(1);
		
		BinaryTree noArvore3 = new BinaryTree();
		noArvore3.setValor(1);
		
		BinaryTree noArvore4 = new BinaryTree();
		noArvore4.setValor(1);
		
		BinaryTree noArvore5 = new BinaryTree();
		noArvore5.setValor(1);
		
		noArvore1.setLeft(noArvore2);
		noArvore1.setRight(noArvore2);
		
		noArvore2.setLeft(noArvore3);
		noArvore2.setRight(noArvore3);
		
		noArvore3.setLeft(noArvore4);
		noArvore3.setRight(noArvore4);
		
		noArvore4.setLeft(noArvore5);
		noArvore4.setRight(noArvore5);

		
		Questao_9 calcular = new Questao_9();		
		soma = calcular.somar(noArvore3);
		
		System.out.println("Soma dos nós: "+soma.toString());
	}

}
