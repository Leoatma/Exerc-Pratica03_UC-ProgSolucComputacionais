/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica03_Atividade01
* Descrição: Faça um programa que imprima todos os números pares de 1 a 100
* Data: 19/04/2023
*/

public class Atividade1_Pratica03 {
  public static void main(String[] args) {

    for (int index = 1; index <= 100; index++) {
      if (index % 2 == 0) {
        System.out.printf("O número %d é par. \n", index);
      }
    }

  }

}
