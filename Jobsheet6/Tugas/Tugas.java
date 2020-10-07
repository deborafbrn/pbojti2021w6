/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6.Tugas;

/**
 *
 * @author DEBORA
 */
public class Tugas {
     public static void main(String[] args) {
    
        Dosen d1 = new Dosen();
        d1.setNama("Bapak Dosen");
        d1.setSKS(12);
        
        Pegawai p1 = new Pegawai();
        p1.setNama("Bapak Pegawai");
        
        DaftarGaji daftar_gaji = new DaftarGaji(3);
        daftar_gaji.addPegawai(d1);
        daftar_gaji.addPegawai(p1);
        daftar_gaji.printSemuaGaji();
    }    
}
