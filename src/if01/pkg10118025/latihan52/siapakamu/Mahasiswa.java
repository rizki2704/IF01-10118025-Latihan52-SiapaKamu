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
public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.printf("Saya %s umur %s tahun sedang belajar %s", nama, umur, kelas);
    }

    @Override
    public void siapaKamu() {
        //super.siapaKamu(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Saya Mahasiswa");
    }
    
}
