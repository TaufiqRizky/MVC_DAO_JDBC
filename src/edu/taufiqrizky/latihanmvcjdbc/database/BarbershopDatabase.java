/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.taufiqrizky.latihanmvcjdbc.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.taufiqrizky.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.taufiqrizky.latihanmvcjdbc.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *Nama  : Taufiq Rizky
 *NIM   : 10118080
 *Kelas : IF2
 * @author 
 */
public class BarbershopDatabase {

    private static Connection connection;
    private static PelangganDao pelangganDao;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/barbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }

    public static PelangganDao getPelangganDao() throws SQLException {
        if (pelangganDao == null) {
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
    }
}
