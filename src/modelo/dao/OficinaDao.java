package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Oficina;
import modelo.conexao.FabricaConexao;

public class OficinaDao {
    
    PreparedStatement pstm;
    Connection conecta;
    ResultSet rs;
    String sql;
    
    
    public void inserir (Oficina oficina) throws SQLException{
        
        conecta= FabricaConexao.conexaoBanco();
        sql = "insert into oficina(ofinome) values (?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, oficina.getNome());
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }
    
    public Oficina buscarCodigo(int oficodigo) throws SQLException{
        Oficina oficina = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from oficina where oficodigo = ?";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, oficodigo);
        rs = pstm.executeQuery();
        
        if(rs.next()){
            oficina = new Oficina();
            oficina.setCodigo(rs.getInt("oficodigo"));
            oficina.setNome(rs.getString("ofinome"));
        }
        FabricaConexao.fecharConexao();
        
        return oficina;
    }
    
    public void alterar(Oficina oficina) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "update oficina set ofinome= ? where oficodigo =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, oficina.getNome());
        pstm.setInt(2, oficina.getCodigo());
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }
    
    public void deletar(int oficodigo) throws SQLException{
        
        conecta = FabricaConexao.conexaoBanco();
        sql = "delete from oficina where oficodigo =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, oficodigo);
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }
    
    public List<Oficina> listar() throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from oficina";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Oficina> lista = new ArrayList<>();
        while(rs.next()){
            Oficina oficina = new Oficina();
            oficina.setCodigo(rs.getInt("oficodigo"));
            oficina.setNome(rs.getString("ofinome"));
            lista.add(oficina);
        }
        
        FabricaConexao.fecharConexao();
        return lista;
    }

    public List<Oficina> buscar(String busca) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from oficina where oficodigo = '"+busca+"' or ofinome like '%"+busca+"%' order by ofinome";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Oficina> lista = new ArrayList<>();
        while(rs.next()){
            Oficina oficina = new Oficina();
            oficina.setCodigo(rs.getInt("oficodigo"));
            oficina.setNome(rs.getString("ofinome"));
            lista.add(oficina);
        }
        FabricaConexao.fecharConexao();
        return lista;
    }   
}
