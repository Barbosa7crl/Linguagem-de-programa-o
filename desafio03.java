package aula09;
import java.util.Scanner;

public class desafio03 {
    public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("digite um numero de 1 a 7 : ");
	int numero = scanner.nextInt();
	
	String diaSemana;
	
	switch (numero) {
	case 1: 
		diaSemana = "Domingo, Fim de semana!";
		break;
		
	case 2: 
		diaSemana = "Segunda, Dia útil!";
		break;
		
	case 3: 
		diaSemana = "Terça, Dia útil!";
		break;
		
	case 4: 
		diaSemana = "Quarta, Dia útil!";
		break;
		
	case 5: 
		diaSemana = "Quinta, Dia útil!";
		break;
		
	case 6: 
		diaSemana = "Sexta, Dia útil!";
		break;
		
	case 7: 
		diaSemana = "Sabado, Fim de Semana!";
		break;
		
	default : 
		diaSemana = "dia invalido!";
		break;
	}
	
	System.out.println("O dia da semana é " + diaSemana);

	scanner.close();

}
}