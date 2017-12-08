package hamburgueria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class Hamburgueria {

    private ArrayList<Mesa> mesas = new ArrayList<>();
    private Diretorio dir;

    private Integer contadorDeMesa;
    private Integer contadorDePedidos = 0;

    public Hamburgueria() throws IOException {
        dir = new Diretorio();
        lerDados();
        /*
            Essa classe sera responsavel por ler o txt e recriar o cenario.
            
         */

    }

    public List<Mesa> getMesa() {
        return mesas;
    }

    public void setMesa(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }

    public Diretorio getDir() {
        return dir;
    }

    public void setDir(Diretorio dir) {
        this.dir = dir;
    }

    public Integer getContadorDeMesa() {
        return contadorDeMesa;
    }

    public void setContadorDeMesa(Integer contadorDeMesa) {
        this.contadorDeMesa = contadorDeMesa;
    }

    public void maisMesa() {
        this.contadorDeMesa = this.contadorDeMesa + 1;
    }

    public Integer getContadorDePedidos() {
        return contadorDePedidos;
    }

    public void setContadorDePedidos(Integer contadorDePedidos) {
        this.contadorDePedidos = contadorDePedidos;
    }

    public void aumentarContadorDePedidos() {
        this.contadorDePedidos = this.contadorDePedidos + 1;
    }

    private void lerDados() throws FileNotFoundException {
        try {
            FileReader arq = null;
            String linha;
            arq = new FileReader("relatorio.txt");
            BufferedReader br = new BufferedReader(arq);
            StringBuilder sb = new StringBuilder();

            while ((linha = br.readLine()) != null) {
                String mesa = linha.split("|")[0];
                String[] items = linha.split("|")[1].split(";");
            }
        } catch (IOException ex) {
            Logger.getLogger(Hamburgueria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
