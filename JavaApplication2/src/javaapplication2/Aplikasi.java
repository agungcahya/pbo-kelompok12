
package javaapplication2;
import java.util.Scanner;
import java.util.ArrayList;
import javaapplication2.Dokter;
import javaapplication2.Pasien;
import javaapplication2.PasienInap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

public class Aplikasi {
    
    private ArrayList<Dokter> daftarDokter = new ArrayList<Dokter>();
    private ArrayList<Pasien> daftarpasien = new ArrayList<Pasien>();
    private ArrayList<Ruangan> daftarRuangan = new ArrayList<Ruangan>();

    public ArrayList<Dokter> getDaftarDokter() {
        return daftarDokter;
    }

    public ArrayList<Pasien> getDaftarpasien() {
        return daftarpasien;
    }

    public ArrayList<Ruangan> getDaftarRuangan() {
        return daftarRuangan;
    }
    
   public void addPasien(String nama, char jenisKelamin, int umur, String id, String penyakit, String Alamat)
   {
        Pasien P = new Pasien(nama, jenisKelamin, umur, id, penyakit, Alamat);
          
            daftarpasien.add(P);
            //K++;
   }
   
   public Pasien getPasien( String id)
   {
       Pasien P = null;
        for (int j = 0; j < daftarpasien.size(); j++) {
            if (id.equals(daftarpasien.get(j).getId())) {
                P = daftarpasien.get(j);
            } else {
                System.out.println("ID tidak ditemukan");
            }
        }
        return P;
    }
   
     public void deletePasien(String id)
   {
       for (int j = 0; j < daftarpasien.size(); j++) {
            if (id.equals(daftarpasien.get(j).getId())) 
            {
                daftarpasien.remove(j);
            } else 
            {
                System.out.println("ID tidak ditemukan");
            }
        }
         // i--;
   }
 
     // DOKTER : 
     
   public void addDokkter (String nama, char jenisKelamin, int umur, String id, String spesialis)
   {
       Dokter D = new Dokter(nama, jenisKelamin, umur, id, spesialis);
           daftarDokter.add(D);
           //D++;
   }
   
   public Dokter getDokter ( String id)
   {
       Dokter D = null;
        for (int j = 0; j < daftarDokter.size(); j++) {
            if (id.equals(daftarDokter.get(j).getId())) {
                D = daftarDokter.get(j);
            } else {
                System.out.println("ID tidak ditemukan");
            }
        }
        return D;
    }
   
    public void deleteDokter(String id)
   {
       for (int j = 0; j < daftarDokter.size(); j++) {
            if (id.equals(daftarDokter.get(j).getId())) 
            {
                daftarDokter.remove(j);
            } else 
            {
                System.out.println("ID tidak ditemukan");
            }
        }
       // i--;
   }
   
   //RUANGAN
   
   public void addRuangan(String id, String Type)
   {
       Ruangan R = new Ruangan (id, Type);
       daftarRuangan.add(R);
   }
   
   public Ruangan getRuangan(String id) // TANYA KAK ASPRAK
   {
       Ruangan R = null;
        for (int j = 0; j < daftarRuangan.size(); j++) {
            if (id.equals(daftarRuangan.get(j).getId())) {
                R = daftarRuangan.get(j);
            } else {
                System.out.println("Ruangan tidak ditemukan");
            }
        }
        return R;
   }
   
    public void deleteRuangan (String id)
   {
       for (int j = 0; j < daftarRuangan.size(); j++) {
            if (id.equals(daftarRuangan.get(j).getId())) 
            {
                daftarRuangan.remove(j);
            } else 
            {
                System.out.println("ID tidak ditemukan");
            }
        }
       // i--;
   }
  
    //DIAGNOSA
     
 /*  public void DiagnosaBaru(String diagnosa) 
   {
       for(int j = 0; j < daftarpasien.size(); j++)
       {
           if(id.equals(daftarpasien.get(j).get(Id)))
           {
             add(diagnosa);
           }
       }
    }
   
   public String getDiagnosaBaru(String id) 
   {
        for (int x = 0; x < daftarpasien.size(); x++) {
            if (id.equals(daftarpasien.get(x).getId())) {
                return diagnosa.get(x);
            } 
        }   
   }
   
   public void DeleteDiagnosaBaru()
   {
        for (int x = 0; x < daftarpasien.size(); x++) {
            if (id.equals(daftarpasien.get(x).getId())) {
                remove.daftarpasien(diagnosa);
            } 
        }
   }
    
     public PasienInap getPasienInapId(String Id) {
        PasienInap k = null;
        for (int j = 0; j < getRuangan(j).daftarpasieninap.size(); j++) {
            if (Id.equals(getRuangan(j).daftarpasieninap.get(j).getPasien().getId())) {
                k = getRuangan(j).daftarpasieninap.get(j);
            } else {
                System.out.println("ID tidak ditemukan");
            }
        }
        return k;
    }
    */
    
    public void removePasienInapId(String id)
    {
        for(int i=0;i<daftarRuangan.size();i++){
           if(daftarRuangan.get(i).getPasienInapId(id)!=null){
               daftarRuangan.get(i).removePasienInapId(id);
           }
        }
    }
    
    // MENU
    
   public void menuSatu(String nama, char jenisKelamin, int umur, String id, String penyakit, String Alamat, String id_R, String id_D, String diagnosa)
   
   {
       addPasien( nama,  jenisKelamin,  umur, id,  penyakit,  Alamat);
       Pasien p = getPasien(id);
       Dokter d= getDokter(id_D);
       Ruangan R = getRuangan(id_R);
       R.tambahpasien(p, d, diagnosa);
   }
   
