package desafios.gft.java;

import java.util.Scanner;

/*
* Desafio: Qual é o seu turno?
* Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
* Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
*
* Entrada
* A entrada consiste em um caractere(char) M , N ou V que informará o turno em que você estuda.
*
* Saída
* A saída mostrará uma mensagem que informa conforme o seu turno. Veja o exemplo:
* Entrada	Saída
*   M	   Bom Dia!
*   N	   Boa Noite!
*   T	   Valor Inválido!
*
* */

public class Turno {

        public static void main(String[] args) {

            System.out.println("Digite M V ou N:");

            Scanner leitor = new Scanner(System.in);

            char turno = leitor.next().toUpperCase().charAt(0);

            if (turno == 'M') {
                System.out.println("Bom Dia!");
            } else if (turno == 'V') {
                System.out.println("Boa Tarde!");
            } else if (turno == 'N') {
                System.out.println("Boa Noite!");
            } else {
                System.out.println("Valor Inválido!");
            }
        }}

