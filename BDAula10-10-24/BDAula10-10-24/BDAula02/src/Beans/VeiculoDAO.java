/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import Conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author laboratorio
 */
public class VeiculoDAO {
    
 private Conexao conexao;
    private Connection conn;

    public VeiculoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Veiculo veiculo) {
    String sql = "INSERT INTO veiculo (modelo, placa, id_pessoa) VALUES (?, ?, ?);";

    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, veiculo.getModelo());
        stmt.setString(2, veiculo.getPlaca());
        stmt.setInt(3, veiculo.getPessoaid().getId());

        stmt.execute();
    } catch (SQLException ex) {
        System.out.println("Erro ao inserir Veiculo: " + ex.getMessage());
    }
}
    
    public void editar(Veiculo veiculo) {
    try {
        String sql = "UPDATE veiculo set modelo=?, placa=?, id_pessoa=? WHERE id=?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, veiculo.getModelo());
        stmt.setString(2, veiculo.getPlaca());
        stmt.setInt(3, veiculo.getPessoaid().getId());
        stmt.setInt(4, veiculo.getId());

        stmt.execute();
    } catch (SQLException ex) {
        System.out.println("Erro ao atualizar Veiculo: " + ex.getMessage());
    }
}

    public void excluir(int id) {
    try {
        String sql = "delete from veiculo WHERE id=?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);

        stmt.execute();
    } catch (SQLException ex) {
        System.out.println("Erro ao excluir veiculo: " + ex.getMessage());
    }
   }
 
    public Veiculo getVeiculo(int id) {
    String sql = "SELECT * FROM pessoa WHERE id = ?";

    try {
        PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        
        Veiculo v = new Veiculo();

        if (rs.first()) { // Verifica se há resultados
            v.setId(id);
            v.setModelo(rs.getString("nome")); // Confirme se "nome" é o campo correto
            v.setPlaca(rs.getString("placa")); // Use o campo correto para placa
            v.setPessoaid(rs.getInt("pessoa_id")); // Ajuste conforme o tipo de dado esperado
            
            return v; // Retorne a variável correta
        } else {
            System.out.println("Nenhum veículo encontrado com o ID: " + id);
            return null;
        }
    } catch (SQLException ex) {
        System.out.println("Erro ao consultar Pessoa: " + ex.getMessage());
        return null;
    }
}

}

