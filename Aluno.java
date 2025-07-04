public class Aluno extends Usuario{
    private String matricula;
    
    public Aluno(String nome, String cpf, int idade, String email_pessoal,
    String email_instituto, String senha, String matricula){
    super(nome, cpf, idade, email_pessoal, email_instituto, senha);
    this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }
}
