/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan52.siapakamu;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dsn = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        
        dsn.setNama("Rizki Adam");
        dsn.setNip("41227829930");
        dsn.setUmur(27);
        dsn.setMataKuliah("PBO");
        
        mhs.setNama("Rizki Restu");
        mhs.setNim("10118025");
        mhs.setUmur(19);
        mhs.setKelas("PBO");
        
        System.out.printf("NIP DOSEN : %s%n", dsn.getNip());
        dsn.siapaKamu();
        dsn.mengajarApa();
        
        System.out.printf("%n%n");
        
        System.out.printf("NIM Mahasiswa : %s%n", mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
        System.out.println("");
        
       
    }
    
}
