/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica03_Atividade04
* Descrição: Faça um programa que solicite ao usuário que digite um número até que ele digite um número menor que 0 (utilize while)
* Data: 19/04/2023
*/

import java.util.Scanner;

public class Atividade4_Pratica03 {
  public static void main(String[] args) {

    Scanner entradaTeclado = new Scanner(System.in);
    int numero = 0;

    while (numero >= 0) {
      System.out.println("Favor digite um número menor que zero: ");
      numero = entradaTeclado.nextInt();
    }

    entradaTeclado.close();

    System.out.println("\nObrigado.\n");

  }
}
