import java.util.Scanner;

public class A1Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme a placa do seu Veículo: ");
        String placa = scanner.nextLine();

        System.out.println("\nInforme o valor do litro do combustível: ");
        double valorCombustivel = scanner.nextDouble();

        System.out.println("\nInforme a quantidade de quilômetros rodados a 60 KM/H: ");
        double quilometros60 = scanner.nextDouble();

        System.out.println("\nInforme a quantidade de quilômetros rodados a 80 KM/H: ");
        double quilometros80 = scanner.nextDouble();

        System.out.println("\nInforme a quantidade de quilômetros rodados a 100 KM/H: ");
        double quilometros100 = scanner.nextDouble();

        System.out.println("\nInforme a quantidade de quilômetros rodados a 120 KM/H: ");
        double quilometros120 = scanner.nextDouble();

        System.out.println("\nInforme a quantidade de quilômetros rodados a 140 KM/H: ");
        double quilometros140 = scanner.nextDouble();

        // 60 km/h = 30,7 consumo
        // 80 km/h = 26,8 consumo
        // 100 km/h = 22,4 consumo
        // 120 km/h = 18,1 consumo
        // 140 km/h = 14,5 consumo

        double gastoCombustivel60 = quilometros60 / 30.7;
        double gastoCombustivel80 = quilometros80 / 26.8;
        double gastoCombustivel100 = quilometros100 / 22.4;
        double gastoCombustivel120 = quilometros120 / 18.1;
        double gastoCombustivel140 = quilometros140 / 14.5;

        double gastoTotalCombustivel = gastoCombustivel60 + gastoCombustivel80 + gastoCombustivel100 + gastoCombustivel120 + gastoCombustivel140;
        double custoTotalViagem = gastoTotalCombustivel * valorCombustivel;
        double velocidadeMedia = (((60 * quilometros60) + (80 * quilometros80) + (100 * quilometros100) + (120 * quilometros120) + (140 * quilometros140)) / (quilometros60 + quilometros80 + quilometros100 + quilometros120 + quilometros140));

        System.out.println("\nPlaca: " + placa);
        System.out.printf("Quantidade total de combustivel necessaria: %2.4f", gastoTotalCombustivel);
        System.out.printf("\nCusto total da viagem: %2.2f", custoTotalViagem);
        System.out.println("\nVelocidade média ponderada da viagem: " + velocidadeMedia + " km/h");
        scanner.close();
    }
}