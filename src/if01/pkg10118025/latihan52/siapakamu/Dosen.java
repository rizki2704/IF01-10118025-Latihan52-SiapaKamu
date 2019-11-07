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
public class Dosen extends Manusia{
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.printf("Saya %s umur %s tahun mengajar %s", nama, umur, mataKuliah);
    }

    @Override
    public void siapaKamu() {
        //super.siapaKamu(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Saya Dosen");
    }
    
}
