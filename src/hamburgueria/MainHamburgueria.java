package hamburgueria;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class MainHamburgueria {

    public static void main(String[] args) throws IOException {
        Controlador janela = new Controlador(getSamplaDate());
        janela.setSize(700, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    private static List<Mesa> getSamplaDate() throws IOException {
    
        Hamburgueria hamburgueria = new Hamburgueria();

        return hamburgueria.getMesa();
    }
     
}
