package hamburgueria;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Hamburgueria {

    public static void main(String[] args) {
        Controlador janela = new Controlador(getSamplaDate(),getDiretorio());
        janela.setSize(700, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    private static List<Mesa> getSamplaDate() {

        Mesa m1 = new Mesa(0);

        List<Mesa> lstMesas = new ArrayList<>();
        lstMesas.add(m1);
        return lstMesas;
    }
       private static FileWriter getDiretorio() {

        Diretorio controleRelatorio = new Diretorio();
        return  controleRelatorio.getArquivoFuncionamento();
    }
}
