public class PasienInap {
	private Pasien pasien;
	private Dokter dokter;
	private String diagnosa;
	
	public PasienInap(Pasien pasien, Dokter dokter, String diagnosa){
		setPasien(pasien);
		setDokter(dokter);
		setDiagnosa(diagnosa);
	}
	
	public void setDokter(Dokter dokter){
		this.dokter=dokter;
	}
	public Dokter getDokter(){
		return dokter;
	}
	public void setDiagnosa(String diagnosa){
		this.diagnosa=diagnosa;
	}
	public String getDiagnosa(){
		return diagnosa;
	}
	public void setPasien(Pasien pasien){
		this.pasien=pasien;
	}
	public Pasien getPasien(){
		return pasien;
	}
}