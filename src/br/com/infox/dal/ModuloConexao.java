/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Leon
 */
public class ModuloConexao {

    //Método para estabelecer conexão com o d
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver"; 
        //armazenando informações referente ao db
        String url = "jdbc:mysql://localhost:3306/dbinfox"; ////?serverTimezone=UTC
        String user = "root";
        String password = "229k>D[y?wDEQsoZ";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //System.out.println(e);
            return null;
        }

    }
}
