import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
 Scanner sc = new Scanner (System.in);
    System.out.println("digite sua senha:");
    int senha1 = 2022;
    int senha = sc.nextInt();

  if ( senha == senha1 ){ 
  System.out.println("acesso permitido");
  } else { 
    System.out.println("senha incorreta");
    
  }


    

  sc.close();
  }

}