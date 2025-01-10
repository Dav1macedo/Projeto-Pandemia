import java.util.Scanner;
import Dao.InsereDAO;
import entity.ArmazenaDados;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma opção:");
        System.out.println("1. Cadastrar Dados");
        System.out.println("2. Alterar Dados");
        
        int escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1:
                cadastrarDados(scanner);
                break;
            case 2:
                alterarDados(scanner);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close(); // Fechar o scanner quando não for mais necessário
    }

    private static void cadastrarDados(Scanner scanner) throws Exception {
        ArmazenaDados dados = new ArmazenaDados ();
        System.out.println("Digite o nome da Cidade:");
        dados.setCidade(scanner.next()); // 
        System.out.println("Digite o número de casos confirmados:");
        dados.setCasos_Confirmados(scanner.nextInt()); 
        System.out.println("Digite o número de Obitos:");
        dados.setObitos(scanner.nextInt());
        System.out.println("Digite o número de Casos_Descartados:");
        dados.setCasos_Descartados(scanner.nextInt());

        new InsereDAO().cadastrarDados(dados);
    }

    private static void alterarDados(Scanner scanner) throws Exception {
        ArmazenaDados dados = new ArmazenaDados();
        System.out.println("Digite o ID do estado que deseja alterar:");
        dados.setId(scanner.nextInt());
        System.out.println("Digite o nome da Cidade:");
        dados.setCidade(scanner.next()); 
        System.out.println("Digite o novo número de casos confirmados:");
        dados.setCasos_Confirmados(scanner.nextInt()); 
        System.out.println("Digite o novo número de Obitos:");
        dados.setObitos(scanner.nextInt());
        System.out.println("Digite o novo número de Casos_Descartados:");
        dados.setCasos_Descartados(scanner.nextInt());

        new InsereDAO().alterarDados(dados);
    }
}
