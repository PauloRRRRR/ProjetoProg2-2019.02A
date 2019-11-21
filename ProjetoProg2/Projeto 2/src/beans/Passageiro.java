package beans;

import java.time.LocalDate;


public class Passageiro {
    private String nome;
    private LocalDate dataNascimento;
    private Passaporte passaporte;

    public Passageiro(String nome, LocalDate dataNascimento, String passaporte) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.passaporte.setCodigo(passaporte);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Passaporte getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(Passaporte passaporte) {
        this.passaporte = passaporte;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
