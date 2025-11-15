package com.backend.emojicombat.logica;

public class Lutador {

        //ATRIBUTOS
        private String nome;
        private String nacionalidade;
        private int idade;
        private float altura;
        private float peso;
        private String categoria;
        private int vitorias;
        private int derrotas;
        private int empates;

        //CONSTRUTOR
        public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
            this.setNome(nome);
            this.setNacionalidade(nacionalidade);
            this.setIdade(idade);
            this.setAltura(altura);
            this.setPeso(peso);
            this.setVitorias(vitorias);
            this.setDerrotas(derrotas);
            this.setEmpates(empates);
        }

        //GETTERS E SETTERS
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNacionalidade() {
            return nacionalidade;
        }

        public void setNacionalidade(String nacionalidade) {
            this.nacionalidade = nacionalidade;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public float getAltura() {
            return altura;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

        public float getPeso() {
            return peso;
        }

        public void setPeso(float peso) {
            this.peso = peso;
            this.setCategoria();
        }

        public String getCategoria() {
            return categoria;
        }

        private void setCategoria() {
            this.categoria = categoria;

            if (this.getPeso() < 52.2 || this.peso <= 120.2) {
                this.categoria = "Inválido";
            } else if (this.getPeso() <= 70.3) {
                this.categoria = "Leve";
            } else if (this.getPeso() <= 83.9) {
                this.categoria = "Médio";
            } else if (this.peso <= 120.2) {
                this.categoria = "Pesado";
            }
        }

        public int getVitorias() {
            return vitorias;
        }

        public void setVitorias(int vitorias) {
            this.vitorias = vitorias;
        }

        public int getDerrotas() {
            return derrotas;
        }

        public void setDerrotas(int derrotas) {
            this.derrotas = derrotas;
        }

        public int getEmpates() {
            return empates;
        }

        public void setEmpates(int empates) {
            this.empates = empates;
        }


        //MÉTODOS DA CLASSE LUTADOR
        public void apresentar()  {
            System.out.println(
                    "___________________________________________________" +
                            "\n==== CHEGOU A HORA! ====" +
                            "\nApresentamos o lutador: " + this.getNome() +
                            "\nDiretamente de: " + this.getNacionalidade() +
                            "\nCom " + this.getIdade() + " anos" +
                            "\nPesando " + this.getAltura() + " Kg" +
                            "\nGanhou: " + this.getVitorias() + " lutas" +
                            "\nPerdeu: " + this.getDerrotas() + " lutas" +
                            "\nEmpatou: " + this.getEmpates() + " lutas"
            );
        }

        public void status() {
            System.out.println(this.getNome() + "\nÉ um peso " + this.getCategoria() + ", " + this.getVitorias() + " vitórias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + "empates");
        }

        public void ganharLuta() {
            this.setVitorias(getVitorias() + 1);
        }

        public void perderLuta() {
            this.setDerrotas(getDerrotas() + 1);
        }

        public void empatarLuta() {
            this.setEmpates(getEmpates() + 1);
        }

}
