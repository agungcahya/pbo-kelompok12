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
		
		P.display();
		System.out.println();
		D.display();
		System.out.println();
		R.display();
	
		
	}
}
