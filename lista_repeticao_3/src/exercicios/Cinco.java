package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

class Cinco {
  
  ArrayList<String> medicos = new ArrayList<>();
  Scanner entrada = new Scanner(System.in);
  
  public Cinco(){}
  
  public void entradaCinco(){
    
    int opcao = 0;
    
    while(true){
      
      System.out.println(".:MENU:. \n1.Cadastrar médico \n2.Vizualizar médicos cadastrados \n3.Sair");
      opcao = entrada.nextInt();
      
      switch(opcao){
          
        case 1:
          cadastrarMedico();
          break;
          
        case 2:
          medicosCadastrados();
          break;
          
        case 3:
          System.out.println("Saindo...");
          return;
          
        default:
          System.out.println("Opção inválida! \nReiniciando...");
          break;
          
      }
      
    }
    
  }
  
  public void cadastrarMedico(){
    
    System.out.println("Informe o nome do médico: ");
    entrada.skip("[\r\n]");
    String nome = entrada.nextLine();
    
    medicos.add(nome);
    
  }
  
  public void medicosCadastrados(){
    for(int i = 0; i < medicos.size(); i++){
      System.out.println(medicos.get(i));
    }
  }
  
}
