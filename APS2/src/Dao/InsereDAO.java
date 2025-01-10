package Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entity.ArmazenaDados;

public class InsereDAO {
    public void cadastrarDados(ArmazenaDados dados) {
        String sql = "INSERT INTO casos_dengue (Cidade, casos_confirmados, Obitos, Casos_Descartados) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = Conexao.getconexao().prepareStatement(sql);
            ps.setString(1, dados.getCidade());
            ps.setInt(2, dados.getCasos_Confirmados());
            ps.setInt(3, dados.getObitos());
            ps.setInt(4, dados.getCasos_Descartados());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void alterarDados(ArmazenaDados dados) {
        String sql = "UPDATE casos_dengue SET Cidade=?, casos_confirmados=?, Obitos=?, Casos_Descartados=? WHERE id=?";

        try {
            PreparedStatement ps = Conexao.getconexao().prepareStatement(sql);
            ps.setString(1, dados.getCidade());
            ps.setInt(2, dados.getCasos_Confirmados());
            ps.setInt(3, dados.getObitos());
            ps.setInt(4, dados.getCasos_Descartados());
            ps.setInt(5, dados.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


