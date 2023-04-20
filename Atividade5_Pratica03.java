/* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica03_Atividade05 
* Descrição: Faça um programa que determine o fatorial de um número. 
* Para este problema, tem-se como entrada o valor do número do qual se deseja calcular o fatorial. 
* O fatorial de 0 é igual a 1. O fatorial de um número N (N!) é definido conforme a seguir (utilize for):
*     i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
*
* Data: 19/04/2023
*/

import java.util.Scanner;

public class Atividade5_Pratica03 {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Por favor, digite um número para calcular o seu fatorial: ");
    int numero = entrada.nextInt();
    entrada.close();

    if (numero == 0) {

      System.out.println("0! = 1.");

    } else {

      int fatorial = 1;

      for (int indice = numero; indice > 1; indice--) {
        fatorial *= indice;
      }

      System.out.printf("%d! = %d. \n", numero, fatorial);
    }

  }
}
