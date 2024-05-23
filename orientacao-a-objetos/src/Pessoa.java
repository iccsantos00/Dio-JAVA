public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
