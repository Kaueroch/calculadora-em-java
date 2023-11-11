package calculadora;

import java.util.Locale;
import java.util.Scanner;

public class programa { /* Classe*/
	/* metodo para pedir os numeros e operacao*/
 public static void main (String args[]) { /* metodo*/
 Scanner scanner = new Scanner(System.in); /* Criada para scannear os valores que o usuario vai digitar*/
   Double n1;
   double n2;
   String operacao; /*para saber que tipo de operação o usuario vai querer*/
   /* pedindo o primeiro numero*/
   boolean continuar;
   
   do {
	   System.out.println("Digite um numero: ");
	   n1 = scanner.nextDouble();
	   /* pedindo a operacao*/
	   System.out.println("Digite a operacao(+ , - , / , *)");
	   operacao = scanner.next(); /*COmo é string, não precisa de algo a mais depois do next, só colocar o ()*/
	   /* pedindo o segundo numero*/ 
	   System.out.println("Digite outro numero");
	   n2 = scanner.nextDouble();
	   
	   System.out.println("Resultado: " + realizarCalculo(n1,n2, operacao)); /* se quiser colocar o metodo pra mostrar o 
	   resultado vai ter que colocar o nome do metodo e suas variaveis */   
       continuar = VerificarNovaoperacao();   
       }while(continuar);
   
   
 }
 /* MEtodo para fazer com que a pessoa queira fazer outra conta
  * Next.line serve para analisar a linha em quesstao!
  * */
 public static boolean VerificarNovaoperacao(){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Deseja continuar realizando contas ?  (S/N): ");
	 return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N"); 
 }
  public static Double realizarCalculo(Double n1, Double n2, String operacao) {
	  Double resultado=0.0;
	  switch(operacao) {
	  case "+": 
		resultado = n1 + n2;
		  break;
	  case "-":
		  resultado = n1 - n2;
		  break;
	  case "*": 
		  resultado = n1 * n2;
		  break;
	  case "/":
		  resultado = n1 /n2;
		  
		  default: System.out.println("Operação Inválida! Tente novamente");    /* serve para caso nenhuma das opções acima aconteça, 
		                                                                         ai vai exibir uma mensagem*/ 
	  }
	  return resultado;/*sempre que estiver dando erro peça, termine as etapas 
	                   e o que precisa fazer para retorna a variavel que pode dar certo */ 
  }
}