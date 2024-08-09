/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author laboratorio
 */
public class PessoaJuridica extends Pessoa{
    
    String cnpj;
    String socio;
    String dAbertura;

    public PessoaJuridica(String cnpj, String socio, String dAbertura, String nome, int idade) {
        super(nome, idade);
        this.cnpj = cnpj;
        this.socio = socio;
        this.dAbertura = dAbertura;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSocio() {
        return socio;
    }

    public void setSocio(String socio) {
        this.socio = socio;
    }

    public String getdAbertura() {
        return dAbertura;
    }

    public void setdAbertura(String dAbertura) {
        this.dAbertura = dAbertura;
    }
    
    public void exibeMsg(){
        System.out.println("nome: "+nome);
        System.out.println("cnpj: "+cnpj);
        System.out.println("socio: "+socio);
        System.out.println("nome: "+nome);
        System.out.println("nome: "+nome);
        System.out.println("nome: "+nome);
    }
}
