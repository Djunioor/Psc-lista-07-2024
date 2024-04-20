import java.util.Scanner;
import java.util.ArrayList;

public class Questao03 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> num = new ArrayList<Double>();

        double inserir;
        double soma = 0;
        double media = 0;
        int quantidade = 0;
        int quantidadeMedia = 0;
        int quantidadeMenor7 = 0;

        do{
            System.out.println("Insire um número (Insira -1 para encerrar): ");
            inserir = input.nextDouble();

            if (inserir != -1) {
                num.add(inserir);
                quantidade++;
            }

        }while(inserir != -1);

        System.out.println("Quantidade de números inseridos: " + quantidade);

        System.out.println("Números inseridos na ordem de entrada:");
        for(int i = 0; i < quantidade; i++){
            System.out.print(num.get(i) + " ");
        }

        System.out.println("\nNúmeros inseridos na ordem inversa:");
        for(int i = quantidade - 1; i >= 0; i--){
            System.out.println(num.get(i));
        }

        for(int i = 0; i < quantidade; i++){
            soma += num.get(i);
        }
        System.out.println("A soma dos números é: " + soma);

        media = soma / quantidade;
        System.out.println("A média dos números é: " + media);

        for(int i = 0; i < quantidade; i++){
            if (num.get(i) < media) {
                quantidadeMedia++;
            }
        }
        System.out.println("A quantidade de números acima da média é: " + quantidadeMedia);

        for(int i = 0; i < quantidade; i++){
            if (num.get(i) < 7) {
                quantidadeMenor7++;
            }
        }
        System.out.println("A quantidade de números abaixo de 7 é: " + quantidadeMenor7);

        input.close();
   } 
}