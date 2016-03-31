
package javaapplication2;

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
    
    
   public void addPasien(String nama, char jenisKelamin, int umur, String id, String penyakit, String Alamat)
   {
        Pasien K = new Pasien(nama, jenisKelamin, umur, id, penyakit, Alamat);
          
            daftarpasien.add(K);
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
     
   public void DiagnosaBaru(String diagnosa) 
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
    
    public void removePasienInapIndex(int j)
    {
        daftarpasien.remove(j);
        j--;
    }
    
    // MENU
    
   public void menuSatu(String nama, char jenisKelamin, int umur, String id, String penyakit, String Alamat, String id_R, String id_D)
   
   {
       addPasien( nama,  jenisKelamin,  umur, id,  penyakit,  Alamat);
       Pasien p = getPasien(id);
       Dokter d= getDokter(id_D);
       Ruangan R = getRuangan(id_R);
       r = getRuangan(id_R);
       r.tambahpasien (getPasien(daftarpasien.size()), getDokter(id_D), String Diagnosa);
   }
   
   public void menuDua(String id)
   {
       getPasien(id);
       deletePasien(id);
   }
   
    public void menuTiga()
   {
       for(int d = 0; d < daftarDokter.size(); d++)
       {
           daftarDokter.get(d);
       }
   }
   
   public void menuEmpat()
   {
       for(int p = 0; p < daftarpasien.size(); p++)
       {
           daftarpasien.get(p);
       }
   }
      
   public void menuLima ()
   {
       for (int r = 0; r < daftarRuangan.size(); r++)
       {
           daftarRuangan.get(r);
       }
   }
   
   public void menuEnam (String nama, char jenisKelamin, int umur, String id, String spesialis)
   {
       addDokkter (nama, jenisKelamin, umur, id, spesialis);
   }
   
  public void menuTujuh (String id, String Type)
  {
      addRuangan(id, Type);
  }
  public void MainMenu() {
	
	String nama;
	char jenisKelamin;
	int umur, umurdokter;
	String id;
	String penyakit;
	String Alamat;
	String id_R, id_D;
	String Diagnosa;
	String spesialis;
	String Type;
	
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
	
	Scanner s = new Scanner (System.in);
	System.out.println("Pilih Menu : ");
	int pilih = s.nextInt();

	switch (pilih) {
		case 1 : 
			Scanner input = new Scanner (System.in);
			System.out.println("FORM CHECK-IN PASIEN");
			System.out.print("ID : ");
			id = input.next();
			System.out.println("");
			System.out.print("Nama Pasien : ");
			nama = input.next();
			System.out.println("");
			System.out.print("Usia : ");
			umur = input.nextInt();
			System.out.println("");
			System.out.print("Jenis Kelamin : ");
			jenisKelamin = input.nextChar();
			System.out.println("");
			System.out.print("Alamat : ");
			Alamat = input.next();
			System.out.println("");
			System.out.print("Keluhan : ");
			penyakit = input.next();
			System.out.println("");
			System.out.print("ID Dokter : ");
			id_D = input.next();
			System.out.println("");
			System.out.print("Diagnosa : ");
			Diagnosa = input.next();
			System.out.println("");
			System.out.print("ID Kamar : ");
			id_R = input.next();
			System.out.println("");
			menuSatu();
			break;
		case 2 :
			Scanner input = new Scanner (System.in);
			System.out.println("FORM CHECK-OUT PASIEN");
			System.out.print("ID : ");
			id = input.next();
			System.out.println("");
			menuDua();
			break;
		case 3 :
			menuTiga();
			System.out.println("DAFTAR DOKTER");
			System.out.println("ID : "+daftarDokter.get(i).getId());
			System.out.println("Nama : "+daftarDokter.get(i).getNama());
			System.out.println("Spesialis : "+daftarDokter.get(i).getSpesialis());
		case 4 :
			menuEmpat();
			System.out.println("DAFTAR PASIEN");
			System.out.println("ID : "+daftarPasien.get(i).getId());
			System.out.println("Nama : "+daftarPasien.get(i).getNama());
			System.out.println("Diagnosa : "+daftarPasien.get(i).getDiagnosa());
			System.out.println("Kamar : "+daftarRuangan.get(i).getId());
			break;
		case 5 :
			menuLima();
			System.out.println("DAFTAR KAMAR");
			System.out.println("No : "+daftarRuangan.get(i).getId());
			System.out.println("Status : "+daftarRuangan.get(i).getStatus());
			System.out.println("Jumlah Pasien : "+daftarRuangan.get(i).daftarPasienInap.size());
			break;
		case 6 :
			Scanner input = new Scanner (System.in);
			System.out.println("FORM TAMBAH DOKTER");
			System.out.print("ID : ");
			id_D = input.next();
			System.out.println("");
			System.out.print("Nama Lengkap : ");
			nama = input.next();
			System.out.println("");
			System.out.print("Jenis Kelamin : ");
			jenisKelamin = input.nextChar();
			System.out.println("");
			System.out.print("Umur : ");
			umur = input.nextInt();
			System.out.println("");
			System.out.print("Spesialis : ");
			spesialis = input.next();
			System.out.println("");
			menuEnam();
			break;
		case 7 : 
			Scanner input = Scanner (System.in);
			System.out.println("FORM TAMBAH RUANGAN");
			System.out.print("ID : ");
			id_R = input.next();
			System.out.println("");
			System.out.print("Type : ");
			Type = input.next();
			System.out.println("");
			menuTujuh();
			break;
	}
}
  
}
