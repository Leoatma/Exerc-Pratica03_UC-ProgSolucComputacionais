/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica03_Atividade08
* Descrição: Faça um programa que preencha com zeros todas as posições de um vetor de tamanho 50.
* Data: 19/04/2023
*/

public class Atividade8_Pratica03 {

  public static void main(String[] args) {

    int[] vetor = new int[50]; // criando array com 50 elementos.

    for (int pos : vetor) { // iterando a cada elemento do vetor, e atribuindo seu valor igual a 0.
      pos = 0;
      System.out.println(pos); // imprimindo com o loop
    }

    System.out.printf("\n\nvetor 4 = %d,\nvetor 6 = %d.\n", vetor[3], vetor[5]); // imprimindo os valores fora do loop

  }
}
