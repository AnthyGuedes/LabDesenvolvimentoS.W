/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoprova;

import trabalhoprova.Usuario;
import trabalhoprova.Usuario;

/**
 *
 * @author laboratorio  qs
 */
public class Aluno extends Usuario {
    protected String matricula;
    protected String cursoGraduacao;

    public Aluno(String matricula, String cursoGraduacao, String nome, String datanasc, String sexo, String cpf, String rg, String rua, String numero, String bairro, String cidade, String cep, String estado, String telefone, String nomepai, String nomemae, String nacionalidade) {
        super(nome, datanasc, sexo, cpf, rg, rua, numero, bairro, cidade, cep, estado, telefone, nomepai, nomemae, nacionalidade);
        this.matricula = matricula;
        this.cursoGraduacao = cursoGraduacao;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCursoGraduacao() {
        return cursoGraduacao;
    }

    public void setCursoGraduacao(String cursoGraduacao) {
        this.cursoGraduacao = cursoGraduacao;
    }
    
    @Override
    public void executaAcao(){
        System.out.println("aluno: "+getNome()+" foi inserido");
    }
    
    @Override
    public Object[] obterDados() {
    return new Object[]{
        matricula, cursoGraduacao, nome, datanasc, sexo, cpf, rg,
        rua, numero, bairro, cidade, cep, estado, telefone, nomepai, nomemae, nacionalidade
    };
}

    
}
