package com.example.louisracoma300219314_csis3275002_final_part02;

import org.springframework.stereotype.Service;

import java.sql.DriverManager;
import java.sql.SQLException;
@Service
public class Connection123 {
    public java.sql.Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        java.sql.Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/savings", "root", "");

        return con1;
    }
}
