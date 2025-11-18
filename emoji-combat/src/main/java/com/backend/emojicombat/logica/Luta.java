package com.backend.emojicombat.logica;

import java.util.Random;

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


    public void marcarLuta (Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            setAprovada(true);
            desafiante = l1;
            desafiado = l2;

        } else {
            setAprovada(false);
            desafiante = null;
            desafiado = null;
        }
    }

    public void lutar (){
        if (this.aprovada) {
            System.out.println("\n=== DESAFIANTE ===");
            this.desafiante.apresentar();
            System.out.println("\n=== DESAFIADO ===");
            this.desafiado.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //vai gerar números: 0,1 ou 2, e guardar na variável "vencedor"
            System.out.println("\n===== RESULTADO DA LUTA =====");
            switch (vencedor) {
                case 0: //empate
                    System.out.println("Empatou!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;

                case 1: //desafiado vence
                    System.out.println(this.desafiado.getNome() + " venceu!");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;

                case 2: //desafiante vence
                    System.out.println(this.desafiante.getNome() + " venceu!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("--------------------------------------------");


        } else {
            System.out.println("A luta não pode acontecer!");
        }

    }
}
