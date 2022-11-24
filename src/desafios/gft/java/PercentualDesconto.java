package desafios.gft.java;

import java.util.Scanner;
/*
* Desafio: Encontrando o Percentual de Desconto
* O gerente de uma loja resolveu aplicar descontos em todos os seus produtos!
* A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos.
*
* Entrada
* A entrada deverá ser feita por dois valores M e D, onde a primeira linha deverá receber o valor
* marcado do produto, e na segunda linha o valor do produto com o desconto já aplicado.
*
* Saída
* A saída deverá retornar o percentual de desconto que foi aplicado no produto, conforme exemplo abaixo.
*
* Entrada
* 40
* 30
*  Saída
* O desconto foi de 25%
*
* Entrada
* 500
* 195
* Saída
* O desconto foi de 61%
*
* Entrada
* 100
* 50
* Saída
* O desconto foi de 50%
*
*
* */

public class PercentualDesconto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Por gentileza, digite o valor do produto:");
        int M = input.nextInt();
        System.out.println("Por gentileza, digite o valor do produto com desconto:");
        int S = input.nextInt();

        double percentual = (S*100 / M);
        System.out.format("O desconto foi de %.0f%%%n" ,(100 - percentual));
    }
}

