package main;

import model.Biblioteca;
import model.DVD;
import model.Item;
import model.Livro;

import java.util.Scanner;

public class MenuProcessor {
    private Biblioteca biblioteca;

    public MenuProcessor() {
        this.biblioteca = new Biblioteca();
    }

    public void processMenuOption(int opcao) {
        Scanner scanner = new Scanner(System.in);

        switch (opcao) {
            case 1:
                adicionarLivro(scanner);
                break;
            case 2:
                adicionarDVD(scanner);
                break;
            case 3:
                emprestar(scanner);
                break;
            case 4:
                devolver(scanner);
                break;
            case 5:
                listar(scanner);
                break;
            case 6:
                System.out.println("Sair selecionado. Encerrando o programa...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private  void  adicionarLivro(Scanner scanner) {
        System.out.println("Digite o título do livro:");
        String tituloLivro = scanner.nextLine();
        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();
        Livro livro = new Livro(tituloLivro, autor);
        biblioteca.adicionarItem(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    private void adicionarDVD(Scanner scanner) {
        System.out.println("Digite o nome do DVD");
        String tituloDVD = scanner.nextLine();
        System.out.println("Digite o ano de lançamento:");
        int ano = scanner.nextInt();
        DVD dvd = new DVD(tituloDVD, ano);
        biblioteca.adicionarItem(dvd);
        System.out.println("DVD adicionado com sucesso!");
    }

    private void emprestar(Scanner scanner) {
        System.out.println("Digite o item que você quer emprestar:");
        String titulo = scanner.nextLine();
        biblioteca.emprestarItem(titulo);
    }

    private void devolver(Scanner scanner) {
        System.out.println("Digite o titulo do item que você quer devolver:");
        String titulo = scanner.nextLine();
        Item item = new Item(titulo);
        biblioteca.devolverItem(item);
    }

    private void listar(Scanner scanner) {
        if (biblioteca.listarItens().isEmpty()) {
            System.out.println("A biblioteca está vazia, não há itens para listar.");
        } else {
            System.out.println("Itens disponíveis:");
            for (Item item : biblioteca.listarItens()) {
                System.out.println(item);
            }
        }
    }



}
