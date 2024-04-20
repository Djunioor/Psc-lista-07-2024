import java.util.Scanner;
import java.util.ArrayList;

public class Questao01{
    public static class TemperaturaMensal {
        String mes;
        float temperatura;

        public TemperaturaMensal(String mes, float temperatura) {
            this.mes = mes;
            this.temperatura = temperatura;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<TemperaturaMensal> temperaturas = new ArrayList<>();
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        float somaTemperaturas = 0.0f;

        System.out.println("Informe as temperaturas médias dos meses do ano: ");
        for (String mes : meses) {
            System.out.print(mes + ": ");
            float temp = input.nextFloat();
            temperaturas.add(new TemperaturaMensal(mes, temp));
            somaTemperaturas += temp;
        }

        float mediaTemperaturas = somaTemperaturas / temperaturas.size();

        for (TemperaturaMensal temp : temperaturas) {
            if (temp.temperatura >= mediaTemperaturas) {
                System.out.println(temp.mes + ": " + temp.temperatura + "Cº");
            }
        }

        input.close();
    }
}
