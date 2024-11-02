
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeCliente = "";
        String agencia = "";
        int numero;
        double saldo;

        System.out.println("Digite seu nome:");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o número da sua conta:");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o número da sua agência:");
        agencia = scanner.nextLine();
        System.out.println("Digite o seu saldo:");
        saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
