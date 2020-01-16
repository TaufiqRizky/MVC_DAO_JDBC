/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.taufiqrizky.latihanmvcjdbc.event;

import edu.taufiqrizky.latihanmvcjdbc.entity.Pelanggan;
import edu.taufiqrizky.latihanmvcjdbc.model.PelangganModel;

/**
 *Nama  : Taufiq Rizky
 *NIM   : 10118080
 *Kelas : IF2
 * @author 
 */
public interface PelangganListener {
    
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    
    public void onDelete();
    
}
