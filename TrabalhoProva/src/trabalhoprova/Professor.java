/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoprova;

import javax.swing.JOptionPane;
import trabalhoprova.Usuario;

/**
 *
 * @author laboratorio
 */
public class Professor extends Usuario{
    protected String matricula;
    protected String areaFormacao;
    protected String alocacaoCurso;

    public Professor(String matricula, String areaFormacao, String alocacaoCurso, String nome, String datanasc, String sexo, String cpf, String rg, String rua, String numero, String bairro, String cidade, String cep, String estado, String telefone, String nomepai, String nomemae, String nacionalidade) {
        super(nome, datanasc, sexo, cpf, rg, rua, numero, bairro, cidade, cep, estado, telefone, nomepai, nomemae, nacionalidade);
        this.matricula = matricula;
        this.areaFormacao = areaFormacao;
        this.alocacaoCurso = alocacaoCurso;
    }

    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAreaFormacao() {
        return areaFormacao;
    }

    public void setAreaFormacao(String areaFormacao) {
        this.areaFormacao = areaFormacao;
    }

    public String getAlocacaoCurso() {
        return alocacaoCurso;
    }

    public void setAlocacaoCurso(String alocacaoCurso) {
        this.alocacaoCurso = alocacaoCurso;
    }
    
   @Override
    public void executaAcao() {
        JOptionPane.showMessageDialog(null,"o professor:"+nome+", foi inserido","salvo",JOptionPane.OK_OPTION);
    }
    
    @Override
    public Object[] obterDados() {
    return new Object[]{
        matricula, areaFormacao, alocacaoCurso, nome, datanasc, sexo, cpf, rg,
        rua, numero, bairro, cidade, cep, estado, telefone, nomepai, nomemae, nacionalidade
    };
}

}





