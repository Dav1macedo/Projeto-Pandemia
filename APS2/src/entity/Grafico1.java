package entity;

import javax.swing.*;

import conexao.Conexao;

import java.awt.*;
import java.sql.*;

public class Grafico1 extends JFrame {

    private Connection connection;

    public Grafico1() {
        super("Relatórios");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Obtém a conexão com o banco de dados
        connection = Conexao.getconexao();

        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados!");
            System.exit(1); // Sai do programa se não conseguir conectar ao banco de dados
        }

        // Layout para os gráficos
        setLayout(new GridLayout(3, 1));

        // Gráfico A - Relatório de uma cidade
        JPanel panelA = new JPanel();
        panelA.setBorder(BorderFactory.createTitledBorder("Relatório de uma cidade"));
        // Consulta ao banco de dados para obter a quantidade de coletas e a população atual da cidade escolhida
        int Casos_Confirmados = 5; // Substituir pela consulta SQL para obter a quantidade de coletas
        int Casos_Descartados = 10; // Substituir pela consulta SQL para obter a população atual
        double percentual = Casos_Descartados != 0 ? ((double) Casos_Confirmados / Casos_Descartados) * 100 : 0;
        JLabel labelA = new JLabel("Quantidade de coletas: " + Casos_Confirmados + " | Percentual em relação à população atual: " + percentual + "%");
        panelA.add(labelA);
        add(panelA);

        // Gráfico B - Relatório de comparação entre duas cidades
        JPanel panelB = new JPanel();
        panelB.setBorder(BorderFactory.createTitledBorder("Relatório de comparação entre duas cidades"));
        // Substituir cidade1 e cidade2 pelos dados reais das cidades que você deseja comparar.
        String cidade1 = "Cidade1"; 
        String cidade2 = "Cidade2";
        JLabel labelB = new JLabel("Dados comparativos entre " + cidade1 + " e " + cidade2);
        panelB.add(labelB);
        add(panelB);

        // Gráfico C - Relatório de todas as cidades
        JPanel panelC = new JPanel();
        panelC.setBorder(BorderFactory.createTitledBorder("Relatório de todas as cidades"));
        // Substituir "SUA CONSULTA SQL AQUI" pela consulta SQL real para obter os dados comparativos entre as cidades!
        JLabel labelC = new JLabel("Dados comparativos entre as 5 cidades:");
        panelC.add(labelC);
        add(panelC);

        // Exibindo os gráficos
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Grafico1::new);
    }
}
