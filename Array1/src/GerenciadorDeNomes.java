import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciadorDeNomes {

    private ArrayList<String> nomes = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        int op;
        boolean continuar = true;

        while (continuar) {
            menu();

            try {
                op = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite apenas números.");
                sc.nextLine();
                continue;
            }

            switch (op) {
                case 1:
                    adicionar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    Indice();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saindo do sistema!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void menu() {
        System.out.println("1. Adicionar nome\n2. Listar os nomes\n3. Busca por Índice\n4. Sair");
        System.out.print("OPÇÃO : ");


    }

    private void adicionar() {
        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();
        nomes.add(nome);
        System.out.println("Nome adicionado!");
    }

    private void listar() {
        for (String n : nomes){
            System.out.println(n);
        }

    }

    private void Indice() {
        try {
            System.out.print("Digite o índice: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Nome: " + nomes.get(id));

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número.");
            sc.nextLine();

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: índice inexistente.");
        }
    }
}
