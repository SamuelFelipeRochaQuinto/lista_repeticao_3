package exercicios;

import java.util.Scanner;

class Um {
  
  private int[] canais = new int[13];
  private int casa = 1;
  Scanner entrada = new Scanner(System.in);
  
  public Um(){}
  
  public Um (int[] canais, int casa) {
        
        this.canais = canais;
        this.casa = casa;
        
  }
  
  public void questaoUm() {
    
    int[] canais = new int[13];
    int casa = 1;
    Um um = new Um(new int[13],1);
        
    while (true){
      
      System.out.println("Selecione o canal assistido na " + casa + "° casa: \n.4 \n.5 \n.7 \n.12 \nOutro número: TV desligada");
      int numCanal = entrada.nextInt();
      
      if(numCanal == 4 || numCanal == 5 || numCanal == 7 || numCanal == 12){
        
        System.out.println("Informe quantas pessoas assistiam a esse canal: ");        
        canais[numCanal] += entrada.nextInt();
        casa++;
        
      } else if(numCanal == 0){
        break;
        
      } else {
        System.out.println("Casa retirada da pesquisa");
      }
            
    }
    
    um = new Um(canais,casa);
    calcularPorcentagem(um);
    
    
  }
  
  public void calcularPorcentagem(Um novoUm){
    
    int total = (novoUm.canais[4]+novoUm.canais[5]+novoUm.canais[7]+novoUm.canais[12]);
    
    if(novoUm.canais[4]+novoUm.canais[5]+novoUm.canais[7]+novoUm.canais[12]!=0){
      
      double porcentagem4 = novoUm.canais[4]*100/total;
      double porcentagem5 = novoUm.canais[5]*100/total;
   	  double porcentagem7 = novoUm.canais[7]*100/total;
   	  double porcentagem12 = novoUm.canais[12]*100/total;
      
      System.out.println("\nCanal 4: " + porcentagem4 + "%" +
                       "\nCanal 5: " + porcentagem5 + "%" +
                      "\nCanal 7: " + porcentagem7 + "%" +
                      "\nCanal12: " + porcentagem12 + "% \n");
      
    }
    
    System.out.println("Ninguém estava assistindo TV ness dia");
    
  }
  
  
}
