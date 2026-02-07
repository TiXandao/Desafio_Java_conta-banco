import java.util.Scanner;
public class ContaTerminal {
    
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        
        int numeroConta = 0;
        String numeroAgencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        System.out.println("===== BANCO DO XANDÃO =====");
        System.out.println("  ----CADASTRO SEGURO----  ");
        // Iniciando com try e seguindo com if, while e do
        try {
            // 1. Validar o número da conta, coloquei um código para não passar letras, mas não consegui travar o Enter
            System.out.print("Digite o número da Conta: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida! Digite um número inteiro para a conta: ");
                scanner.next(); 
            }
            numeroConta = scanner.nextInt();
            scanner.nextLine(); // Complementei com uma próxima linha

            // 2. Validar o número da Agência...
            do {
                System.out.print("Digite a Agência: ");
                numeroAgencia = scanner.nextLine().trim();
                if (numeroAgencia.isEmpty()) {
                    System.out.println("Erro! A agência não pode ficar vazia. Tente novamente.");
                }
            } while (numeroAgencia.isEmpty());

            // 3. Validar o nome da pessoa, sem quantidade de caracteres.
            do {
                System.out.print("Digite o seu Nome: ");
                nomeCliente = scanner.nextLine().trim();
                if (nomeCliente.isEmpty()) {
                    System.out.println("Erro! O nome é obrigatório para o cadastro!");
                }
            } while (nomeCliente.isEmpty());

            // 4. Validar o saldo.
            System.out.print("Digite o Saldo inicial: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Entrada inválida! Digite o saldo (ex: 150,50): ");
                scanner.next();
            }
            saldo = scanner.nextDouble();

            // 5. Aqui coloquei a estrutura if-else
            if (saldo < 0) {
                System.out.println("Atenção: Você iniciou com saldo negativo.");
            } else {
                System.out.println("Saldo inicial registrado com sucesso.");
            }

            // 6. Fiz a estrutura de repetição com for para o simulador
            System.out.println("\n--- SIMULADOR DE RENDIMENTO (6 MESES) ---");
            double saldoSimulado = saldo;
            for (int mes = 1; mes <= 6; mes++) {
                saldoSimulado += saldoSimulado * 0.005; // Rendimento de 0.5% ao mês
                System.out.println("Mês " + mes + " | Saldo previsto: R$ " + String.format("%.2f", saldoSimulado));
            }

        } catch (Exception e) {
            // 7. Coloquei para encrementar também, tive ajuda de um amigo para esta parte
            System.err.println("Erro crítico no sistema: " + e.getMessage());
        } finally {
            // 8. ESTRUTURA FINALLY
            System.out.println("\nProcesso de cadastro finalizado.");
        }

        // Resultado final, imprime simulador e o restando do programa
        System.out.println("\n-----------------------------------------");
        String mensagemFinal = "Olá " + nomeCliente + ",\n" +
                               "obrigado por criar uma conta em nosso banco!\n" +
                               "Sua agência é " + numeroAgencia + ", conta " + numeroConta + "\n" +
                               "e seu saldo R$ " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagemFinal);
        
        scanner.close();

       

    }
}
