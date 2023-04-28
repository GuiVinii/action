public class Usuario{
    public String nome;
    public String CPF;
    public String tel;
    public String dtNascimento;
    public String dtAgendamento;
    public String pediiodo;

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", tel='" + tel + '\'' +
                ", dtNascimento='" + dtNascimento + '\'' +
                ", dtAgendamento='" + dtAgendamento + '\'' +
                ", pediiodo='" + pediiodo + '\'' +
                '}';
    }

    public Usuario(String[] usuario) {
        this.nome = usuario[0];
        this.CPF = usuario[1];
        this.tel = usuario[2];
        this.dtNascimento = usuario[3];
        this.dtAgendamento = usuario[4];
        this.pediiodo = usuario[5];
    }

    public Usuario(String nome, String CPF, String tel, String dtNascimento, String dtAgendamento, String pediiodo) {
        this.nome = nome;
        this.CPF = CPF;
        this.tel = tel;
        this.dtNascimento = dtNascimento;
        this.dtAgendamento = dtAgendamento;
        this.pediiodo = pediiodo;
    }
}
