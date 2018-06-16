package br.com.s2.questao9;

public class Questao_9 {
	
	public int somar(BinaryTree binaryTree) {
		
		if (binaryTree == null) {
			return 0;
		}
		
		return binaryTree.getValor() + somar(binaryTree.getLeft()) + somar(binaryTree.getRight());
	}
}
