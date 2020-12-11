package br.com.jptl.bean;

import br.com.jptl.dao.ClienteDAO;
import br.com.jptl.vo.Cliente;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class ClienteBean {
    private Cliente cliente;

    public ClienteBean(){
        cliente = new Cliente();
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String salvar(){
        new ClienteDAO().salvar(this.cliente);
        return "index.xhtml";
    }
}
