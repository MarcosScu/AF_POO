package modelo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Carro;
import modelo.bean.Conserto;
import modelo.bean.Categoria;
import modelo.bean.Modelo;
import modelo.bean.Oficina;
import modelo.conexao.FabricaConexao;

public class ConsertoDao {
    
    PreparedStatement pstm;
    Connection conecta;
    ResultSet rs;
    String sql;
    
    public void inserir(Conserto conserto) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        Date dataentradasql = new Date(conserto.getDataEntrada().getTime());
        sql = "insert into conserto (concodigo, condataentrada, condatasaida, concarchassi, conoficodigo) values (?, ?, ?, ?, ?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, conserto.getCodigo());
        pstm.setDate(2, (Date) dataentradasql);
        pstm.setDate(3, null);
        pstm.setString(4, conserto.getCarro().getChassi());
        pstm.setInt(5, conserto.getOficina().getCodigo());
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }
    
    public void alterar(Conserto conserto) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        
        sql = "update conserto set condataentrada=?, condatasaida=?, concarchassi=?, conoficodigo=? where concodigo=? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setDate(1, (Date) conserto.getDataEntrada());
        pstm.setDate(2, (Date) conserto.getDataSaida());
        pstm.setString(3, conserto.getCarro().getChassi());
        pstm.setInt(4, conserto.getOficina().getCodigo());
        pstm.setInt(5, conserto.getCodigo());
        pstm.execute();
        
        System.out.println("Alterado");
        FabricaConexao.fecharConexao();
        
    }
    
    public Conserto buscarCodigo(int codigo) throws SQLException{
        Conserto conserto = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from conserto join carro on carchassi = concarchassi join modelo on oficodigo = conoficodigo where concodigo = ? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, codigo);
        rs = pstm.executeQuery();
        
        if(rs.next()){
            conserto = new Conserto();
            conserto.setCodigo(rs.getInt("concodigo"));
            conserto.setDataEntrada(rs.getDate("condataentrada"));
            conserto.setDataSaida(rs.getDate("condatasaida"));
           
            Carro carro = new Carro();
            carro.setChassi(rs.getString("carchassi"));
            carro.setPlaca(rs.getString("carplaca"));
            carro.setAno(rs.getInt("carano"));
            carro.setCor(rs.getString("carcor"));
            carro.setStatus(rs.getInt("carstatus"));
            conserto.setCarro(carro);
            
            Oficina oficina = new Oficina();
            oficina.setCodigo(rs.getInt("oficodigo"));
            oficina.setNome(rs.getString("ofinome"));
            conserto.setOficina(oficina);
        }
        FabricaConexao.fecharConexao();
        
        return conserto;
    }

    public void deletar(int codigo) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "delete from conserto where concodigo =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, codigo);
        pstm.execute();
        FabricaConexao.fecharConexao();
    
    public List<Conserto> listar() throws SQLException{
        Conserto conserto = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from conserto join carro on carchassi = concarchassi join modelo on oficodigo = conoficodigo order by concodigo ";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Conserto> lista = new ArrayList<>();
        while(rs.next()){
            conserto = new Conserto();
            conserto.setCodigo(rs.getInt("concodigo"));
            conserto.setDataEntrada(rs.getDate("condataentrada"));
            conserto.setDataSaida(rs.getDate("condatasaida"));
            
            Carro carro = new Carro();
            carro.setChassi(rs.getString("carchassi"));
            carro.setPlaca(rs.getString("carplaca"));
            carro.setAno(rs.getInt("carano"));
            carro.setCor(rs.getString("carcor"));
            carro.setStatus(rs.getInt("carstatus"));
            conserto.setCarro(carro);
            
            Oficina oficina = new Oficina();
            oficina.setCodigo(rs.getInt("oficodigo"));
            oficina.setNome(rs.getString("ofinome"));
            conserto.setOficina(oficina);
            
            lista.add(conserto);
        }
        
        FabricaConexao.fecharConexao();
        return lista;
    }
    
    public List<Conserto> buscar(String busca) throws SQLException{
        Conserto conserto = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from conserto join carro on carchassi = concarchassi join oficina on oficodigo = conoficodigo "
            + "where concodigo = '"+busca+"' or carchassi like '%"+busca+"%' or carplaca like '%"+busca+"%' "
            + "or ofinome like '%"+busca+"%' order by concodigo";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Conserto> lista = new ArrayList<>();
        while(rs.next()){
            conserto = new Conserto();
            conserto.setCodigo(rs.getInt("concodigo"));
            conserto.setDataEntrada(rs.getDate("condataentrada"));
            conserto.setDataSaida(rs.getDate("condatasaida"));
            
            Carro carro = new Carro();
            carro.setChassi(rs.getString("carchassi"));
            carro.setPlaca(rs.getString("carplaca"));
            carro.setAno(rs.getInt("carano"));
            carro.setCor(rs.getString("carcor"));
            carro.setStatus(rs.getInt("carstatus"));
            conserto.setCarro(carro);
            
            Oficina oficina = new Oficina();
            oficina.setCodigo(rs.getInt("oficodigo"));
            oficina.setNome(rs.getString("ofinome"));
            conserto.setOficina(oficina);
            
            lista.add(conserto);
        }
        FabricaConexao.fecharConexao();
        return lista;
    }
}
