import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double celsius=0;
        double fahrenheit=0;
        int valorConversao = 0;
        double temperatura;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Digite o valor da conversão");
            System.out.println("1 - De Fahrenheit para Celsius");
            System.out.println("2 - De Celsius para Fahrenheit");
            System.out.println("0 - Programa encerrado");
            valorConversao = s.nextInt();
            System.out.println("Digite a temperatura");
            temperatura = s.nextDouble();
            if (valorConversao==1) {
                celsius = fahrenheitCelsius(temperatura);
                System.out.println("A temperatura em Celsius será de " +celsius);
            } else if (valorConversao==2) {
                celsiusFahrenheit(temperatura);
            }
            else {
                System.out.println("O valor de conversão é inválido. Digite novamente");
            }
        } while (valorConversao!=0);
    }

    public static final double CINCO = 5;
    public static final double NOVE = 9;
    public static final double TRINTA_E_DOIS = 32;

    public static double fahrenheitCelsius (double temperatura) {
       return (CINCO/NOVE) * (temperatura - TRINTA_E_DOIS);
    }

    public static void celsiusFahrenheit (double temperatura) {
        System.out.println("A temperatura em Fahrenheit será de " +(NOVE/CINCO) * (temperatura + TRINTA_E_DOIS));
    }
}