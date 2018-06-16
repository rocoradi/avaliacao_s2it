package br.com.s2.questao8;

public class Questao_8 {
	
	public Integer InteiroC(int InteiroA, int InteiroB) {
		int max = 0;
        StringBuilder strBuilder = new StringBuilder();
        char[] valorArrayA = Integer.valueOf(InteiroA).toString().toCharArray();
        char[] valorArrayB = Integer.valueOf(InteiroB).toString().toCharArray();
        
        
        if (valorArrayA.length >= valorArrayB.length) {
        	max = valorArrayA.length;
        }else {
        	max = valorArrayB.length;
        }

        for (int i = 0; i < max; i++) {

            if (valorArrayA.length > i) {
            	strBuilder.append(valorArrayA[i]);
            }

            if (valorArrayB.length > i) {
            	strBuilder.append(valorArrayB[i]);
            }
        }

        Integer resultado = Integer.valueOf(strBuilder.toString());

        if (resultado > 1000000) {
            return -1;
        }

        return resultado;
    }
}
