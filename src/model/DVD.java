package model;

public class DVD extends Item{
    private int ano;

    public DVD(String titulo, int ano) {
        super(titulo);
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "DVD: " + getTitulo() + " (" + ano + ")";
    }
}
