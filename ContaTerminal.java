import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Integer Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência! ");
        Numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Conta! ");
        Agencia = scanner.next();
        System.out.println("Por favor, digite o nome do Cliente! ");
        NomeCliente = scanner.next();
        System.out.println("Por favor, digite o Saldo da conta! ");
        Saldo = scanner.nextDouble();

        System.out.println("Olá " +NomeCliente+
                ", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+
                ", conta "+Numero+
                " e seu saldo "+Saldo+" já está disponível para saque");
    }
}
