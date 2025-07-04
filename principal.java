public class principal {
    public static void main(String[]args){
        Pessoa maria = new Pessoa("maria da silva","01234567890", 13    );
        maria.setNome("Maria da Silva");
        System.out.println(maria.getNome());
        System.out.println("Idade"+maria.getIdade());
    }
}
