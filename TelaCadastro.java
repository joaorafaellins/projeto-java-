import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro {

    private JFrame janela;
    private JTextField campoId;
    private JTextField campoNome;
    private JTextField campoEmail;
    private JPasswordField campoSenha;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().criarGUI();
            }
        });
    }

    public void criarGUI() {
        // Criando a janela JFrame
        janela = new JFrame("Cadastro de Usuário");

        // Criando um painel para organizar os componentes
        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Margens entre os componentes

        // Rótulo e campo de ID
        JLabel rotuloId = new JLabel("ID:");
        campoId = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 0;
        painel.add(rotuloId, gbc);

        gbc.gridx = 1;
        painel.add(campoId, gbc);

        // Rótulo e campo de Nome
        JLabel rotuloNome = new JLabel("Nome:");
        campoNome = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 1;
        painel.add(rotuloNome, gbc);

        gbc.gridx = 1;
        painel.add(campoNome, gbc);

        // Rótulo e campo de Email
        JLabel rotuloEmail = new JLabel("Email:");
        campoEmail = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 2;
        painel.add(rotuloEmail, gbc);

        gbc.gridx = 1;
        painel.add(campoEmail, gbc);

        // Rótulo e campo de Senha
        JLabel rotuloSenha = new JLabel("Senha:");
        campoSenha = new JPasswordField(20);

        gbc.gridx = 0;
        gbc.gridy = 3;
        painel.add(rotuloSenha, gbc);

        gbc.gridx = 1;
        painel.add(campoSenha, gbc);

        // Botão para salvar os dados
        JButton botaoSalvar = new JButton("Salvar");
        botaoSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                salvarDados();
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        painel.add(botaoSalvar, gbc);

        // Adicionando o painel à janela
        janela.add(painel);

        // Ajustando tamanho da janela automaticamente
        janela.pack();

        // Centralizando a janela na tela
        janela.setLocationRelativeTo(null);

        // Tornando a janela visível
        janela.setVisible(true);
    }

    private void salvarDados() {
        String id = campoId.getText();
        String nome = campoNome.getText();
        String email = campoEmail.getText();
        String senha = new String(campoSenha.getPassword());

        // Exemplo de ação após salvar os dados:
        JOptionPane.showMessageDialog(janela,
                "Dados salvos:\nID: " + id + "\nNome: " + nome + "\nEmail: " + email + "\nSenha: " + senha,
                "Dados Salvos",
                JOptionPane.INFORMATION_MESSAGE);
    }
}