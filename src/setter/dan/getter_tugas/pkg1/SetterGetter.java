/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setter.dan.getter_tugas.pkg1;

/**
 *
 * @author MOKLET1
 */
public class SetterGetter {
    private String nama;
    private int umur;
    protected String namaMotor;
    protected int kapasitasMesin;
    protected String nomorMesin;
    protected String nomorRangka;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public int umur(){
        return umur;
    }

    public void setNamaMotor(String namaMotor){
        this.namaMotor = namaMotor;
    }
    
    public void setKapasitasMesin(int kapasitasMesin){
        this.kapasitasMesin = kapasitasMesin;
    }
    
    public int getKapasitasMesin(){
        return kapasitasMesin;
    }

    public String getNamaMotor(){
        return namaMotor;
    }
    
    public void setNomorMesin(String nomorMesin){
        this.nomorMesin = nomorMesin;
    }
    
    public String getNomorMesin(){
        return nomorMesin;
    }
    
    public void setNomorRangka(String nomorRangka){
        this.nomorRangka = nomorRangka;
    }
    
    public String getNomorRangka(){
        return nomorRangka;
    }
}
