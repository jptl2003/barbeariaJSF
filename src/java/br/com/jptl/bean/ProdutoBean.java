
package br.com.jptl.bean;

import br.com.jptl.dao.ProdutoDAO;
import br.com.jptl.vo.Produto;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProdutoBean {
    
    private Produto produto;
    
    public ProdutoBean(){
    produto = new Produto();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public String salvar(){
        new ProdutoDAO().salvar(this.produto);
        return "index.xhtml";
    }
}