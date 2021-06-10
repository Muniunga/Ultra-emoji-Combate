package ultraemojicombat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muniunga
 */
public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    /**
     *
     * Metodos publicos
     */
    public void apresentar() {
        System.out.println("Chegou a hora! Apresentamos o lutador:  " +this.getNome());
        System.out.println("Diretamente de: " +this.getNacionalidade());
        System.out.println("Com: "+this.getIdade()+" anos e "+this.altura+ " metros de altura");
        System.out.println("Pesando: "+this.getPeso()+" Kg");
        System.out.println(this.getVitorias()+" Vitorias");
        System.out.println(this.getEmpates()+" Empates");
        System.out.println(this.getDerrotas()+" Derrotas");
        
    }

    public void status() {
        System.out.println(this.getNome()+" é um peso "+ this.getCategoria());
        System.out.println("Ganhou: "+this.getVitorias()+" Vezes");
        System.out.println("Empatou: "+this.getEmpates()+" Vezes");
        System.out.println("Perdeu: "+this.getDerrotas()+" Vezes");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    /**
     *
     * Metodos especiais
     */
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

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
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

}
