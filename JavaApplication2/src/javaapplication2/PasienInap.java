/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author wewew
 */

import java.util.ArrayList;

public class PasienInap {
	private Pasien pasien;
	private Dokter dokter;
	private ArrayList<String> diagnosa=new ArrayList<String>();
	
	public PasienInap(Pasien pasien, Dokter dokter, String diagnosa){
		setPasien(pasien);
		setDokter(dokter);
		addDiagnosa(diagnosa);
	}
	
	public void setDokter(Dokter dokter){
		this.dokter=dokter;
	}
	public Dokter getDokter(){
		return dokter;
	}
	public void addDiagnosa(String d){
		diagnosa.add(d);
	}
	public String getDiagnosa(int i){
                
		return diagnosa.get(i);
	}
        public int getSizeDiagnosa(){
            return diagnosa.size();
        }
	public void setPasien(Pasien pasien){
		this.pasien=pasien;
	}
	public Pasien getPasien(){
		return pasien;
	}
        public void delDiagnosa(int i){
            diagnosa.remove(i);
        }
}