public class Doutor extends Usuario {
    String especializacao;
    int numero_doctor;

    public void usuario (String nome, String cpf, String email, String senha, String rg, String especializacao, int numero_doctor){
        super.nome = nome;
        super.cpf = cpf;
        super.email = email;
        super.senha = senha;
        super.rg = rg;
        this.especializacao = especializacao;
        this.numero_doctor = numero_doctor;

    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public int getNumero_doctor() {
        return numero_doctor;
    }

    public void setNumero_doctor(int numero_doctor) {
        this.numero_doctor = numero_doctor;
    }
}
