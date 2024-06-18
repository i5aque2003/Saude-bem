public class Cliente extends Usuario {
    int id_paciente;
    String telefone;


    public void usuario(String nome, String cpf, String email, String senha, String rg, int id_paciente, String telefone) {
        super.nome = nome;
        super.cpf = cpf;
        super.email = email;
        super.senha = senha;
        super.rg = rg;
        this.id_paciente = id_paciente;
        this.telefone = telefone;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
