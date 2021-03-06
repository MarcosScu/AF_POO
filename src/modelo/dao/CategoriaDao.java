package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Categoria;
import modelo.conexao.FabricaConexao;

public class CategoriaDao {
    
    PreparedStatement pstm;
    Connection conecta;
    ResultSet rs;
    String sql;
    
   public void inserir(Categoria categoria) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "insert into categoria(catnome, catprecodiaria, catdescricao) values (?, ?, ?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, categoria.getNome());
        pstm.setDouble(2, categoria.getPrecoDiaria());
        pstm.setString(3, categoria.getDescricao());
        pstm.execute();
    
        FabricaConexao.fecharConexao();
        
    }
   
   public Categoria buscarCodigo(int codigo) throws SQLException{
        Categoria categoria = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from categoria where catcodigo = ?";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, codigo);
        rs = pstm.executeQuery();
        
        if(rs.next()){
            categoria = new Categoria();
            categoria.setCodigo(rs.getInt("catcodigo"));
            categoria.setNome(rs.getString("catnome"));
            categoria.setPrecoDiaria(rs.getDouble("catprecodiaria"));
            categoria.setDescricao(rs.getString("catdescricao"));
        }
        FabricaConexao.fecharConexao();
        
        return categoria;
    }
    
    public void alterar(Categoria categoria) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "update categoria set catnome=?, catprecodiaria=?, catdescricao=? where catcodigo=? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, categoria.getNome());
        pstm.setDouble(2, categoria.getPrecoDiaria());
        pstm.setString(3, categoria.getDescricao());
        pstm.setInt(4, categoria.getCodigo());       
        pstm.execute();
       
        FabricaConexao.fecharConexao();
    
    }
    
    public void deletar(int catcodigo) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "delete from categoria where catcodigo =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, catcodigo);
        pstm.execute();
        
        FabricaConexao.fecharConexao();
        
    }

    public List<Categoria> listar() throws SQLException{                  
        List<Categoria> lista = new ArrayList<>();
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from categoria order by catnome ";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        
        while(rs.next()){
            Categoria categoria = new Categoria();
            categoria.setCodigo(rs.getInt("catcodigo"));
            categoria.setNome(rs.getString("catnome"));
            categoria.setDescricao(rs.getString("catdescricao"));
            categoria.setPrecoDiaria(rs.getDouble("catprecodiaria"));
            lista.add(categoria);
        }
        
        FabricaConexao.fecharConexao();
        return lista;
    } 
    
    public List<Categoria> buscar(String busca) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from categoria where catcodigo = '"+busca+"' or catnome like '%"+busca+"%' or catprecodiaria = '"+busca+"' or catdescricao like '%"+busca+"%' order by catnome ";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Categoria> lista = new ArrayList<>();
        while(rs.next()){
            Categoria categoria = new Categoria();
            categoria.setCodigo(rs.getInt("catcodigo"));
            categoria.setNome(rs.getString("catnome"));
            categoria.setPrecoDiaria(rs.getDouble("catprecodiaria"));
            categoria.setDescricao(rs.getString("catdescricao"));
            lista.add(categoria);
        }
        FabricaConexao.fecharConexao();
        return lista;
    }
}

