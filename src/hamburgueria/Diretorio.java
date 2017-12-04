package hamburgueria;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Diretorio {

    private File arquivo = new File("relatorio.txt");
    private FileWriter arquivoRelatorio;

    public Diretorio() {
        if (!arquivo.exists()) {
            try {
                arquivoRelatorio = new FileWriter("relatorio.txt");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao criar o diretorio");
            }
        }
    }

    public FileWriter getArquivoFuncionamento() {
        return arquivoRelatorio;
    }

    public void setArquivoFuncionamento(FileWriter arquivoRelatorio) {
        this.arquivoRelatorio = arquivoRelatorio;
    }

}
