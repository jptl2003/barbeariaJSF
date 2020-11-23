
package br.com.jptl.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Trabalho implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String tipo; 
    @ManyToMany
    private List<Cabeleireilo> cabeleireiros;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Cabeleireilo> getCabeleireiros() {
        return cabeleireiros;
    }

    public void setCabeleireiros(List<Cabeleireilo> cabeleireiros) {
        this.cabeleireiros = cabeleireiros;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.tipo);
        hash = 97 * hash + Objects.hashCode(this.cabeleireiros);
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
        final Trabalho other = (Trabalho) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.cabeleireiros, other.cabeleireiros)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return tipo + " - " + cabeleireiros.toString();
    }
    
}
