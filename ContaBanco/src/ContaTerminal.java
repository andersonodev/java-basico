import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Qual sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Qual saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá" + " " + nomeCliente + " " + "obrigado por criar uma conta em nosso banco, sua agência é: "  + agencia + ", "  + "conta: " +  numero + " " + "e seu saldo de: " + saldo + ", " + "já está disponível para saque!");



       // to do: Conhecer e Importar a Classe Scanner

       // to do: Exibir as mensagens par ao nosso usuário

       // to do: Obter pela classe scanner os valores digitados no terminal

       // to do: Exibir a mensagens da conta criada - mensagem final
    }
}
