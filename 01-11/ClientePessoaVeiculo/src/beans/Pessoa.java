/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;



import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author laboratorio
 */
public class Pessoa implements Serializable {
      private int id;
    private String nome;
    private String sexo;
    private String idioma;
    private Connection conn;
    
    
    public int getId() {
        return id;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String toString(){
        return this.id+" - "+this.nome;
    }
}
