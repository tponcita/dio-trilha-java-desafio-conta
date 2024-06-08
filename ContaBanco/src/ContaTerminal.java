import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        String nomeCliente = "MARIO ANDRADE";
        String agencia = "067-8";
        int numero = 1021;
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        int conta = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e seu saldo " + + saldo +  " já está disponível para saque.");
    }
}