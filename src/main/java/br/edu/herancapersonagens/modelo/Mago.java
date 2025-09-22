package modelo;

public class Mago extends Guerreiro{
    private int cura = 30;

//--------------------------CONSTRUTOR
    public Mago(String nome, String poder, int dano, String classe) {
        super(nome, poder, dano, classe);
        super.setVida(60);
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
    public void curar(){
        this.setVida(this.cura);
    }
}
