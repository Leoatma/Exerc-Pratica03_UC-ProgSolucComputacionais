/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica03_Atividade06
* Descrição: Um determinado gás duplica seu volume a cada segundo. Dada um volume inicial, em centímetros cúbicos, digitado pelo usuário 
* faça um programa que determine o tempo necessário para que esse volume se torne maior que 1000 centímetros cúbicos. (utilize while)
* Data: 19/04/2023
*/

import java.util.Scanner;

public class Atividade6_Pratica03 {

  public static void main(String[] args) {

    Scanner entradaTeclado = new Scanner(System.in);

    System.out.println("Favor informar o volume inicial do gás, em cm³: ");
    double volumeGas = entradaTeclado.nextDouble();
    entradaTeclado.close();

    double volumeGasFinal = volumeGas;

    int tempoSegundos = 0;

    while (volumeGasFinal <= 1000) {
      volumeGasFinal *= 2;
      tempoSegundos++;
    }

    System.out.printf("Para que o volume de %.1fcm³ se torne maior que 1000cm³, serão necessários %d segundos. \n",
        volumeGas, tempoSegundos);

  }
}
