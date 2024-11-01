import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Digite o número da Conta!");
        int conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite seu nome completo!");
        String nome = scanner.nextLine();

        System.out.println("Informe o saldo:");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá! " + nome + ".");
        System.out.println("Obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + " e conta " + conta);
        System.out.println("Seu saldo R$ " + saldo + " já está disponível para saque.");

    }
}
