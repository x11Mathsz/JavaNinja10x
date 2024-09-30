package NinvelItermediario.Desafio;

public class Ninja {
    private String nome;
    private int idade;
    private String sexo;
    private String missao;
    private String nivelDificuldade;
    private String statusMissao;

    public Ninja(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Ninja(String nome, int idade, String sexo, String missao, String nivelDificuldade, String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }

    public Ninja(String missao, String nivelDificuldade, String statusMissao) {
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }

    //Metodos
    public void mostrarInformacoes(){
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSexo: " + getSexo() +
                "\nMissão: " + getMissao() + "\nNivel da Dificuldade: " + getNivelDificuldade() +
                "\nStatus: " + getStatusMissao());
    }



    //Getters e Setteres

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getStatusMissao() {
        return statusMissao;
    }

    public void setStatusMissao(String statusMissao) {
        this.statusMissao = statusMissao;
    }
}
