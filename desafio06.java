package aula09;
import java.util.Scanner;
public class desafio06 {


public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Digite um número correspondente a um dos meses do ano (1 a 12): ");
int mes = scanner.nextInt();
String estacaoAno = "";

switch (mes) {
    case 12:
    case 1:
    case 2:
estacaoAno = "Verão";
break;

    case 3:
    case 4:
    case 5:
estacaoAno = "Outono";
break;

    case 6:
    case 7:
    case 8:
estacaoAno = "Inverno";
break;

    case 9:
    case 10:
    case 11:
estacaoAno = "Primavera";
break;

default:
System.out.println("Mês inválido! ");
break;
}

System.out.println("A estação do Ano é: " + estacaoAno);

                     scanner.close();

}
}
