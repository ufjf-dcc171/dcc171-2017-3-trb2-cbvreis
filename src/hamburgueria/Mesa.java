
package hamburgueria;

import java.util.ArrayList;
import java.util.List;



public class Mesa {
    int codMesa = 1; 
    private List<Pedido> pedidos; 
    
    public Mesa(Integer i) {
        this.codMesa = i;
        this.pedidos = new ArrayList<>();
    }

    Mesa() {
    }

    public int getNumMesa() {
        return codMesa;
    }

    public void setNumMesa(int numMesa) {
        this.codMesa = numMesa;
    }

    @Override
    public String toString() {
        return "Mesa "+ this.codMesa;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
