public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    
    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf =cpf;
        this.idade = idade;
    }

    public String getNome(){
    return this.nome;
    }
    public void setNome (String nome){
        if(nome !=""){
            this.nome = nome;
        }
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade (int idade){
        if(idade != 0){
            this.idade = idade;
        }
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        if(cpf !=""){
            this.cpf = cpf;
        }
    }
}
