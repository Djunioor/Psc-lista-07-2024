import java.util.ArrayList;
import java.util.Scanner;

public class Questao02 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<String> perguntas = new ArrayList<>();
    int contadorSim = 0;
    int contadorNao = 0;

    System.out.println("Digite sim [S] ou não [N] para as repostas: ");
    perguntas.add("Telefonou para a vítima?");
    perguntas.add("Esteve no local do crime?");
    perguntas.add("Mora perto da vítima?");
    perguntas.add("Devia dinheiro para a vítima?");
    perguntas.add("Já trabalhou com a vítima?");

    for (String pergunta : perguntas) {
      System.out.println(pergunta);
      char resposta = input.next().charAt(0);

      if (resposta == 'S' || resposta == 's') {
        System.out.println("Resposta: Sim");
        contadorSim++;
      } else {
        System.out.println("Resposta: Não");
        contadorNao++;
      }
    }

    // Classificação da participação
    if (contadorSim == 2) {
      System.out.println("Suspeita");
    } else if (contadorSim >= 3 && contadorSim <= 4) {
      System.out.println("Cúmplice");
    } else if (contadorSim == 5) {
      System.out.println("Assassino");
    } else {
      System.out.println("Inocente");
    }

    input.close();
  }
}