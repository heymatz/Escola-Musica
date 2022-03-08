
import java.util.ArrayList;

public class Campos {

    private String cpf;
    private String datan;
    private int telefone;
    private String nome;
    private String cidade;
    private String curso;

    public static ArrayList<Campos> vet = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatan() {
        return datan;
    }

    public void setDatan(String datan) {
        this.datan = datan;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
