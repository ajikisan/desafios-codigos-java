package desafios.gft.java;

import java.util.Scanner;

/*
* Desafio Media de Idade
* Faça um programa que peça para 3 pessoas a sua idade, ao final o programa deverá
* verificar se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60;
* e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
* Entrada
A entrada consiste em três números inteiros que representam a idade das pessoas.
* Entrada: 70 -  60  - 61
* Saída: Idosa!
*
* Entrada: 7 - 14 - 22
* Saída: Jovem!
*
* */

public class Main {

    public static void main(String[] args) {
	// write your code here
     Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 3 idades aleatórias:" );
        int idade1 = leitor.nextInt();
        System.out.println("Digite a primeira idade");

        int idade2 = leitor.nextInt();
        System.out.println("Digite a segunda idade");

        int idade3 = leitor.nextInt();
        System.out.println("Digite a terceira idade");

        double media = (idade1 + idade2 + idade3) / 3;

        System.out.println("A média de idade é " + media);

        if (media <= 25) { System.out.println("Jovem!"); }
        else if (media<=60) { System.out.println("Adulta!"); }
        else { System.out.println("Idosa!"); }
    }
}