package aula09;
import java.util.Scanner;

public class desafio04 {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);


System.out.println("Digite um numero inteiro positivo: ");
int nmr = scanner.nextInt();    

int contador = 1;
int fatorial = 1;

while (contador <= nmr ) {
    fatorial *= contador;
    contador++; }

System.out.println("O resultado do Fatorial é: " + fatorial );


                 scanner.close();
                }
               }