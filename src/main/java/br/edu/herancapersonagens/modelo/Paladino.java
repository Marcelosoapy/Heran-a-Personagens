package modelo;

public class Paladino extends Guerreiro{

    private int uncao= 10;

    public Paladino(String nome, String poder, int dano, String classe) {
        super(nome, poder, dano, classe);
        super.setVida(50);
    }

    @Override
    public void atacar(Guerreiro alvo) {
        alvo.setVida(this.getDano());
    }

    @Override
    public void sofrerDano(int danoSofrido) {
        this.setVida( getVida() - danoSofrido );
    }

    public void benzimento (Guerreiro alvo){
        alvo.setVida( alvo.getVida() - (this.uncao + this.getDano()));
    }
}
