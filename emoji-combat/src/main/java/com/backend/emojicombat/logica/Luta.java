package com.backend.emojicombat.logica;

public class Luta {

    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;


    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    public void marcarLuta (Lutador desafiante, Lutador desafiado) {
        if (desafiante.getCategoria() == desafiado.getCategoria() && desafiante != desafiado) {
            setAprovada(true);

        } else {
            System.out.printf("Luta não pode acontecer!");
        }
    }

    public void lutar () {
        desafiante.apresentar();
        desafiado.apresentar();
        
    }
}
