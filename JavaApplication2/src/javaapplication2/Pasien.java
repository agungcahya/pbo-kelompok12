/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author MahersyaEva Herminda
 */
public class Pasien extends Orang {
	private String penyakit;
	private String alamat;
	
	public Pasien (String nama, char jenisKelamin, int umur, String id, String penyakit, String alamat) {
		super (nama, jenisKelamin, umur, id);
		setPenyakit (penyakit);
		setAlamat (alamat);
	}
	public void setPenyakit (String penyakit) {
		this.penyakit = penyakit;
	}
	public String getPenyakit() {
		return penyakit;
	}
	public void setAlamat (String alamat) {
		this.alamat = alamat;
	}
	public String getAlamat() {
		return alamat;
	}
	public void display() {
		System.out.println("==DATA PASIEN==");
		System.out.println("Nama			: "+super.getNama());
		System.out.println("Jenis Kelamin	: "+super.getJenisKelamin());
		System.out.println("Umur			: "+super.getUmur());
		System.out.println("ID				: "+super.getId());
		System.out.println("Penyakit		: "+getPenyakit());
		System.out.println("Alamat			: "+getAlamat());
	}
}
