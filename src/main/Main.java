package main;

import model.Biblioteca;
import model.DVD;
import model.Livro;
import model.Item;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuProcessor menuProcessor = new MenuProcessor();



        while (true){
            System.out.println("\n### Gerenciamento de Biblioteca ###");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Adicionar DVD");
            System.out.println("3. Emprestar Item");
            System.out.println("4. Devolver Item");
            System.out.println("5. Listar Itens");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            //Chama o método pra processar a opção menu
            menuProcessor.processMenuOption(opcao);
        }
    }
}