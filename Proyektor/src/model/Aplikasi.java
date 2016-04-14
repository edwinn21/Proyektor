/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Fitrilia
 */
public class Aplikasi {
    private Petugas[] daftarPetugas;
    private Anggota[] daftarAnggota;
    private Peminjaman[] daftarPeminjaman;
    private Proyektor[] daftarProyektor;
    private ArrayList<Petugas> listPetugas;
    private ArrayList<Anggota> listAnggota;
   
    public void addPetugas(Petugas p){
         listPetugas.add(p);
    }
    public void addAnggota(Anggota a){
        listAnggota.add(a);
    }
    public Anggota getAnggota(int id){
        for (Anggota a : listAnggota){
            if (a.getId() == id){
                return a;
            }
        }
        return null;
    }
    public void removeAnggota(int id){
        listAnggota.remove(getAnggota(id));
    }
}
