package modelo;

public class Barbaro extends Guerreiro{
    private int burst = 70;

    //--------------------------CONSTRUTOR
    public Barbaro(String nome, String poder, int dano, String classe) {
        super(nome, poder, dano, classe);
        super.setVida(90);
    }

    //--------------------------SOBREPOSTO
    @Override
    public void atacar(Guerreiro alvo) {
        alvo.setVida(this.getDano());
    }

    @Override
    public void sofrerDano(int dano ){
        this.setVida( getVida() - dano );
    }

    //--------------------------ESPECIAL
    public void burst(){this.setVida(this.burst);
    this.setDano(this.getDano());}
}