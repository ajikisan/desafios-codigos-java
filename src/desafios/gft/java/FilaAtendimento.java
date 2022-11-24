package desafios.gft.java;

/*
* Desafio: A fila do Banco
* Elabore um programa que simule uma fila de atendimento bancário. O programa deve ler o nome de 3 pessoas
* (clientes do banco), armazenando-os em uma fila.
*
* Entrada
* A entrada será o nome de três pessoas (clientes do banco).
*
* Saída
* O programa deve imprimir como saída na tela o nome da pessoa e sua posição na fila.
*
* Entrada	    Saída
* Ana           Ana - esta na posicao: 1
* Sofia         Sofia - esta na posicao: 2
* Lucas         Lucas - esta na posicao: 3
*
* */

import java.util.Scanner;

public class FilaAtendimento {

       public static void main(String[] args) {

           System.out.println("Por gentileza, digite 3 nomes de pessoas:");
            String[] nomesFila = new String[3];
            Scanner nome = new Scanner(System.in);

            for (int i = 0; i < nomesFila.length; i++) {
                nomesFila[i] = nome.next();

                System.out.format("%s - esta na posicao: %d%n",nomesFila[i],(i + 1) );
            }
        }
    }


