
import br.com.jptl.dao.ClienteDAO;
import br.com.jptl.dao.HibernateUtil;
import br.com.jptl.vo.Cabeleireilo;
import br.com.jptl.vo.Cliente;
import br.com.jptl.vo.Produto;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaa
 */
public class Teste {
    public static void main (String [] args) throws ParseException{
        Cliente c = new Cliente();
        c.setNome("Calli");
        DateFormat f = DateFormat.getDateInstance();
        Date data2 = f.parse("24/06/2003");
        c.setDataNascimento(data2);
        c.setNumero("87 8888 8888");
        c.setEndereco("Rua bbb");
        // new ClienteDAO().salvar(c);
        String sql = "Select * from Cliente where nome like ?";
        String [] param = {"%i%"};
         
       for(Cliente a : new ClienteDAO().listar(sql, param)){
           System.out.println(a);
       }
        
       
    }
}
