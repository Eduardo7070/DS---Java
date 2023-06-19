package ProjetoDS;

public class Agenda {
    private String dia;
    private String mes;
    private String ano;
    private String nome;
    private String desc;

    public Agenda(String dia, String mes, String ano, String nome, String desc) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nome = nome;
        this.desc = desc;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return desc;
    }
}