/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author user
 */
public class Ruangan {

    private PasienInap[] daftarpasien;
    private String Id;
    private int Kapasitas;
    public int i;
    private String Type;

    public Ruangan(String Id, String Type) {
        this.Id = Id;
        setType(Type);
        if (Type == "VVIP") {
            this.Kapasitas = 1;
        } else if (Type == "VIP") {
            this.Kapasitas = 1;
        } else if (Type == "Kelas1") {
            this.Kapasitas = 3;
        } else if (Type == "Kelas2") {
            this.Kapasitas = 2;
        }
//this.Kapasitas = Kapasitas;
        daftarpasien = new PasienInap[Kapasitas];
        i = 0;
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
    }

    public String getType() {
        return Type;
    }

    public void tambahpasien(Pasien p, Dokter d, String Diagnosa) {
        if (i < Kapasitas) {
            PasienInap z = new PasienInap(p, d, Diagnosa);
            daftarpasien[i] = z;
            i++;
        } else {
            System.out.println("Sudah idak bisa menaambah pasien, ruangan penuh");
        }
    }

    public void display() {
        System.out.println("ID : " + getId());
        System.out.println("Type : " + getType());
        System.out.println("Kapasitas : " + getKapasitas());
        System.out.println("Available : " + (getKapasitas() - i));
    }
}
