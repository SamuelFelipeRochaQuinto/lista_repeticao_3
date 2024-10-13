package exercicios;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    Um qum = new Um(new int[13],1);
    Dois qdois = new Dois(new double[3],new double[3]);
    Tres qtres = new Tres(new int[0], new double[0], new double[0]);
    Quatro qquatro = new Quatro(3,4,new int[4]);
    Cinco qcinco = new Cinco();
    Seis qseis = new Seis();
    Sete qsete = new Sete();
    
    while(true) {
      
      System.out.print("Informe o número da questão (1 a 7 ou outro número para sair) : ");
      int questao = entrada.nextInt();
      
      switch(questao) {
          
        case 1:
          qum.questaoUm();
          break;
          
        case 2:
          qdois.entradaDois();
          break;
        
        case 3:
          qtres.entradaTres();
          break;
          
        case 4:
          System.out.println(qquatro.somaTermos());
          break;
          
        case 5:
          qcinco.entradaCinco();
          break;
          
        case 6:
          qseis.entradaSeis();
          break;
          
        case 7:
          qsete.menuSete();
          break;
          
        default:
          System.out.println("Saindo...");
          return;
          
      }
      
    }
    
    
  }
}
