import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\s*");

        // Declaração das variáveis
        int numeroAgencia;
        String nomeCliente;
        double saldo;

        // Solicitação dos dados ao usuário
        System.out.print("Por favor, digite o número da agência: ");
        numeroAgencia = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine().trim();

        System.out.print("Digite o saldo: ");
        String saldoString = scanner.nextLine().replace(",", ".");
        saldo = Double.parseDouble(saldoString);
        
        // Exibição da mensagem de boas-vindas
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia eh " + numeroAgencia + ", conta " + numeroAgencia
 + " e seu saldo " + saldo + " ja esta disponivel para saque."); 
        scanner.close();
    }
}