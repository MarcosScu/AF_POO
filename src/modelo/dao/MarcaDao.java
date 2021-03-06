package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Marca;
import modelo.conexao.FabricaConexao;

public class MarcaDao {

    PreparedStatement pstm;
    Connection conecta;
    ResultSet rs;
    String sql;
    
    public void inserir(Marca marca) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "insert into marca(mardescricao) values (?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, marca.getDescricao());
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }
    
    public void alterar(Marca marca) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "update marca set mardescricao= ? where marcodigo =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, marca.getDescricao());
        pstm.setInt(2, marca.getCodigo());
        pstm.execute();
        System.out.println("Alterado");
        FabricaConexao.fecharConexao();
        
    }
    
    public Marca buscarCodigo(int codigo) throws SQLException{
        Marca marca = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from marca where marcodigo = ?";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, codigo);
        rs = pstm.executeQuery();
        
        if(rs.next()){
            marca = new Marca();
            marca.setCodigo(rs.getInt("marcodigo"));
            marca.setDescricao(rs.getString("mardescricao"));
        }
        FabricaConexao.fecharConexao();
        
        return marca;
    }
    
    public void deletar(int codigo) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "delete from marca where marcodigo =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, codigo);
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }
    
    public List<Marca> listar() throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from marca";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Marca> lista = new ArrayList<>();
        while(rs.next()){
            Marca marca = new Marca();
            marca.setCodigo(rs.getInt("marcodigo"));
            marca.setDescricao(rs.getString("mardescricao"));
            lista.add(marca);
        }
        
        FabricaConexao.fecharConexao();
        return lista;
    } 
    
    public List<Marca> buscar(String busca) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from marca where marcodigo = '"+busca+"' or mardescricao like '%"+busca+"%' order by mardescricao";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Marca> lista = new ArrayList<>();
        while(rs.next()){
            Marca marca = new Marca();
            marca.setCodigo(rs.getInt("marcodigo"));
            marca.setDescricao(rs.getString("mardescricao"));
            lista.add(marca);
        }
        FabricaConexao.fecharConexao();
        return lista;
    }  
}
