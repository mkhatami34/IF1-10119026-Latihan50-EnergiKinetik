/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan50.energikinetik;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menghitung energi kinetik
 */
public class IF110119026Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKinetik energi = new EnergiKinetik();
        energi.setMassa(145.0);
        energi.setKecepatan(25.0);
        double massa = energi.getMassa();
        double kecepatan = energi.getKecepatan();
        System.out.println("Sebuah bola baseball dengan massa " + massa + " g dilempar dengan kecepatan " + kecepatan + " m/s");
        System.out.println("a.\t Berapakah energi kinetiknya ? " + energi.hitungEnergiKinetik(massa, kecepatan));
        System.out.println("b.\t Berapakah usaha yang dilakukan pada bola untuk mencapai kecepatan ini, jika dimulai dari keadaan diam? " + energi.hitungUsaha(0));
    }
    
}
