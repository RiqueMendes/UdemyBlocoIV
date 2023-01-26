package encapsulamento;

public class Pessoa {
    
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) { //Validação para não zerar a idade
    novaIdade = Math.abs(novaIdade);
       if(novaIdade >= 0 && novaIdade <= 120){
        this.idade = novaIdade;
       }
    }

   

    public Pessoa(int idade, String nome) {
        setIdade(idade);
        setNome(nome);
    }

    @Override
    public String toString(){
        return "Olá, eu sou o " + getNome() + " e tenho " +getIdade() + " anos";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
