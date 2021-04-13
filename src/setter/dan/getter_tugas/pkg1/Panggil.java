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
public class Panggil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SetterGetter a = new SetterGetter();
        a.setNama("Mohammad Bagus Andin Prakoso");
        a.setUmur(25);
        a.setNamaMotor("Yamaha All New Vixion R");
        a.setKapasitasMesin(155);
        a.setNomorMesin("EX155RIUDO018");
        a.setNomorRangka("AZ8EX155JMGOP8642");
        
        String nama = a.getNama();
        int umur = a.umur();
        String motor = a.getNamaMotor();
        int kapasitas = a.getKapasitasMesin();
        String mesin = a.getNomorMesin();
        String rangka = a.getNomorRangka();
        
        System.out.println("Nama Pembeli    : " +nama);
        System.out.println("Umur Pembeli    : " +umur+ " tahun");
        System.out.println("Tipe Motor      : " +motor);
        System.out.println("Kapasitas Mesin : " +kapasitas+ " CC");
        System.out.println("Nomor Mesin     : " +mesin);
        System.out.println("Nomor Rangka    : " +rangka);
    }
    
}
