package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

class Sete {
  
  private ArrayList<String> codUni = new ArrayList<>();
  private ArrayList<String> nomeProtudo = new ArrayList<>();
  private ArrayList<Double> valorUni = new ArrayList<>();
  private ArrayList<String> tipoUnidade = new ArrayList<>();
  private int a = 0;
  private int qntia = 1;
  
  public void menuSete(){
    
    Scanner entrada = new Scanner(System.in);
    int opcoes = 0;
    
    while(true){
      
      System.out.println(".:MENU:. \n1.Cadastrar produto \n2.Atualizar produto \n3.Deletar produto \n4.Venda \n5.Sair");
      opcoes = entrada.nextInt();
      
      switch(opcoes){
          
        case 1:
          cadastrarProduto(entrada);
          break;
          
        case 2:
          atualizarProduto(entrada);
          break;
          
        case 3:
          deletarProduto(entrada);
          break;
          
        case 4:
          venda(entrada);
          break;
          
        case 5:
          System.out.println("Saindo...");
          return;
          
        default:
          System.out.println("OPÇÃO INVÁLIDA! \nREINICIANDO...");
          break;
          
      }
      
    }
    
  }
  
  public void cadastrarProduto(Scanner entrada){
    
    System.out.print("Informe o código único do produto: ");
    entrada.skip("[\r\n]");
    String codigo = entrada.nextLine();
    codUni.add(codigo);
    
    System.out.print("Informe o nome do produto: ");
    String nome = entrada.nextLine();
    nomeProtudo.add(nome);
    
    System.out.print("Informe o valor unitário do produto: ");
    Double valor = entrada.nextDouble();
    valorUni.add(valor);
    
    System.out.print("Informe o tipo de unidade do produto: ");
    entrada.skip("[\r\n]");
    String tipo = entrada.nextLine();
    tipoUnidade.add(tipo);
    
  }
  
  public void atualizarProduto(Scanner entrada){
    
    menu(entrada);
    
    if(a != 0){
            
      System.out.print("Informe o código único do produto: ");
      entrada.skip("[\r\n]");
      String codigo = entrada.nextLine();
      codUni.set( (a-1) ,codigo);
    
      System.out.print("Informe o nome do produto: ");
      String nome = entrada.nextLine();
      nomeProtudo.set( (a-1) ,nome);
    
      System.out.print("Informe o valor unitário do produto: ");
      Double valor = entrada.nextDouble();
      valorUni.set( (a-1) ,valor);
    
      System.out.print("Informe o tipo de unidade do produto: ");
      entrada.skip("[\r\n]");
      String tipo = entrada.nextLine();
      tipoUnidade.set( (a-1) ,tipo);
      
    } else {
      System.out.println("<VAZIO>");
    }
    
  }
  
  public void deletarProduto(Scanner entrada){
    
    menu(entrada);
      
    if(a!=0){
      codUni.remove(a-1);
      nomeProtudo.remove(a-1);
      valorUni.remove(a-1);
      tipoUnidade.remove(a-1);
    }else {
      System.out.println("<VAZIO>");
    }
      
  }
  
  public void venda(Scanner entrada){
        
    menu(entrada);
    
    if(a!=0){
            
      while(true){
        
        System.out.println("Selecione a quantidade: ");
        qntia = entrada.nextInt();
        
        System.out.println("O valor fica em: " + (qntia*valorUni.get(a-1)) + "R$");
        
        System.out.println("Selecione o método de pagamento: \n1.Pix \n2.Cartão de crédito \n3.Cartão de débito \n4.Dinheiro");
        int opcao = entrada.nextInt();
        
        switch(opcao){
            
          case 1:
            System.out.println("PIX: FigolIFGIOoliGuigpPHOh");
            return;
            
          case 2:
            cartao(entrada);
            return;
            
          case 3:
            cartao(entrada);
            return;
            
          case 4:
            dinheiro(entrada);
            return;
            
          case 5:
            System.out.println("Saindo...");
            return;
            
          default:
            System.out.println("Opção inválida! \nReiniciando...");
            break;
            
        }
        
      }
      
    } else{
      System.out.println("<VAZIO>");
    }
    
  }
  
  public void cartao(Scanner entrada){
    
    System.out.println("Lendo cartão...");
    System.out.println("Insira a senha: ");
    entrada.skip("[\r\n]");
    String senha = entrada.nextLine();
    System.out.println("Compra aprovada!");
    
  }
  
  public void dinheiro(Scanner entrada){
    
    while(true){
      
      System.out.println("Informe o valor: ");
      double dinheiro = entrada.nextDouble();
      
      double troco = dinheiro - (qntia*valorUni.get(a-1));
      
      if(troco > 0){
        System.out.println("Troco: " + troco + "R$");
        return;
      } else if(troco == 0){
        System.out.println("Sem troco");
        return;
      } else{
        System.out.println("Valor Insuficiente!");
      }
            
    }
    
  }
  
  public void menu(Scanner entrada){
        
    if(codUni.size() != 0){
      
      System.out.println("\nSelecione o produto: ");
      
      for(int i = 0; i < codUni.size(); i++){
        
        System.out.println( (i+1) + "." + nomeProtudo.get(i) + " " + codUni.get(i) +
                           " " +valorUni.get(i) + "R$ " + tipoUnidade.get(i) );
      }
      
      a = entrada.nextInt();
      
    } else{
      a = 0;
    }
  }
  
}
