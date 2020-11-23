
package br.com.jptl.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ProdutoVenda implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Produto produto;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Cabeleireilo cabelereiro;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataVenda;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cabeleireilo getCabelereiro() {
        return cabelereiro;
    }

    public void setCabelereiro(Cabeleireilo cabelereiro) {
        this.cabelereiro = cabelereiro;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.produto);
        hash = 79 * hash + Objects.hashCode(this.cliente);
        hash = 79 * hash + Objects.hashCode(this.cabelereiro);
        hash = 79 * hash + Objects.hashCode(this.dataVenda);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProdutoVenda other = (ProdutoVenda) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.cabelereiro, other.cabelereiro)) {
            return false;
        }
        if (!Objects.equals(this.dataVenda, other.dataVenda)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return cliente.toString() + " - " + produto.toString();
    }
    
    
}
