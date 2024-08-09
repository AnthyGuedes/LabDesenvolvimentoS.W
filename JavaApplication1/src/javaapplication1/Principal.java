package javaapplication1;


import javaapplication1.Onibus;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
public class Principal {
    public static void main(String[] args){
        Onibus o = new Onibus();
        
        o.setNome("Marcopolo");
        o.setModelo("TF-520");
        
        o.exibeMsg();
        
        System.err.println("o nome do modelo: "+o.getNome());
        System.err.println("o modelo do onibus: "+o.getModelo());
    }
}
