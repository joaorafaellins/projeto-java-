import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tela33 extends  JFrame{

    public static void main(String[] args) {
        // Cria uma nova instância da classe JFrame, que representa a janela
        JFrame frame = new JFrame("Tela ");

        // Define o tamanho da janela
        frame.setSize(600, 300);

        // Define o comportamento ao fechar a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um painel para organizar os componentes
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        
        panel.setLayout(new GridLayout(5, 4, 10, 10));
        

        // Cria um rótulo (label)
        

        JLabel labelNome = new JLabel("Nome:");
         JTextField textFieldName = new JTextField(20);
         labelNome.setLabelFor(textFieldName);
         

        JLabel labelId = new JLabel("Id:");
        JTextField textFieldId = new JTextField(20);
        labelId.setLabelFor(textFieldId);  
        

        JLabel labelEmail = new JLabel("email:");
        JTextField textFieldEmail = new JTextField(20);
        labelEmail.setLabelFor(textFieldEmail); 
        

        JLabel labelSenha = new JLabel("Senha:");
        JTextField textFieldSenha = new JTextField(20);
        labelSenha.setLabelFor(textFieldSenha); 
        
        JButton updateButton = new JButton("Atualizar");

        


        // Adiciona um ouvinte de ação ao botão
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldName.setText("");
                textFieldId.setText("");
                textFieldEmail.setText("");
                textFieldSenha.setText("");
            }
        });

       
        

        // Cria um botão
        

        // Adiciona um ouvinte de ação ao botão
        

        // Adiciona o rótulo e o botão ao painel
        panel.add(labelNome);
        panel.add(textFieldName);
        panel.add(updateButton);;
        panel.add(labelId);
        panel.add(textFieldId);
        panel.add(new JLabel());
        panel.add(labelEmail);
        panel.add(textFieldEmail);
        panel.add(new JLabel());
        panel.add(labelSenha);
        panel.add(textFieldSenha);
        panel.add(new JLabel()); 
        
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // Layout para organizar os botões horizontalmente

        // Criar o botao voltar
        JButton button1 = new JButton("<<");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        JButton button2 = new JButton("<");
        JButton button3 = new JButton(">");
        JButton button4 = new JButton(">>");

        bottomPanel.add(button1);
        bottomPanel.add(button2);
        bottomPanel.add(button3);
        bottomPanel.add(button4);

        frame.setLayout(new BorderLayout());


        frame.add(panel, BorderLayout.CENTER); // Adiciona o painel principal na parte central
        frame.add(bottomPanel, BorderLayout.SOUTH);
        
        


        
        // Adiciona o painel à janela
        frame.add(panel);

        // Define a janela como visível
        frame.setVisible(true);
    }
}