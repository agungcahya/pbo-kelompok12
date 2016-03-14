package javaapplication2;


import javaapplication2.Dokter;
import javaapplication2.Pasien;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wewew
 */
public class DriverRumahSakit{
	public static void main(String args[]){
		
		
		Pasien P = new Pasien("REZA AMELIA",'P',20,"P01","ALZHAEMER","BUAH BATU");
		Dokter D = new Dokter("ANDRE",'L',20,"D01","OTAK");
		Ruangan R = new Ruangan("R01","Kelas1");
		R.tambahpasien(P,D,"SAKIT OTAK");
                R.getPasienInapIndex(0).addDiagnosa("Sakit Perut");
		
		R.getPasienInapIndex(0).getPasien().display();
                for(int i=0; i<R.getPasienInapIndex(0).getSizeDiagnosa(); i++){
                    System.out.println(R.getPasienInapIndex(0).getDiagnosa(i));
                }
                R.getPasienInapIndex(0).delDiagnosa(0);
                
                R.getPasienInapId("P01").getDokter().display();
                R.display();
                R.removePasienInapId("P01");
                R.display();
		//System.out.println("nn");
		//D.display();
		//System.out.println();
		//R.display();
	
		
	}
}
