package hamburgueria;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Hamburgueria {

        private ArrayList<Mesa> mesas = new ArrayList<>();
        private Diretorio dir;
 //       private MesaDAO mesasDAO = new MesaDAO();
 //       private ItemDAO itemDAO = new ItemDAO();
 //       private PedidoDAO pedidoDAO = new PedidoDAO();
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

    private void lerDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


