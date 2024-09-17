/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bdaula01;

import Conexao.Conexao;
import beans.Pessoa;
import beans.PessoaDAO;

/**
 *
 * @author laboratorio
 */
public class JavaBD01 {
    public static void main(String[] args){
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
