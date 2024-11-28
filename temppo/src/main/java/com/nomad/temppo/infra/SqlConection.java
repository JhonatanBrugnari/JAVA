package com.nomad.temppo.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConection {

    public static String status = "Não conectou...";

    public SqlConection() {
    }

    public static java.sql.Connection getConexaoMySQL() {
        Connection connection = null;

        String driverName = "jdbc.postgresql.org";

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Endereço do servidor do BD
        String serverName = "database-1.cbmwm0m6g3bp.us-east-2.rds.amazonaws.com";

        
        String mydatabase = "database-1";

        // String de Conexão.
        String url = "database-1.cbmwm0m6g3bp.us-east-2.rds.amazonaws.com" + serverName + "/" + mydatabase;

        
        String username = "postgres";

        // A senha de acesso do usuário informado acima.
        String password = "carlinhoscavalos2050";

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;

    }
}
