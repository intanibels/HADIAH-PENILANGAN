/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiah.penilangan;
import java.util.Scanner;
/**
 *
 * @author Intan
 */
public class HadiahPenilangan {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat Scanner
        Scanner input = new Scanner (System.in);
        String nama, tanggal, pelanggaran = null, ket = null;
        int harga = 0, bayar, kembali, kurang;
        //membuat judul
        System.out.println("\n PENILANGAN TATA TERTIB \n");
        //identitas
        System.out.print("Nama       : ");
        nama = input.nextLine();
        System.out.print("Tanggal    : ");
        tanggal = input.nextLine();
        //membuat pilihan
        System.out.println("Pilihan pelanggaran : ");
        String[] tilang = {" ", "Tidak Pakai Masker", "Tidak Membawa SIM", "Tidak Membawa STNK"};
        for(int a=1; a<tilang.length; a++){
            System.out.println(a+". "+tilang[a]);
        }System.out.print("Pelanggaran yang dilakukan : ");
        int pilihan = input.nextInt();
        //membuat program
        switch (pilihan) {
            case 1:
                pelanggaran = "Tidak Pakai Masker";
                System.out.println("Anda akan dikenakan denda sebesar 100.000");
                System.out.print("Pembayaran sebesar: ");
                bayar = input.nextInt();
                harga = 100000;
                if(bayar==harga){
                    System.out.println("Uang Anda Pas, Jangan Lupa memakai masker lagi ya !");
                    ket = "Lunas";
                }else if(bayar>harga){
                    kembali = bayar-harga;
                    System.out.println("Kembalian sebesar "+kembali);
                    System.out.println("Jangan Lupa memakai masker lagi ya !");
                    ket = "Lunas";
                }else if(bayar<harga){
                    kurang = harga-bayar;
                    System.out.println("Pembayaran anda kurang "+kurang);
                    System.out.println("Anda tidak boleh pergi !");
                    ket = "Belum Lunas";
                }   break;
            case 2:
                pelanggaran = "Tidak membawa SIM";
                System.out.println("Anda akan dikenakan denda sebesar 50.000");
                System.out.print("Pembayaran sebesar: ");
                bayar = input.nextInt();
                harga = 50000;
                if(bayar==harga){
                    System.out.println("Uang Anda Pas, Jangan Lupa membawa SIM lagi ya !");
                    ket = "Lunas";
                }else if(bayar>harga){
                    kembali = bayar-harga;
                    System.out.println("Kembalian sebesar "+kembali);
                    System.out.println("Jangan Lupa membawa SIM lagi ya !");
                    ket = "Lunas";
                }else if(bayar<harga){
                    kurang = harga-bayar;
                    System.out.println("Pembayaran anda kurang "+kurang);
                    System.out.println("Anda tidak boleh pergi !");
                    ket = "Belum Lunas";
                }   break;
            case 3:
                pelanggaran = "Tidak Membawa STNK";
                System.out.println("Anda akan dikenakan denda sebesar 500.000");
                System.out.print("Pembayaran sebesar: ");
                bayar = input.nextInt();
                harga = 500000;
                if(bayar==harga){
                    System.out.println("Uang Anda Pas, Jangan Lupa membawa STNK lagi ya !");
                    ket = "Lunas";
                }else if(bayar>harga){
                    kembali = bayar-harga;
                    System.out.println("Kembalian sebesar "+kembali);
                    System.out.println("Jangan Lupa membawa STNK lagi ya !");
                    ket = "Lunas";
                }else if(bayar<harga){
                    kurang = harga-bayar;
                    System.out.println("Pembayaran anda kurang "+kurang);
                    System.out.println("Anda tidak boleh pergi !");
                    ket = "Belum Lunas";
                }   break;
            default:
                System.out.println("Kode yang anda masukkan salah");
                break;
        }
        //Surat Tilang
        System.out.println("----------------------------------------");
        System.out.println("\n SURAT TILANG \n");
        System.out.println("Nama Pengendara : "+nama);
        System.out.println("Tanggal         : "+tanggal);
        System.out.println("Pelanggaran yang dilakukan adalah "+pelanggaran);
        System.out.println("Total Denda     : "+harga);
        System.out.println("Keterangan      : "+ket);
    }
}