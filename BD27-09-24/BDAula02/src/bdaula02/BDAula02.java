/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bdaula02;

import Conexao.Conexao;
import Beans.Pessoa;
import Beans.PessoaDAO;
/**
 *
 * @author laboratorio
 */
public class BDAula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Conexao c = new Conexao();
        c.getConexao();
        
        Pessoa p = new Pessoa();
        p.setNome("Ricardo");
        p.setSexo("M");
        p.setIdioma("PT-BR");
        
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.inserir(p); 
    }
    
}