   public void menuDua(String id)
   {
       getPasien(id);
       deletePasien(id);
       for(int i=0;i<daftarRuangan.size();i++){
           if(daftarRuangan.get(i).getPasienInapId(id)!=null){
               daftarRuangan.get(i).removePasienInapId(id);
           }
       }
   }
   
    public ArrayList<Dokter> menuTiga()
   {
       return daftarDokter;
   }
   
   public ArrayList<Pasien> menuEmpat()
   {
       return daftarpasien;
   }
      
   public ArrayList<Ruangan> menuLima ()
   {
       return daftarRuangan;
   }
   
   public void menuEnam (String nama, char jenisKelamin, int umur, String id, String spesialis)
   {
       addDokkter (nama, jenisKelamin, umur, id, spesialis);
   }
   
  public void menuTujuh (String id, String Type)
  {
      addRuangan(id, Type);
  }


  
  public void mainMenu() {
	
	String nama;
	char jenisKelamin;
	int umur, umurdokter, pilih=1;
	String id;
	String penyakit;
	String alamat;
	String id_R, id_D;
	String diagnosa;
	String spesialis;
	String Type;
	while (pilih!=0){
            System.out.println("==MENU RUMAH SAKIT==");
            System.out.println("=====================");
            System.out.println("");
            System.out.println("1. Check-in Pasien");
            System.out.println("2. Check-out Pasien");
            System.out.println("3. Lihat Dokter");
            System.out.println("4. Lihat Pasien");
            System.out.println("5. Lihat Kamar");
            System.out.println("6. Tambah Dokter");
            System.out.println("7. Tambah Ruangan");
            System.out.println("0. Keluar");
            Scanner s = new Scanner (System.in);
            System.out.println("Pilih Menu : ");
            pilih = s.nextInt();
            Scanner input = new Scanner (System.in);
            switch (pilih) {
                    case 1 : 
                            System.out.println("FORM CHECK-IN PASIEN");
                            System.out.print("ID : ");
                            id = input.next();
                            System.out.print("Nama Pasien : ");
                            nama = input.next();
                            System.out.print("Usia : ");
                            umur = input.nextInt();
                            System.out.print("Jenis Kelamin (L/P) : ");
                            jenisKelamin = input.next().charAt(0);
                            System.out.print("Alamat : ");
                            alamat = input.next();
                            System.out.print("Keluhan : ");
                            penyakit = input.next();
                            System.out.print("ID Dokter : ");
                            id_D = input.next();
                            System.out.print("Diagnosa : ");
                            diagnosa = input.next();
                            System.out.print("ID Kamar : ");
                            id_R = input.next();
                            menuSatu(nama, jenisKelamin, umur, id, penyakit, alamat, id_R, id_D, diagnosa);
                            break;
                    case 2 :
                            System.out.println("FORM CHECK-OUT PASIEN");
                            System.out.print("ID : ");
                            id = input.next();
                            System.out.println("");
                            menuDua(id);
                            break;
                    case 3 :
                            System.out.println("DAFTAR DOKTER");
                            ArrayList<Dokter> dokList=menuTiga();
                            for(int d = 0; d < dokList.size(); d++)
                            {
                                System.out.println("Id          : "+dokList.get(d).getId());
                                System.out.println("Nama        : "+dokList.get(d).getNama());
                                System.out.println("Spesialis   : "+dokList.get(d).getSpesialis());
                            }
                            break;
                    case 4 :
                            System.out.println("DAFTAR PASIEN");
                            ArrayList<Pasien> pasList=menuEmpat();
                            for(int p = 0; p < pasList.size(); p++)
                            {
                                System.out.println("Id          : "+pasList.get(p).getId());
                                System.out.println("Nama        : "+pasList.get(p).getNama());
                                System.out.println("Penyakit   : "+pasList.get(p).getPenyakit());
                                for(int i=0;i<daftarRuangan.size();i++){
                                    if(daftarRuangan.get(i).getPasienInapId(pasList.get(p).getId())!=null){
                                        System.out.println("Kamar       : "+daftarRuangan.get(i).getId());
                                    }
                                }
                            }
                            break;
                    case 5 :
                            System.out.println("DAFTAR KAMAR");
                            menuLima();
                            ArrayList<Ruangan> rList=menuLima();
                            for(int r = 0; r < rList.size(); r++)
                            {
                                System.out.println("Id          : "+rList.get(r).getId());
                                System.out.println("Type        : "+rList.get(r).getType());
                                System.out.println("Kapasitas   : "+rList.get(r).getKapasitas());
                                System.out.println("Availabel   : "+(rList.get(r).getKapasitas()-rList.get(r).i));                                
                            }
                            break;
                    case 6 :
                            System.out.println("FORM TAMBAH DOKTER");
                            System.out.print("ID : ");
                            id_D = input.next();
                            System.out.print("Nama Lengkap : ");
                            nama = input.next();
                            System.out.print("Jenis Kelamin (L/P): ");
                            jenisKelamin = input.next().charAt(0);
                            System.out.print("Umur : ");
                            umur = input.nextInt();
                            System.out.print("Spesialis : ");
                            spesialis = input.next();
                            menuEnam(nama, jenisKelamin, umur, id_D, spesialis);
                            break;
                    case 7 : 
                            System.out.println("FORM TAMBAH RUANGAN");
                            System.out.print("ID : ");
                            id_R = input.next();
                            System.out.print("Type (VVIP/VIP/1/2) : ");
                            Type = input.next();
                            menuTujuh(id_R, Type);
                            break;
            }
        }
    }
}
