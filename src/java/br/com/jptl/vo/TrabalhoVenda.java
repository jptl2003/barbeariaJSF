
package br.com.jptl.vo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TrabalhoVenda implements Serializable{
    @Id
    @GeneratedValue
    private int id; 
    @ManyToOne 
    private Cliente cliente;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataTrabalho;
    private String tipoTrabalho;
    @ManyToMany
    private List<Cabeleireilo> cabeleiros;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataTrabalho() {
        return dataTrabalho;
    }

    public void setDataTrabalho(Date dataTrabalho) {
        this.dataTrabalho = dataTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public List<Cabeleireilo> getCabeleiros() {
        return cabeleiros;
    }

    public void setCabeleiros(List<Cabeleireilo> cabeleiros) {
        this.cabeleiros = cabeleiros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.cliente);
        hash = 53 * hash + Objects.hashCode(this.dataTrabalho);
        hash = 53 * hash + Objects.hashCode(this.tipoTrabalho);
        hash = 53 * hash + Objects.hashCode(this.cabeleiros);
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
        final TrabalhoVenda other = (TrabalhoVenda) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.tipoTrabalho, other.tipoTrabalho)) {
            return false;
        }
        if (!Objects.equals(this.dataTrabalho, other.dataTrabalho)) {
            return false;
        }
        if (!Objects.equals(this.cabeleiros, other.cabeleiros)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return cliente.toString() + " - " + tipoTrabalho + " - " + cabeleiros.toString(); 
    }
    
}