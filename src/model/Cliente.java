package model;
import java.util.*;

public class Cliente extends Usuario {

    public Cliente(String email, String senha, String telefone, int opcaoUsuario) {
        super(email, senha, telefone, opcaoUsuario);
    }

    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;
    private Date inicioContrato;
    private Date fimContrato;

    public Cliente(String email, String senha, String telefone, int opcaoUsuario, String cnpj, String razaoSocial, String inscricaoEstadual, Date inicioContrato, Date fimContrato) {
        super(email, senha, telefone, opcaoUsuario);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
    }

    public void listarPedidos() {
        //Método de listagem
    }

}
