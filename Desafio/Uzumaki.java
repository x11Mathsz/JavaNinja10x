package NinvelItermediario.Desafio;

public class Uzumaki extends Ninja{
    private String habilidadeEspecial;


    public Uzumaki(String nome, int idade, String sexo, String habilidadeEspecial) {
        super(nome, idade, sexo);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public Uzumaki(String nome, int idade, String sexo, String missao, String nivelDificuldade, String statusMissao, String habilidadeEspecial) {
        super(nome, idade, sexo, missao, nivelDificuldade, statusMissao);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public Uzumaki(String missao, String nivelDificuldade, String statusMissao) {
        super(missao, nivelDificuldade, statusMissao);
    }

    public void motrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: " + getHabilidadeEspecial());
    }


    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: " + getHabilidadeEspecial());
    }


    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }
}
