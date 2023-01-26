package controller;

import sistema.DadosAdministrador;
import sistema.DadosCliente;
import sistema.DadosFuncionario;
import view.Tela_Adm;
import view.Tela_Funcionario;

import javax.swing.*;
import java.text.ParseException;

public class LoginController {
    DadosAdministrador dadosAdministrador = new DadosAdministrador();
    DadosFuncionario dadosFuncionario = new DadosFuncionario();

    public boolean verificarLoginAdm(String emailLogin, String senhaLogin) throws ParseException {

        boolean validador = dadosAdministrador.validarLogin(emailLogin, senhaLogin);
        if (validador == true) {
            JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao sistema!");
        } else {
            JOptionPane.showMessageDialog(null, "Email ou senha incorretos, digite novamente!");
        }
        return validador;
    }

    public boolean verificarLoginFuncionario(String emailLogin, String senhaLogin) {

        boolean validador = dadosFuncionario.validarLogin(emailLogin, senhaLogin);
        if (validador == true) {
            JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao sistema!");
        } else {
            JOptionPane.showMessageDialog(null, "Email ou senha incorretos, digite novamente!");
        }
        return validador;
    }

    public void abrirTelaAdm() throws ParseException {
        Tela_Adm tela_adm = new Tela_Adm();
    }

    public void abrirTelaFuncionario(){
        Tela_Funcionario tela_funcionario = new Tela_Funcionario();
    }
    public void iniciarBancoClientes() throws ParseException {

        DadosCliente.DadosPreCadastradosClientes(null, null, null, null, null, null);
    }
}
