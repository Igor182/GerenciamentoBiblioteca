package model;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private List<Item> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        acervo.add(item);
    }

    public void emprestarItem(String titulo) {
        Item itemEmprestado = null;
        for (Item item : acervo) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                itemEmprestado = item;
                break; // Termina o loop após encontrar o item
            }
        }
        if (itemEmprestado != null) {
            acervo.remove(itemEmprestado);
            System.out.println("Item emprestado: " + itemEmprestado);
        } else {
            System.out.println("Item não encontrado na biblioteca.");
        }
    }

    public void devolverItem(Item item) {
        acervo.add(item);
        System.out.println("Item devolvido" + item);
    }

    public List<Item> listarItens(){
        return acervo;
    }



}
