package com.api.board;

import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnectionTest {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private static final String URL = "jdbc:mysql://localhost:3306/guidb?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";

    private static final String USER = "root";

    private static final String PASSWORD = "1234";

    @Test
    public void testConnection() throws Exception {

        Class.forName(DRIVER);

        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connection" + connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}