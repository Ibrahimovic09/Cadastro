
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar cadastros");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();

                    nomes.add(nome);

                    System.out.println("Cadastro realizado com sucesso!");
                    break;

                case 2:
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum cadastro encontrado.");
                    } else {
                        System.out.println("\n=== LISTA DE CADASTROS ===");

                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println((i + 1) + " - " + nomes.get(i));
                        }
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}
