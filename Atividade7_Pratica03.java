
/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica03_Atividade07
* Descrição: Escreva um programa que, dada a carga máxima de um elevador e a quantidade máxima de pessoas digitadas pelo usuário, leia o peso de cada pessoa, 
* também digitada pelo usuário, que entra no elevador até que a carga máxima seja atingida ou o número máximo de pessoas seja atingido (utilize do / while).
* Data: 19/04/2023
*/

import javax.swing.JOptionPane;

public class Atividade7_Pratica03 {

  public static void main(String[] args) {

    double pesoTotal = 0;
    int totalPessoas = 0;

    do {

      int qtdadePessoas = Integer
          .parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de pessoas que entram no elevador: "));
      totalPessoas += qtdadePessoas;

      if (totalPessoas > 8) {
        JOptionPane.showMessageDialog(null, "Máximo de pessoas alcançado, elevador lotado.");
        break;
      }

      for (int indice = 1; indice <= qtdadePessoas; indice++) {

        double pesoPessoa = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Informe agora o peso da pessoa " + indice + " que entrou no elevador, em kg:  "));
        pesoTotal += pesoPessoa;
      }

      if (pesoTotal > 560) {
        JOptionPane.showMessageDialog(null, "Peso máximo ultrapassado, elevador paralisado.");
      }

    } while ((totalPessoas <= 8 && pesoTotal <= 560));

  }
}
