package modelo;

import java.security.PublicKey;

public abstract class Guerreiro{
    private final String nome;
    private String poder;
    private int vida = 100;
    private int dano;
    private String classe;

    //-------------- constructor e acessores

    public Guerreiro(String nome, String poder, int dano, String classe) {
        this.nome = nome;
        this.poder = poder;
        this.dano = dano;
        this.classe = classe;
    }
    //---------------------- PODER
    public String getPoder() {
        return poder;
    }
    public void setPoder(String poder) {
        this.poder = poder;
    }
    //---------------------- VIDA
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    //---------------------- DANO
    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }

    //---------------------- CLASSE
    public String getClasse() {
        return classe;
    }

    //------------------------ ESPECIAIS

    public abstract void atacar(Guerreiro alvo);
    public abstract void sofrerDano (int danoSofrido);
}