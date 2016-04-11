/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Ruangan {

    private ArrayList<PasienInap> daftarpasien = new ArrayList<PasienInap>();
    private String Id;
    private int Kapasitas;
    public int i;
    private String Type;

    public Ruangan(String Id, String Type) {
        this.Id = Id;
        setType(Type);
//this.Kapasitas = Kapasitas;
        // daftarpasien = new PasienInap[Kapasitas];
        // i = 0;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getId() {
        return Id;
    }

    public void setKapasitas(int Kapasitas) {
        this.Kapasitas = Kapasitas;
    }

    public int getKapasitas() {
        return Kapasitas;
    }

    public void setType(String Type) {
        this.Type = Type;
        if ("VVIP".equals(Type)) {
            setKapasitas(1);
        } else if ("VIP".equals(Type)) {
            setKapasitas(1);
        } else if ("1".equals(Type)) {
            setKapasitas(3);
        } else if ("2".equals(Type)) {
            setKapasitas(2);
        }
    }

    public String getType() {
        return Type;
    }

    public void tambahpasien(Pasien p, Dokter d, String Diagnosa) {
        if (i < Kapasitas) {
            PasienInap z = new PasienInap(p, d, Diagnosa);
            daftarpasien.add(z);
            //daftarpasien[i] = z;
            i++;
        } else {
            System.out.println("Tidak bisa menambah pasien, ruangan penuh");
        }
    }

    public PasienInap getPasienInapIndex(int j) {
        return daftarpasien.get(j);
    }

    public PasienInap getPasienInapId(String Id) {
        PasienInap k = null;
        for (int j = 0; j < daftarpasien.size(); j++) {
            if (Id.equals(daftarpasien.get(j).getPasien().getId())) {
                k= daftarpasien.get(j);
            } else {
                System.out.println("ID tidak ditemukan");
            }
        }
        return k;
    }
    
    public void removePasienInapIndex(int j)
    {
        daftarpasien.remove(j);
        i--;
    }
    
    public void removePasienInapId(String Id)
    {
          
        for (int j = 0; j < daftarpasien.size(); j++) {
            if (Id.equals(daftarpasien.get(j).getPasien().getId())) 
            {
                daftarpasien.remove(j);
            } else 
            {
                System.out.println("ID tidak ditemukan");
            }
        }
        i--;
    }

    /*
    public void display() {
        System.out.println("ID : " + getId());
        System.out.println("Type : " + getType());
        System.out.println("Kapasitas : " + getKapasitas());
        System.out.println("Available : " + (getKapasitas() - i));
    }
    */
}
