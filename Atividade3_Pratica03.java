/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica03_Atividade03
* Descrição: Faça um programa que some os números de 1 a 100 e imprima somente o valor total da soma.
* Data: 19/04/2023
*/

public class Atividade3_Pratica03 {

  public static void main(String[] args) {

    int soma = 0;

    for (int index = 1; index <= 100; index++) {
      soma += index;
    }

    System.out.println("Soma = " + soma);
  }
}
