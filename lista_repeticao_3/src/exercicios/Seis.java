package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

class Seis {
  
  ArrayList<String> pacientes = new ArrayList<>();
  Scanner entrada = new Scanner(System.in);
  
  public Seis(){}
  
  public void entradaSeis(){
    
    int opcao = 0;
    
    while(true){
      
      System.out.println(".:MENU:. \n1.Cadastrar paciente \n2.Vizualizar pacientes cadastrados \n3.Sair");
      opcao = entrada.nextInt();
      
      switch(opcao){
          
        case 1:
          cadastrarPaciente();
          break;
          
        case 2:
          pacientesCadastrados();
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
  
  public void cadastrarPaciente(){
    
    System.out.println("Informe o nome do paciente: ");
    entrada.skip("[\r\n]");
    String nome = entrada.nextLine();
    
    pacientes.add(nome);
    
  }
  
  public void pacientesCadastrados(){
    
    for(int i = 0; i < pacientes.size(); i++){
      System.out.println(pacientes.get(i));
    }
    
  }
  
}
