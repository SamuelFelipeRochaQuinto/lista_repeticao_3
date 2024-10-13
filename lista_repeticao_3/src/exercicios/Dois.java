package exercicios;

import java.util.Scanner;

class Dois {
  
  private double[] nota = new double[3];
  private double[] peso = new double[3];
  
  public Dois (double[] nota, double[] peso){
    this.nota = nota;
    this.peso = peso;
  }
  
  public void entradaDois() {
    
    Scanner entrada = new Scanner(System.in);
    int opcao = 0;
    while(opcao != 3){
      
      System.out.println("Menu de opções: \n1.Média Aritmética \n2.Média Ponderada \n3.Sair");
      opcao = entrada.nextInt();
            
      Dois qdois = new Dois(new double[3], new double[3]);
      double[] nota = new double[3];
      double[] peso = new double[3];
            
      switch(opcao){
          
          case 1:
                
            for(int i = 0; i < 2; i++){
              
              System.out.print("Informe a " + (i+1) + "° nota: ");
              nota[i] = entrada.nextDouble();
              peso[i] = 1.0;
              qdois = new Dois (nota, peso);
                  
              }
                
              nota[2] = 0.0;
              peso[2] = 0.0;
                                
              qdois.media(qdois);
              break;
                
              case 2:
                
                for(int i = 0; i < 3; i++){
                  
                  System.out.print("Informe a " + (i+1) + "° nota: ");
                  nota[i] = entrada.nextDouble();
                  
                  System.out.print("Informe seu respectivo peso: ");
                  peso[i] = entrada.nextDouble();
                  
                  qdois = new Dois (nota, peso);
                  
                }
                                                
                qdois.media(qdois);
                break;
                
              case 3:
                System.out.println("SAINDO...");
                break;
                
              default:
                break;
                
            }
    }
    
  }
  
  public void media(Dois novoDois){
    
    double media = (((nota[0]*peso[0])+(nota[1]*peso[1])+(nota[2]*peso[2]))/(peso[0]+peso[1]+peso[2]));
    
    System.out.println(media);
    
  }
  
}
