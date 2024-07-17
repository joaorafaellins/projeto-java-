import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame {
    public Menu (){
        super("Meu Menu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


        JMenuBar menuBar = new JMenuBar();

        JMenu menuArquivo = new JMenu("Arquivo");

        JMenuItem itemNovo = new JMenuItem("criar");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemSair = new JMenuItem("Sair");

        menuArquivo.add(itemNovo);
        menuArquivo.add(itemAbrir);
        menuArquivo.add(itemSair);

        menuBar.add(menuArquivo);
        setJMenuBar (menuBar);

        itemSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ){
                System.exit(0);
            }
        });
    }
    

}
