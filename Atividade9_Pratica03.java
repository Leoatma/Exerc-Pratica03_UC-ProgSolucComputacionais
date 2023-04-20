/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica03_Atividade09
* Descrição: Faça um programa que preencha com zeros todas as posições de uma matriz com 10 linha e 10 colunas
* Data: 20/04/2023
*/

public class Atividade9_Pratica03 {

  public static void main(String[] args) {

    int[][] exemploMatriz = new int[10][10];

    for (int idx = 0; idx < exemploMatriz.length; idx++) {

      for (int idx2 = 0; idx < exemploMatriz.length; idx++) {
        exemploMatriz[idx][idx2] = 0;
      }
      System.out.printf(
          "Vetor [linha 1] [coluna 1] = %d,\nVetor [linha 10] [coluna 10] = %d,\nVetor [linha 3] [coluna 8] = %d,\nVetor [linha 9] [coluna 3] %d. \n",
          exemploMatriz[0][0], exemploMatriz[9][9], exemploMatriz[2][7],
          exemploMatriz[8][2]);
    }
  }
}
