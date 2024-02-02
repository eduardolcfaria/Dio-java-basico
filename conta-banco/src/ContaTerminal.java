import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        int numConta;
        String numAgencia, nomeCliente;
        double saldoConta;

        System.out.println("Por favor, digite o número da Conta!: ");
        numConta = ler.nextInt();
        System.out.println("Por favor, digite o número da Agência!: ");
        numAgencia = ler.next();

        
        ler.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = ler.nextLine(); 
        System.out.println("Por favor, digite o valor do Saldo: ");
        saldoConta = ler.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + " conta " + numConta + " e seu saldo " + saldoConta + " já está disponível para saque.");

        ler.close();
    }
}
