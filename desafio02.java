package aula09;

import java.util.Scanner;

public class desafio02 {
public static void main(String[]args) {
Scanner scanner = new Scanner(System.in);
	
System.out.println("Insira um número: ");
int nmr = scanner.nextInt();

if (nmr % 2 == 0) {
System.out.println("O número é Par!");
}
else {
System.out.println("O número é impar!");
}

           scanner.close();

}
}
