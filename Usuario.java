public class Usuario {
    private String nome;
    private int idade;
    private String cpf;
    private String email_pessoal;
    private String email_instituto;
    private String senha;

    public Usuario(String nome, String cpf, int idade, String email_pessoal,
    String email_instituto, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        if(nome !=""){
            this.nome = nome;
        }
    }
    
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf (String cpf){
        if(cpf !=""){
            this.cpf = cpf;
        }
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        if(idade !=0){
            this.idade = idade;
        }
    }
        
    public String getEmail_pessoal(){
        return this.email_pessoal;
    }
    public void setEmail_pessoal (String Email_pessoal){
        if(Email_pessoal !=""){
            this.email_pessoal = Email_pessoal;
        }
    }
        public String Email_instituto(){
        return this.email_instituto;
    }
    public void Email_instituto (String Email_instituto){
        if(Email_instituto !=""){
            this.email_instituto = Email_instituto;
        }
    }
        public String senha(){
        return this.senha;
    }
    public void senha (String senha){
        if(senha !=""){
            this.senha = senha;
        }
    }
}
