
package br.com.jptl.bean;

import br.com.jptl.dao.CabeleireiloDAO;
import br.com.jptl.vo.Cabeleireilo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class CabeleireiloBean {
    private Cabeleireilo cabeleireilo;

    public CabeleireiloBean(){
        cabeleireilo = new Cabeleireilo();
    }

    public Cabeleireilo getCabeleireilo() {
        return cabeleireilo;
    }

    public void setCabeleireilo(Cabeleireilo cabeleireilo) {
        this.cabeleireilo = cabeleireilo;
    }
    
     public String salvar(){
        new CabeleireiloDAO().salvar(this.cabeleireilo);
        return "index.xhtml";
    }
    
}
