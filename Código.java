import java.util.Scanner;

public class ConversorRadianosParaGraus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor em radianos ao usuário
        System.out.print("Digite o valor em radianos: ");
        double radianos = scanner.nextDouble();

        // Converter radianos para graus usando o método toDegrees da classe Math
        double graus = Math.toDegrees(radianos);

        // Exibir o resultado da conversão
        System.out.println("O valor em graus é: " + graus);

        scanner.close();
    }
}
