/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.taufiqrizky.latihanmvcjdbc.main;

import edu.taufiqrizky.latihanmvcjdbc.database.BarbershopDatabase;
import edu.taufiqrizky.latihanmvcjdbc.entity.Pelanggan;
import edu.taufiqrizky.latihanmvcjdbc.error.PelangganException;
import edu.taufiqrizky.latihanmvcjdbc.service.PelangganDao;
import edu.taufiqrizky.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *Nama  : Taufiq Rizky
 *NIM   : 10118080
 *Kelas : IF2
 * @author 
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }

            }
        });


        
    }

}
