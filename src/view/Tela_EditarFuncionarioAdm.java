package view;

import javax.swing.*;

public class Tela_EditarFuncionarioAdm extends JFrame {
    private JPanel Tela_EditarFuncionarioAdm;
    private JButton voltarBtn;
    private JLabel tituloPagina;
    private JLabel tituloDados;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton editarFuncionÃ¡rioButton;
    private JButton excluirFuncionÃ¡rioButton;

    public Tela_EditarFuncionarioAdm() {
        setContentPane(Tela_EditarFuncionarioAdm);
        setTitle("FuncionÃ¡rio");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        view.Tela_EditarFuncionarioAdm telaFunc = new Tela_EditarFuncionarioAdm();
    }
}
