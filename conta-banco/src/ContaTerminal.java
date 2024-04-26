import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter  pela Scanner os valores digitados no terminal 
        //Exibir a mensagem da conta criada

        int number;
        String agency, name;
        double balance;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        number = sc.nextInt();
        sc.nextLine();
    
        System.out.println("Por favor, digite o número da Agência! ");
        agency = sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente! ");
        name = sc.nextLine();

        System.out.println("Por favor, digite o saldo do cliente.");
        balance = sc.nextDouble();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo é " + balance + " já está disponível para saque.");







        sc.close();
    }
}
