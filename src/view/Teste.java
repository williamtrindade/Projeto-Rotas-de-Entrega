package view;

import java.util.ArrayList;
import model.*;

public class Teste {
    public static void main(String[] args) {
        //CLIENTES
        //1
        Cliente c1 = new Cliente();       
        c1.setNome("William");
        c1.setEndereco("Rua Jardim 189");
        c1.setLatitude("21.33332323");
        c1.setLongitude("21.3223134");      
        
        //2
        Cliente c2 = new Cliente();
        c2.setNome("Joao");
        c2.setEndereco("Rua pomica 22");
        c2.setLatitude("21.930203902");
        c2.setLongitude("21.3223134"); 
        
        //3
        Cliente c3 = new Cliente();
        c3.setNome("Luis");
        c3.setEndereco("Rua Iolanda 01");
        c3.setLatitude("21.33333333");
        c3.setLongitude("21.1100101"); 
        
        //4
        Cliente c4 = new Cliente();
        c4.setNome("Marcos");
        c4.setEndereco("Rua Otalina 02");
        c4.setLatitude("21.44444444");
        c4.setLongitude("21.3233322"); 
        
        //FUNCIONARIOS
        //1
        Funcionario f1 = new Funcionario();
        f1.setNome("Joaoz");
        f1.setSalario(1000.22);
        //2
        Funcionario f2 = new Funcionario();
        f2.setNome("Jonas");
        f2.setSalario(2222.22);
        
        //3
        Funcionario f3 = new Funcionario();
        f3.setNome("Lucas");
        f3.setSalario(2222.22);
        
        //LISTA DE CLIENTES
        //1
        ArrayList<Cliente> lc1  = new ArrayList();
        lc1.add(c1);
        lc1.add(c2);
        //2
        ArrayList<Cliente> lc2  = new ArrayList();
        lc1.add(c3);
        lc1.add(c4);
        
        //ROTAS
        //1
        Rota r1 = new Rota();
        r1.setNome("Rota 01");
        r1.setEntregador(f1);
        r1.setPontosEntrega(lc1);
        //2
        Rota r2 = new Rota();
        r2.setNome("Rota 02");
        r2.setEntregador(f3);
        r2.setPontosEntrega(lc2);

        //AREAS
        //1
        Area a1 = new Area();
        a1.setNome("Area 01");
        a1.adicionarRota(r1);
        a1.adicionarRota(r2);
        a1.setColaborador(f2);
        
        a1.imprimeArea(a1);
   
    }
}
