package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Carro;
import modelo.bean.Categoria;
import modelo.bean.Modelo;
import modelo.conexao.FabricaConexao;

public class CarroDao {
    
    PreparedStatement pstm;
    Connection conecta;
    ResultSet rs;
    String sql;
    
    public void inserir(Carro carro) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "insert into carro (carchassi,carplaca,carano,carcor,carstatus,carcatcodigo,carmodcodigo) values (?, ?, ?, ?, ?, ?, ?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, carro.getChassi());
        pstm.setString(2, carro.getPlaca());
        pstm.setInt(3, carro.getAno());
        pstm.setString(4, carro.getCor());
        pstm.setInt(5, carro.getStatus());
        pstm.setInt(6, carro.getCategoria().getCodigo());
        pstm.setInt(7, carro.getModelo().getCodigo());
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }
    
   
    public void alterar(Carro carro) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "update carro set carplaca=?, carano=?, carcor=?, carstatus=?, carcatcodigo=?, carmodcodigo=? where carchassi=? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, carro.getPlaca());
        pstm.setInt(2, carro.getAno());
        pstm.setString(3, carro.getCor());
        pstm.setInt(4, carro.getStatus());
        pstm.setInt(5, carro.getCategoria().getCodigo());
        pstm.setInt(6, carro.getModelo().getCodigo());
        pstm.setString(7, carro.getChassi());
        pstm.execute();

        System.out.println("Alterado");
        FabricaConexao.fecharConexao();
        
    }
    
        
    public Carro buscarChassi(String chassi) throws SQLException{
        Carro carro = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from carro join categoria on catcodigo = carcatcodigo join modelo on modcodigo = carmodcodigo where carchassi = ? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, chassi);
        rs = pstm.executeQuery();
        
        if(rs.next()){
            carro = new Carro();
            carro.setChassi(rs.getString("carchassi"));
            carro.setPlaca(rs.getString("carplaca"));
            carro.setAno(rs.getInt("carano"));
            carro.setCor(rs.getString("carcor"));
            carro.setStatus(rs.getInt("carstatus"));
            
            Categoria categoria = new Categoria();
            categoria.setCodigo(rs.getInt("catcodigo"));
            categoria.setNome(rs.getString("carnome"));
            categoria.setPrecoDiaria(rs.getDouble("carprecodiaria"));
            categoria.setDescricao(rs.getString("catdescricao"));
            carro.setCategoria(categoria);

            Modelo modelo = new Modelo();
            modelo.setCodigo(rs.getInt("modcodigo"));
            modelo.setDescricao(rs.getString("moddescricao"));
            carro.setModelo(modelo);
        }
        FabricaConexao.fecharConexao();
        
        return carro;
    }

    public void deletar(String chassi) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "delete from carro where carchassi =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, chassi);
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }
    
    public List<Carro> listar() throws SQLException{
        Carro carro = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from carro join categoria on catcodigo = carcatcodigo join modelo on modcodigo = carmodcodigo order by carchassi";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Carro> lista = new ArrayList<>();
        while(rs.next()){
            carro = new Carro();
            carro.setChassi(rs.getString("carchassi"));
            carro.setPlaca(rs.getString("carplaca"));
            carro.setAno(rs.getInt("carano"));
            carro.setCor(rs.getString("carcor"));
            carro.setStatus(rs.getInt("carstatus"));

            Categoria categoria = new Categoria();
            categoria.setCodigo(rs.getInt("catcodigo"));
            categoria.setNome(rs.getString("catnome"));
            categoria.setPrecoDiaria(rs.getDouble("catprecodiaria"));
            categoria.setDescricao(rs.getString("catdescricao"));
            carro.setCategoria(categoria);
            
            Modelo modelo = new Modelo();
            modelo.setCodigo(rs.getInt("modcodigo"));
            modelo.setDescricao(rs.getString("moddescricao"));
            carro.setModelo(modelo);
            
            lista.add(carro);
        }
        
        FabricaConexao.fecharConexao();
        return lista;
    }
    
    public List<Carro> buscar(String busca) throws SQLException{
        Carro carro = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from carro inner join categoria on catcodigo = carcatcodigo inner join modelo on modcodigo = carmodcodigo "
            + "where carchassi like '%"+busca+"%' or carplaca like '%"+busca+"%' or carano = '"+busca+"' or carcor like '%"+busca+"%' "
            + "or catdescricao like '%"+busca+"%' or moddescricao like '%"+busca+"%' order by carchassi";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Carro> lista = new ArrayList<>();
        while(rs.next()){
            carro = new Carro();
            carro.setChassi(rs.getString("carchassi"));
            carro.setPlaca(rs.getString("carplaca"));
            carro.setAno(rs.getInt("carano"));
            carro.setCor(rs.getString("carcor"));
            carro.setStatus(rs.getInt("carstatus"));

            Categoria categoria = new Categoria();
            categoria.setCodigo(rs.getInt("catcodigo"));
            categoria.setNome(rs.getString("catnome"));
            categoria.setPrecoDiaria(rs.getDouble("catprecodiaria"));
            categoria.setDescricao(rs.getString("catdescricao"));
            carro.setCategoria(categoria);
  
            Modelo modelo = new Modelo();
            modelo.setCodigo(rs.getInt("modcodigo"));
            modelo.setDescricao(rs.getString("moddescricao"));
            carro.setModelo(modelo);
            lista.add(carro);
        }
        FabricaConexao.fecharConexao();
        return lista;
    }
}
